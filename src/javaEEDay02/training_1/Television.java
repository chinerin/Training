package javaEEDay02.training_1;

/**
 * @PackageName:JavaEEDay02.Training_1
 * @ClassName:Television
 * @Description:
 * @author: CK
 * @data: 2020/6/23 16:31
 */
public class Television extends ElectricalAppliance{

    private double size;

    private String resolution;

    public Television() {
    }

    public Television(String brand, String type, String color, double price, double size, String resolution) {
        super(brand, type, color, price);
        this.size = size;
        this.resolution = resolution;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * 手动添加父类成员属性到子类toString方法中。
     * @return
     */
    @Override
    public String toString() {
        return "Television{" +
                "brand='" + super.getBrand() +
                "', color='" + super.getColor() +
                "', type='" + super.getColor() +
                "', price='" + super.getType() +
                "', size='" + size +
                "', resolution='" + resolution + '\'' +
                '}';
    }
}
