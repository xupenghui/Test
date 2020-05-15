package abstractfactorypattern.color;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:45
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
