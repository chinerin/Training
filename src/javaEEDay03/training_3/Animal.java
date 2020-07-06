package javaEEDay03.training_3;

/**
 * @PackageName:JavaEEDay03.Training_3
 * @ClassName:Animal
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:46
 */
public class Animal {

    private String name;

    private int age;

    private String sex;

    public void eat(){
        System.out.println("动物都会吃东西@！~");
    }

    public Animal() {
    }

    public Animal(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
