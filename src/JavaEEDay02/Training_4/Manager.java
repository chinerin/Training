package JavaEEDay02.Training_4;

/**
 * @PackageName:JavaEEDay02.Training_4
 * @ClassName:Manager
 * @Description:
 * @author: CK
 * @data: 2020/6/23 20:02
 */
public class Manager extends Person {

    private double brond;//年终奖

    @Override
    public void hook(String contet) {
        System.out.println(contet);
    }

    public Manager() {
    }

    public Manager(String pid, String name, int age, double brond) {
        super(pid, name, age);
        this.brond = brond;
    }

    public double getBrond() {
        return brond;
    }

    public void setBrond(double brond) {
        this.brond = brond;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "brond=" + brond +
                '}';
    }
}
