package abstractfactorypattern.shape;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:26
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
