package javaEEDay07.demoText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @PackageName:JavaEEDay07.DemoText
 * @ClassName:CollComparetor
 * @Description:      coll比较器测试类
 * @author: CK
 * @data: 2020/7/3 14:16
 */
public class CollComparetor {

    public static void main(String[] args){
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("程龙",58));
        arrayList.add(new Student("杜子龙",24));
        arrayList.add(new Student("徐贵林",98));

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Student student : arrayList) {
            System.out.println(student);
        }
    }

}
