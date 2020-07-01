package JavaEEDay02.Training_1;

/**
 * @PackageName:JavaEEDay02.Training_1
 * @ClassName:Refrigerator
 * @Description:
 * @author: CK
 * @data: 2020/6/23 16:23
 */
public class Refrigerator extends ElectricalAppliance{

    private String doorType;

    private String coolType;

    public Refrigerator() {
    }

    public Refrigerator(String brand, String type, String color, double price, String doorType, String coolType) {
        super(brand, type, color, price);
        this.doorType = doorType;
        this.coolType = coolType;
    }

    public String getDoorType() {
        return doorType;
    }

    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }

    public String getCoolType() {
        return coolType;
    }

    public void setCoolType(String coolType) {
        this.coolType = coolType;
    }

    /**
     * 手动添加父类成员属性到子类toString方法中。
     * @return
     */
    @Override
    public String toString() {
        return "Refrigerator{" +
                "brand='" + super.getBrand() +
                "', color='" + super.getColor() +
                "', type='" + super.getColor() +
                "', price='" + super.getType() +
                "', doorType='" + doorType + '\'' +
                ", coolType='" + coolType + '\'' +
                '}';
    }
}
