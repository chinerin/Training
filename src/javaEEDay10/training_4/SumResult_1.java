package javaEEDay10.training_4;

/**
 * @PackageName:JavaEEDay10.Training_4
 * @ClassName:SumResult_1
 * @Description:
 * @author: CK
 * @data: 2020/7/6 20:33
 */
public class SumResult_1 implements Runnable {
    @Override
    public void run() {
        int count = 0;
        for(int i = 1; i <= 100; i++){
            count += i;
        }
        System.out.println("1-100之间的数字累加结果为：" + count);
    }
}
