package javaEEDay10.training_4;

/**
 * @PackageName:JavaEEDay10.Training_4
 * @ClassName:SumResult_2
 * @Description:
 * @author: CK
 * @data: 2020/7/6 20:35
 */
public class SumResult_2 extends Thread{
    @Override
    public void run() {
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            count += i;
        }
        System.out.println("1-1000之间数字之和为：" + count);
    }
}
