package javaEEDay08.training_3;

/**
 * @PackageName:JavaEEDay08.Training_3
 * @ClassName:TestDemo
 * @Description:
 * @author: CK
 * @data: 2020/7/5 9:00
 */
public class TestDemo {
    public static void main(String[] args){
        ThreadSafeTest t = new ThreadSafeTest();
        Thread th1 = new Thread(t);
        Thread th2 = new Thread(t);
        Thread th3 = new Thread(t);
        Thread th4 = new Thread(t);
        //启动
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
