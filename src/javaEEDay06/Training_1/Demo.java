package javaEEDay06.Training_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @PackageName:JavaEEDay06.Training_1
 * @ClassName:Demo
 * @Description: 请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
 * @author: CK
 * @data: 2020/6/30 16:12
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生日日期（格式yyyy-MM-dd）");
        String birthDay = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(birthDay);
            if (new Date().after(date)) {
                long longTime = new Date().getTime() - date.getTime();//获得时长
                //System.out.println(longTime);
                long day = longTime / 1000 / 60 / 60 / 24;//转换为天数
                System.out.println("出生到现在一共：" + day + "天");
            } else {
                System.out.println("生日日期有误！");
            }
        } catch (ParseException e) {
            System.out.println("模板错误！");
        }
    }
}
