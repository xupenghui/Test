package abstractfactorypattern;

import abstractfactorypattern.color.Blue;
import abstractfactorypattern.color.Color;
import abstractfactorypattern.color.Green;
import abstractfactorypattern.color.Red;
import factorypattern.Shape;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:53
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color == null){
            return null;
        }
        if (color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }


        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
