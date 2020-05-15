package abstractfactorypattern;

/**
 * @author: XPH
 * 创建日期:2020/5/15-14:56
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
