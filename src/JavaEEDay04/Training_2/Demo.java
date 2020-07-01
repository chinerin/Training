package JavaEEDay04.Training_2;

import java.util.ArrayList;

/**
 * @PackageName:JavaEEDay04.Training_2
 * @ClassName:Demo
 * @Description: 将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息
 * @author: CK
 * @data: 2020/6/27 19:24
 */
public class Demo {
    public static void main(String[] args){
        Teacher t1 = new Teacher("果果老师","javase");
        Teacher t2 = new Teacher("张1老师","javaee");
        Teacher t3 = new Teacher("张2老师","php");
        Teacher t4 = new Teacher("张3老师","python");
        ArrayList<Teacher> arrayList = new ArrayList<>();
        arrayList.add(t1);
        arrayList.add(t2);
        arrayList.add(t3);
        arrayList.add(t4);
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
