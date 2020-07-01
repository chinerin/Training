package JavaEEDay04_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @PackageName:JavaEEDay04_1
 * @ClassName:MainApp_2
 * @Description:    学生管理系统二级菜单
 * @author: CK
 * @data: 2020/6/28 14:34
 */
public class MainApp_2 {
    public static void studentsManage(ArrayList<Person> arrayList, Scanner scanner){
        System.out.println("__________________________________________");
        System.out.println("【学员信息管理系统欢迎您的使用！】");
        while (true) {
            System.out.println("1、添加学员   2、删除学员    3修改学员信息   4、查询学员信息   5、返回");
            System.out.println();
            System.out.println("请选择功能：");
            switch (scanner.nextInt()){
                case 1:
                    Method.addStudent(arrayList,scanner);
                    break;
                case 2:
                    Method.deleteStudent(arrayList,scanner);
                    break;
                case 3:
                    Method.updateStudent(arrayList,scanner);
                    break;
                case 4:
                    Method.selectStudent(arrayList);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("您输入的选择有误！请重新输入！");
                    break;

            }
        }
    }
}
