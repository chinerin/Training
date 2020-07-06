package javaEEDay10.training_1;

/**
 * @PackageName:JavaEEDay10.Training_1
 * @ClassName:MyThread
 * @Description:
 * @author: CK
 * @data: 2020/7/6 20:19
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("thread: " + i);
        }
    }
}
