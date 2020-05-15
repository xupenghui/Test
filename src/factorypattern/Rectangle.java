package factorypattern;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:22
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
