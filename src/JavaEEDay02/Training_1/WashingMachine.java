package JavaEEDay02.Training_1;

/**
 * @PackageName:JavaEEDay02.Training_1
 * @ClassName:WashingMachine
 * @Description:
 * @author: CK
 * @data: 2020/6/23 16:27
 */
public class WashingMachine extends ElectricalAppliance{

    private String motorType;

    private int washingCapacity;

    public WashingMachine() {
    }

    public WashingMachine(String brand, String type, String color, double price, String motorType, int washingCapacity) {
        super(brand, type, color, price);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public int getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(int washingCapacity) {
        this.washingCapacity = washingCapacity;
    }

    /**
     * 手动添加父类成员属性到子类toString方法中。
     * @return
     */
    @Override
    public String toString() {
        return "WashingMachine{" +
                "brand='" + super.getBrand() +
                "', color='" + super.getColor() +
                "', type='" + super.getColor() +
                "', price='" + super.getType() +
                "', motorType='" + motorType + '\'' +
                ", washingCapacity=" + washingCapacity +
                '}';
    }
}
