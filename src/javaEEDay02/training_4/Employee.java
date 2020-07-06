package javaEEDay02.training_4;

/**
 * @PackageName:JavaEEDay02.Training_4
 * @ClassName:Employee
 * @Description:
 * @author: CK
 * @data: 2020/6/23 20:00
 */
public class Employee extends Person {


    @Override
    public void hook(String contet) {
        System.out.println(contet);
    }

    public Employee() {
    }

    public Employee(String pid, String name, int age) {
        super(pid, name, age);
    }
}
