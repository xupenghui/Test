package adapterpattern.classadapter;

/**
 * @author: XPH
 * 创建日期:2020/5/15-16:25
 */
public class Adapter extends  Adaptee implements Target{
    @Override
    public int cal(int a, int b) {
        return this.calculate(a,b);
    }
}
