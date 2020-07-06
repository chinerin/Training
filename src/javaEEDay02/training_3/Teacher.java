package javaEEDay02.training_3;

/**
 * @PackageName:JavaEEDay02.Training_3
 * @ClassName:Teacher
 * @Description:
 * @author: CK
 * @data: 2020/6/23 18:18
 */

/**
 * 教练类
 */
public class Teacher extends Person{

    private String tid;

    @Override
    public void eat() {
        System.out.println("教练吃教练餐！~");
    }

    public Teacher() {
    }

    public Teacher(String name, String sex, int age, String tid) {
        super(name, sex, age);
        this.tid = tid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}
