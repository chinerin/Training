package JavaEEDay04_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @PackageName:JavaEEDay04_1
 * @ClassName:Method
 * @Description: 学生管理系统crud method
 * @author: CK
 * @data: 2020/6/28 14:44
 */
public class Method {

    /**
     * 新增
     *
     * @param arrayList
     * @param scanner
     */
    public static void addStudent(ArrayList<Person> arrayList, Scanner scanner) {
        System.out.println("请输入学员姓名：");
        String name = scanner.next();
        System.out.println("请输入学员性别：");
        String sex = scanner.next();
        System.out.println("请输入学员生日：");
        String birthday = scanner.next();
        int age = Utils.birToAge(birthday);
        Student student = new Student(name, ++Utils.stuId, sex, birthday, age);
        arrayList.add(student);
        System.out.println("添加成功！！！");
    }

    /**
     * 删除
     *
     * @param arrayList
     * @param scanner
     */
    public static void deleteStudent(ArrayList<Person> arrayList, Scanner scanner) {
        System.out.println("请输入想要删除的学生的ID：");

        for(int i = 0; i < arrayList.size(); i++){
            if (Utils.idIdExists(arrayList,scanner.nextInt()) != -1){
                System.out.println("确认要删除吗？确认请输入yes，取消请输入no：");
                //String result = scanner.nextLine();//这个地方nextLint()吃掉了一个回车！！！
                String result = scanner.next();
                if ("yes".equals(result)){
                    arrayList.remove(i);
                    System.out.println("删除成功！");
                }else if ("no".equals(result)){
                    System.out.println("已取消删除！");
                }else {
                    System.out.println("您的输入有误，请重新选择要删除的学生！");
                    return;
                }
            }
            return;
        }
    }

    /**
     * 修改信息
     *
     * @param arrayList
     * @param scanner
     */
    public static void updateStudent(ArrayList<Person> arrayList, Scanner scanner) {
        System.out.println("请输入要修改的学生ID：");
        int stuId = scanner.nextInt();
        for(int i = 0; i < arrayList.size(); i++){
            if (stuId == arrayList.get(i).getId()){
                System.out.println("要修改的学生信息如下：");
                Utils.printPerson(arrayList.get(i));
                System.out.println("请输入修改的姓名：");
                String nextName = scanner.next();
                System.out.println("请输入修改的性别：");
                String nextSex = scanner.next();
                System.out.println("请输入修改的生日：");
                String nextBirth = scanner.next();
                Student student = new Student(nextName,arrayList.get(i).getId(),nextSex,nextBirth,Utils.birToAge(nextBirth));
                arrayList.set(i,student);
                System.out.println("修改成功！");
            }else {
                System.out.println("xxx");
            }
        }

    }

    /**
     * 查询
     *
     * @param arrayList
     * @param
     */
    public static void selectStudent(ArrayList<Person> arrayList) {
        System.out.println("【查询结果】");
        if (arrayList.size() == 0){
            System.out.println("暂时没有数据！");
            return;
        }
        Utils.printArrayList(arrayList);
    }

}
