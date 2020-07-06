package javaEEDay03.Training_2;

/**
 * @PackageName:JavaEEDay03.Training_2
 * @ClassName:Motorcycle
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:31
 */
public class Motorcycle extends MotorVehicle {

    @Override
    public void run() {
        System.out.println("摩托车也是机动车，也要在马路上运行。");
    }

    public Motorcycle() {
    }

    public Motorcycle(String brand, double price) {
        super(brand, price);
    }
}
