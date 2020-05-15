package abstractfactorypattern.color;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:43
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
