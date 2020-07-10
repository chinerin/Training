package javaEEDay11.classDemo_2;

/**
 * @PackageName:javaEEDay11.classDemo_2
 * @ClassName:Fooder
 * @Description:
 * @author: CK
 * @data: 2020/7/7 17:36
 */
public class Fooder extends Thread {
    private Baozi baozi;

    public Fooder(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (!baozi.isHaveBaozi()){//没有包子了等待厨师线程苏醒并制作包子
                    System.out.println("没有包子了厨师快点做包子...");
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("开始吃包子...");
                baozi.setHaveBaozi(false);
                baozi.notify();
            }
        }
    }
}
