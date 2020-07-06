package JavaEEDay08.Training_3;

/**
 * @PackageName:JavaEEDay08.Training_3
 * @ClassName:ThreadSafeTest
 * @Description: 模拟火车站售票系统的流程，模拟线程安全问题
 * @author: CK
 * @data: 2020/7/5 8:53
 */
public class ThreadSafeTest implements Runnable {

    int count = 10;//总票数设置

    @Override
    public void run() {
        doit();
    }

    /**
     * 将方法定义为同步
     */
    private synchronized void doit() {
        while (true) {
            if (count > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ticket: " + count--);
            }
        }
    }

    /*public void run(){
        synchronized (""){
            while (true){
                if (count > 0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("tickets: " + count--);
                }
            }
        }
    }*/
}
