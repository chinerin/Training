package javaEEDay04.Training_4;

import java.util.Scanner;

/**
 * @PackageName:JavaEEDay04.Training_4
 * @ClassName:Demo
 * @Description: 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
 * @author: CK
 * @data: 2020/6/27 19:48
 */
public class Demo {
    public static void main(String[] args){
        String scannerResult = getScanner();
        StringBuilder stringBuilder = new StringBuilder(scannerResult);
        String reverseResult = stringBuilder.reverse().toString();
        boolean equalsResult = scannerResult.equals(reverseResult);
        if (equalsResult == true){
            System.out.println("您输入的字符串是个对称的字符串！");
        }else{
            System.out.println("您输入的字符串还真不是对称字符串呢！~");
        }
    }
    /**
     * 获得键盘录入字符串
     * @return
     */
    public static String getScanner(){
        System.out.println("请输入一个你认为是对称的字符串：");
        return new Scanner(System.in).nextLine();
    }

}
