package JavaEEDay03.Training_2;

/**
 * @PackageName:JavaEEDay03.Training_2
 * @ClassName:Demo
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:40
 */

/**
 * 车系测试类
 */
public class Demo {

    public static void main(String[] args){
        Benz benz = new Benz();
        benz.run();
        BMW bmw = new BMW();
        bmw.run();
        bmw.toGps();
    }

}
