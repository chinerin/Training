package javaEEDay03.training_2;

/**
 * @PackageName:JavaEEDay03.Training_2
 * @ClassName:Locomotives
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:23
 */

/**
 * 机车类
 */
public abstract class MotorVehicle {

    private String brand;

    private double price;

    public abstract void run();

    public MotorVehicle() {
    }

    public MotorVehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
