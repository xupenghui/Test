package abstractfactorypattern;

import abstractfactorypattern.color.Color;
import factorypattern.Shape;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:40
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
