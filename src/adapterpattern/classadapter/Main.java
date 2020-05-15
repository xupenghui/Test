package adapterpattern.classadapter;

import adapterpattern.classadapter.Adapter;
import adapterpattern.classadapter.Target;

/**
 * @author: XPH
 * 创建日期:2020/5/15-16:28
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adapter();
        int a = target.cal(2,3);
        System.out.println(a);
    }
}
