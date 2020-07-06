package javaEEDay10.training_2;

/**
 * @PackageName:JavaEEDay10.Training_2
 * @ClassName:Demo
 * @Description:
 * @author: CK
 * @data: 2020/7/6 20:24
 */
public class Demo {
    public static void main(String[] args){

        new Thread(new MyThread()).start();

        for(int i = 1; i <= 1000; i++){
            System.out.println("main: " + i);
        }
    }
}
