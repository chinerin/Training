package javaEEDay11.classDemo_2;

/**
 * @PackageName:javaEEDay11.classDemo_2
 * @ClassName:Demo
 * @Description:    包子练习测试类
 * @author: CK
 * @data: 2020/7/7 17:40
 */
public class Demo {
    public static void main(String[] args){
        Baozi baozi = new Baozi();

        Cook cook = new Cook(baozi);
        cook.start();
        Fooder fooder = new Fooder(baozi);
        fooder.start();

    }
}
