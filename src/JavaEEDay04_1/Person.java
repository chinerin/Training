package JavaEEDay04_1;

/**
 * @PackageName:JavaEEDay04_1
 * @ClassName:Training_01
 * @Description:    Person类主类
 * @author: CK
 * @data: 2020/6/28 11:20
 */
public abstract class Person {

    private String name;

    private int id;

    private String sex;

    private String birthday;

    private int age;

    public Person() {
    }

    public Person(String name, int id, String sex, String birthday, int age) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.birthday = birthday;
        this.age = age;
    }

    public abstract String getType();

    public abstract String getWork();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }
}
