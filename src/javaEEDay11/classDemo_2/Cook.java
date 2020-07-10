package javaEEDay11.classDemo_2;

/**
 * @PackageName:javaEEDay11.classDemo_2
 * @ClassName:Cook
 * @Description:    注意,同步锁使用的对象和用来调用notify/wait方法的对象需要是同一个,否则会抛出:
 *          IllegalMonitorStateException
 *          抛出该异常表明某一线程已经试图等待对象的监视器，或者试图通知其他正在等待对象的监视器，然而本身没有指定的监视器的线程。
 * @author: CK
 * @data: 2020/7/7 17:31
 */
public class Cook extends Thread {
    private Baozi baozi;

    public Cook(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (baozi.isHaveBaozi()){//为true是有包子,厨师类没有包子的时候开始行动
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("厨师开始做包子...");
                baozi.setHaveBaozi(true);
                baozi.notify();
            }
        }
    }
}
