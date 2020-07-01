package JavaEEDay04_1;

/**
 * @PackageName:JavaEEDay04_1
 * @ClassName:Student
 * @Description:    Student类主类
 * @author: CK
 * @data: 2020/6/28 11:25
 */
public class Student extends Person{

    public Student() {
    }

    public Student(String name, int id, String sex, String birthday, int age) {
        super(name, id, sex, birthday, age);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学生学习！~";
    }

}
