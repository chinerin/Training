package javaEEDay08.training_3;

/**
 * @PackageName:JavaEEDay08.Training_3
 * @ClassName:PriorityTest
 * @Description:    线程修改优先级测试
 * @author: CK
 * @data: 2020/7/4 20:41
 */
public class PriorityTest extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread Name :" + this.getName());
    }
}
