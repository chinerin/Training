package javaEEDay03.Training_2;

/**
 * @PackageName:JavaEEDay03.Training_2
 * @ClassName:Car
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:27
 */
public class Car extends MotorVehicle {
    @Override
    public void run() {
        System.out.println("机动车都会在马路上运行");
    }

    public Car() {
    }

    public Car(String brand, double price) {
        super(brand, price);
    }
}
