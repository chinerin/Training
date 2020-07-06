package javaEEDay03.training_1;

/**
 * @PackageName:JavaEEDay03.Training_1
 * @ClassName:TeacherUi
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:09
 */
public class TeacherUi extends Employee implements Painting{
    @Override
    public void work() {
        System.out.println("老师上课讲UI设计。");
    }

    @Override
    public void paint() {
        System.out.println("UI老师会绘画。");
    }
}
