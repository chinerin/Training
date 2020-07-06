package javaEEDay04_1.Test;

import java.util.Scanner;

/**
 * @PackageName:JavaEEDay04_1.Test
 * @ClassName:Demo
 * @Description:    测试部分方法
 * @author: CK
 * @data: 2020/6/30 15:41
 */
public class Demo {
    public static void main(String[] args){
        /**
         * Integer.parseInt(String s)  return 一个Integer
         */
        Scanner scanner = new Scanner(System.in);
        //System.out.println(Integer.parseInt(scanner.nextLine()));

        /**
         * confirm.trim   .trim()去除两遍的空格
         */
        String nextLine = scanner.nextLine();
        String trim = nextLine.trim();//trim两边没有空格
    }
}
