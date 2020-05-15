package abstractfactorypattern.color;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:44
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
