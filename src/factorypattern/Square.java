package factorypattern;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:24
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
