package javaEEDay13.training_4;

import java.io.Serializable;

/**
 * @PackageName:javaEEDay13.training_4
 * @ClassName:Student
 * @Description: 定义一个学员类，有以下属性：姓名、性别、年龄、分数.无参、全参构造方法，get/set方法
 * @author: CK
 * @data: 2020/7/10 20:42
 */
public class Student implements Serializable {


    private static final long serialVersionUID = 3391139723788986466L;
    private String name;
    private String sex;
    private int age;
    private int Score;

    public Student() {
    }

    public Student(String name, String sex, int age, int sorce) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.Score = sorce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSorce() {
        return Score;
    }

    public void setSorce(int sorce) {
        this.Score = sorce;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", sorce=" + Score +
                '}';
    }
}
