package adapterpattern.objectadapter;

/**
 * @author: XPH
 * 创建日期:2020/5/15-16:47
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int cal(int a, int b) {
        return adaptee.calculate(a,b);
    }
}
