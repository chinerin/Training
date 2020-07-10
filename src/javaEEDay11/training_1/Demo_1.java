package javaEEDay11.training_1;

/**
 * @PackageName:javaEEDay11.training_1
 * @ClassName:Demo
 * @Description: 请使用Lambda表达式启动一个Thread线程，线程中打印：1--100所有数字。
 * @author: CK
 * @data: 2020/7/7 17:52
 */
public class Demo_1 {
    public static void main(String[] args) {
        //new Thread(() -> System.out.println("我启动了一个线程啦!~")).start();

        new Thread(() -> {
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                count += i;
            }
            System.out.println("1-100的和为: " + count);
        }).start();
    }
}
