package demoPackage;

/**
 * @PackageName:DemoPackage
 * @ClassName:Singer
 * @Description:
 * @author: CK
 * @data: 2020/6/22 20:15
 */
public class Singer {

    /**
     * 1.定义"歌手"类,Singer,包含以下成员:
     *     1.1成员属性: name (姓名):String类型，age (年龄):int类型，like (爱好):String类型，属性使用private修饰。
     *     1.2生成方法：  1).get/set方法    2)有参构造方法
     */

    private String name;

    private int age;

    private String like;

    public Singer() {
    }

    public Singer(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", like='" + like + '\'' +
                '}';
    }
}
