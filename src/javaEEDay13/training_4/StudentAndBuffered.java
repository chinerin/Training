package javaEEDay13.training_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:javaEEDay13.training_4
 * @ClassName:StudentAndBuffered
 * @Description: 定义一个字符缓冲输出流BufferedWriter，将学员信息写入到”test.txt”中，每个学员信息占一行，每个字段之间用,符号隔开
 * @author: CK
 * @data: 2020/7/10 20:50
 */
public class StudentAndBuffered {
    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("迪丽热巴", "女", 18, 99));
        stuList.add(new Student("古力娜扎", "女", 19, 98));
        stuList.add(new Student("古力娜扎", "男", 20, 88));
        stuList.add(new Student("蔡徐坤", "男", 19, 78));

        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\javaEEDay13\\training_4\\text.txt"));
        ) {
            for (Student student : stuList) {
                bufferedWriter.write(student.getName() + ", " + student.getSex() + ", " + student.getAge() + ", " + student.getSorce());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
