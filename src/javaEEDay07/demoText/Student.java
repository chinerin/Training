package javaEEDay07.demoText;

/**
 * @PackageName:JavaEEDay07.DemoText
 * @ClassName:Student
 * @Description:    学生实体类
 * @author: CK
 * @data: 2020/7/3 14:17
 */
public class Student {
    private String name;

    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
