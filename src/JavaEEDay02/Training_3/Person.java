package JavaEEDay02.Training_3;

/**
 * @PackageName:JavaEEDay02.Training_3
 * @ClassName:Person
 * @Description:
 * @author: CK
 * @data: 2020/6/23 18:13
 */

/**
 * 人员类
 */
public abstract class Person {

    private String name;

    private String sex;

    private int age;

    public abstract void eat();

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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
}
