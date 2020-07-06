package javaEEDay02.training_4;

/**
 * @PackageName:JavaEEDay02.Training_4
 * @ClassName:Person
 * @Description:
 * @author: CK
 * @data: 2020/6/23 19:56
 */

/**
 * 人员抽象类
 */
public abstract class Person {

    private String pid;

    private String name;

    private int age;

    public void doNotice(String context){
        System.out.println("通知：");
        hook(context);
        System.out.println("必胜环球科技有限公司");
    }

    public abstract void hook(String contet);

    public Person() {
    }

    public Person(String pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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
        return "Person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
