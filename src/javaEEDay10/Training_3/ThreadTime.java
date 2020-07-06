package javaEEDay10.Training_3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @PackageName:JavaEEDay10.Training_3
 * @ClassName:ThreadTime
 * @Description:
 * @author: CK
 * @data: 2020/7/6 20:28
 */
public class ThreadTime extends Thread {
    SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(slf.format(new Date()));
        }
    }
}
