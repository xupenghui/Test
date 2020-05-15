package singletonpattern;

/**
 * @author: XPH
 * 创建日期:2020/5/15-15:07
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingObject object = SingObject.getIntance();
        object.showMessage();
    }
}
