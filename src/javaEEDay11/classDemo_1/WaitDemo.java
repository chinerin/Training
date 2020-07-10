package javaEEDay11.classDemo_1;

/**
 * @PackageName:javaEEDay11.classDemo
 * @ClassName:WaitDemo
 * @Description:    线程的wait方法和唤醒notify/notifyAll方法的使用
 * @author: CK
 * @data: 2020/7/7 17:18
 */
public class WaitDemo {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (WaitDemo.class){
                    System.out.println("ThreadA sleep...");
                    try {
                        WaitDemo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("ThreadA weak up...");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (WaitDemo.class){
                    System.out.println("ThreadB say weak up...");
                    WaitDemo.class.notifyAll();
                }
            }
        }).start();
    }
}
