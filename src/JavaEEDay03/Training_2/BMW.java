package JavaEEDay03.Training_2;

/**
 * @PackageName:JavaEEDay03.Training_2
 * @ClassName:BMW
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:32
 */
public class BMW extends Motorcycle implements Gps{

    public BMW() {
    }

    public BMW(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void toGps() {
        System.out.println("宝马车系都能定位。");
    }
}
