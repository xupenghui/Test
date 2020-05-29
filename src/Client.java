import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author: XPH
 * 创建日期:2020/5/28-10:02
 */
public class Client {


    public static final int port = 8080;
    public static final String host = "localhost";
    public static void main(String[] args) {
        System.out.println("Client Start...");
        while (true) {
            Socket socket = null;
            try {
                //创建一个流套接字并将其连接到指定主机上的指定端口号
                socket = new Socket(host,port);
                //读取服务器端数据
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //向服务器端发送数据
                PrintStream out = new PrintStream(socket.getOutputStream());
                System.out.print("请输入: \t");
                String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
                out.println(str);
                out.close();
            } catch (Exception e) {
                System.out.println("客户端异常:" + e.getMessage());
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        socket = null;
                        System.out.println("客户端 finally 异常:" + e.getMessage());
                    }
                }
            }
        }
    }


}
