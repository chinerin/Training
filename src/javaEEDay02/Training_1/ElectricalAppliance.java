package javaEEDay02.Training_1;

/**
 * @PackageName:JavaEEDay02.Training_1
 * @ClassName:ElectricalAppliance
 * @Description:
 * @author: CK
 * @data: 2020/6/23 16:34
 */
public class ElectricalAppliance {

    private String brand;

    private String type;

    private String color;

    private double price;

    public ElectricalAppliance() {
    }

    public ElectricalAppliance(String brand, String type, String color, double price) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
