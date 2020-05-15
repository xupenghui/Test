package abstractfactorypattern;

import abstractfactorypattern.color.Color;
import factorypattern.Circle;
import factorypattern.Rectangle;
import factorypattern.Shape;
import factorypattern.Square;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:49
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null){
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
