package JavaEEDay03.Training_1;

/**
 * @PackageName:JavaEEDay03.Training_1
 * @ClassName:Demo
 * @Description:
 * @author: CK
 * @data: 2020/6/26 20:10
 */
public class Demo {

    public static void main(String[] args){
        TeacherJava teacherJava = new TeacherJava();
        teacherJava.work();
        TeacherUi teacherUi = new TeacherUi();
        teacherUi.work();
        teacherUi.paint();
    }

}
