package DemoPackage;

import java.util.Random;
import java.util.Scanner;

/**
 * @PackageName:DemoPackage
 * @ClassName:Test
 * @Description:
 * @author: CK
 * @data: 2020/6/22 20:12
 */
public class Test {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入一个2-60之间的数组元素：");
            int number = sc.nextInt();
            if (number >= 2 && number <= 60) {
                arr[i] = number;
            } else {
                System.out.println("输入的数组元素范围有误！");
                i--;//如果输入的数字范围不正确则此次循环作废
            }
        }
        Random random = new Random();
        int randomNumber = random.nextInt(11) + 2;
        System.out.println("生成的随机数为：" + randomNumber);
        System.out.println("符合条件的元素为：");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % randomNumber == 0) {
                System.out.print(arr[i]);
            }
        }
    }
}
