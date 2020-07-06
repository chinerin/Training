package javaEEDay02.training_2;

/**
 * @PackageName:JavaEEDay02.Training_2
 * @ClassName:bird
 * @Description:
 * @author: CK
 * @data: 2020/6/23 17:25
 */

/**
 * 鸟类
 */
public class Bird extends Animal {

    private double size;//翅膀长度

    @Override
    public void eat() {
        System.out.println("鸟类用啄吃吃吃吃");
    }

    public Bird() {
    }

    public Bird(String name, int age, double size) {
        super(name, age);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "size=" + size +
                '}';
    }
}
