package javaEEDay04_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @PackageName:JavaEEDay04_1
 * @ClassName:MainApp_1
 * @Description:    学生管理系统一级菜单
 * @author: CK
 * @data: 2020/6/28 14:23
 */
public class MainApp_1 {

    public static void main(String[] args){
        ArrayList<Person> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请选择：1、学生管理系统   2、退出");
            int chooes = sc.nextInt();
            switch (chooes){
                case 1:
                    MainApp_2.studentsManage(arrayList,sc);
                    break;
                case 2:
                    System.out.println("感谢使用本系统！");
                    return;
                default:
                    System.out.println("您输入的数字有误！请重新输入！");
                    break;
            }
        }


    }

}
