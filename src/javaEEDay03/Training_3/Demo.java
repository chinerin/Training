package javaEEDay03.Training_3;

/**
 * @PackageName:JavaEEDay03.Training_3
 * @ClassName:Demo
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:49
 */

/**
 * 多态测试类
 */
public class Demo {

    public static void main(String[] args){
        Animal animal = new Cat();
        animal.eat();
        ((Cat) animal).catchMouse();
    }

}
