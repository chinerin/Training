package JavaEEDay04.Training_3;

import java.util.Scanner;

/**
 * @PackageName:JavaEEDay04.Training_3
 * @ClassName:Demo
 * @Description: 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
 * @author: CK
 * @data: 2020/6/27 19:35
 */
public class Demo {
    public static void main(String[] args) {
        String scannerResult = getScanner();
        int maxCount = 0;
        int minCount = 0;
        int numCount = 0;

        for (int i = 0; i < scannerResult.length(); i++) {
            if (scannerResult.charAt(i) >= 'a' && scannerResult.charAt(i) <= 'z') {
                minCount++;
            } else if (scannerResult.charAt(i) >= 'A' && scannerResult.charAt(i) <= 'Z') {
                maxCount++;
            } else if (scannerResult.charAt(i) >= '0' && scannerResult.charAt(i) <= '9') {
                numCount++;
            }
        }
        System.out.println("该字符串总含有大写字母：" + maxCount + "个，小写字母：" + minCount + "个，数字：" + numCount + "个。");
    }

    /**
     * 获得键盘录入字符串
     *
     * @return
     */
    public static String getScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个包含大写字母、小写字母、和数字的字符串：");
        String s = sc.nextLine();
        return s;
    }
}
