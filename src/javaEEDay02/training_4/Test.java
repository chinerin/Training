package javaEEDay02.training_4;

/**
 * @PackageName:JavaEEDay02.Training_4
 * @ClassName:Test
 * @Description:
 * @author: CK
 * @data: 2020/6/23 20:04
 */
public class Test {

    public static void main(String[] args){
        Manager manager = new Manager();
        manager.doNotice("工作总结。");

        Employee employee = new Employee();
        employee.doNotice("工作汇报。");
    }

}
