package javaEEDay10.training_4;

/**
 * @PackageName:JavaEEDay10.Training_4
 * @ClassName:Demo
 * @Description:
 * @author: CK
 * @data: 2020/7/6 20:33
 */
public class Demo {
    public static void main(String[] args){
        Thread thread = new Thread(new SumResult_1());
        thread.start();
        SumResult_2 sumResult = new SumResult_2();
        sumResult.start();
    }
}
