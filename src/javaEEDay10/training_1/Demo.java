package javaEEDay10.training_1;

/**
 * @PackageName:JavaEEDay10.Training_1
 * @ClassName:Demo
 * @Description:
 * @author: CK
 * @data: 2020/7/6 20:20
 */
public class Demo {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();

        for(int i = 0; i < 1000; i++){
            System.out.println("main方法: " + i);
        }
    }
}
