package javaEEDay10.training_2;

/**
 * @PackageName:JavaEEDay10.Training_2
 * @ClassName:MyThread
 * @Description:
 * @author: CK
 * @data: 2020/7/6 20:23
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Runnable: " + i);
        }
    }
}
