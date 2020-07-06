package javaEEDay08.training_3;

/**
 * @PackageName:JavaEEDay08.Training_3
 * @ClassName:Demo
 * @Description:    测试类
 * @author: CK
 * @data: 2020/7/5 8:42
 */
public class Demo {

    public static void main(String[] args){
        /**
         * 分别建立三个线程，同时开始线程，或经过线程优先级设置再开始
         */
        PriorityTest t1 = new PriorityTest();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        PriorityTest t2 = new PriorityTest();
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.start();

        PriorityTest t3 = new PriorityTest();
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.start();

        /**
         * 线程的优先级并不能保证线程的运行顺序
         */
    }
}
