package adapterpattern.objectadapter;

/**
 * @author: XPH
 * 创建日期:2020/5/15-16:49
 */
public class Main {

    public static void main(String[] args) {
        Adapter target = new Adapter();
        target.setAdaptee(new Adaptee());
        int a = target.cal(1,2);
        System.out.println(a);
    }
}
