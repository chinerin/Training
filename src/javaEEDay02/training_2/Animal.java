package javaEEDay02.training_2;

/**
 * @PackageName:JavaEEDay02.Training_2
 * @ClassName:Animal
 * @Description:
 * @author: CK
 * @data: 2020/6/23 16:57
 */

/**
 * 动物类
 */
public class Animal {

    private String name;

    private int age;

    public void eat(){
        System.out.println("动物吃吃吃吃吃");
    }

    public Animal() {
    }

    public Animal(String name, int age) {
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
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
