package javaEEDay02.training_3;

/**
 * @PackageName:JavaEEDay02.Training_3
 * @ClassName:Test
 * @Description:
 * @author: CK
 * @data: 2020/6/23 18:29
 */

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args){
        Athlete athlete = new Athlete("陈珂","男",25,"8695","三年二班");
        Teacher teacher = new Teacher("汪汪汪","男",30,"2415");

        athlete.eat();
        teacher.eat();
    }
}
