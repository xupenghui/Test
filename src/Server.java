import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: XPH
 * 创建日期:2020/5/14-17:07
 */
public class Server {

    public static final int port = 22168;

    public static void main(String[] args) {


        System.out.println("Server...\n");
        Server server = new Server();
        server.init();
    }

    public void init() {
        try {
            //创建一个ServerSocket，这里可以指定连接请求的队列长度
            //new ServerSocket(port,3);意味着当队列中有3个连接请求是，如果Client再请求连接，就会被Server拒绝
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                //从请求队列中取出一个连接
                Socket client = serverSocket.accept();
                // 处理这次连接
                new HandlerThread(client);
            }
        } catch (Exception e) {
            System.out.println("服务器异常: " + e.getMessage());
        }
    }

    private class HandlerThread implements Runnable {
        private Socket socket;
        public HandlerThread(Socket client) {
            socket = client;
            new Thread(this).start();
        }

        public void run() {
            try {
                // 读取客户端数据
                InputStream inputStream = socket.getInputStream();
                byte[] tempbytes = new byte[1024];
                int byteread = 0;
                StringBuffer sb = new StringBuffer();

                while ((byteread = inputStream.read(tempbytes)) != -1) {
                    //  System.out.write(tempbytes, 0, byteread);
                    String str = new String(tempbytes, 0, byteread);
                    System.out.print(str);
                }
                inputStream.close();
            } catch (Exception e) {
                System.out.println("服务器 run 异常: " + e.getMessage());
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        socket = null;
                        System.out.println("服务端 finally 异常:" + e.getMessage());
                    }
                }
            }
        }
    }
}
