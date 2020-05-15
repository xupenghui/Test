package singletonpattern;

/**
 * @author: XPH
 * 创建日期:2020/5/15-15:05
 */
public class SingObject {

    private static SingObject intance = new SingObject();

    private SingObject(){};

    public static SingObject getIntance(){
        return intance;
    }

    public void showMessage(){
        System.out.println("hello world!");
    }
}
