package javaEEDay04_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @PackageName:JavaEEDay04_1
 * @ClassName:Utils
 * @Description: utils工具类，实现两个输出方法和一个出生日期转年龄的函数。
 * @author: CK
 * @data: 2020/6/28 20:32
 */
public class Utils {

    public static int stuId;

    /**
     * 初始化学员ID
     */
    static {
        stuId = 0;
    }

    /**
     * 打印学生老师格式方法
     *
     * @param person
     */
    public static void printPerson(Person person) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t年龄");
        System.out.println("姓名    性别   生日     年龄");
        System.out.println(person.getName() + "\t" + person.getSex() + "\t" + person.getBirthday() + "\t" + person.getAge());

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    /**
     * 实现打印所有成员集合格式方法
     *
     * @param arrayList
     */
    public static void printArrayList(ArrayList<Person> arrayList) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (int i = 0; i < arrayList.size(); i++) {
            Person stu = arrayList.get(i);
            System.out.println("姓名    性别   生日     年龄");
            System.out.println(stu.getName() + "\t" + stu.getSex() + "\t" + stu.getBirthday() + "\t" + stu.getAge());
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    /**
     * 通过Calendar对象获得当前时间并设置生日日期取具体年月日计算时差来获得年龄
     *
     * @param birthDay
     * @return
     */
    public static int birToAge(String birthDay) {
        //Date日期置空
        Date birth = null;
        try {
            //String 生日转Date格式日期
            birth = new SimpleDateFormat("yyyy-MM-dd").parse(birthDay);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
        //获取时间并健壮判断日期是否有效
        Calendar calendar = Calendar.getInstance();
        if (calendar.before(birth)) {
            return -1;
        }
        //取当前值
        int yearNow = calendar.get(Calendar.YEAR);
        int monthNow = calendar.get(Calendar.MONTH);
        int dayNow = calendar.get(Calendar.DAY_OF_MONTH);//相对月-日

        //无法取生日单独值进行判断年龄，设置时间通过Calendar对象取值
        calendar.setTime(birth);
        int yearBirth = calendar.get(Calendar.YEAR);
        int monthBirth = calendar.get(Calendar.MONTH);
        int dayBirth = calendar.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;
        if (monthBirth >= monthNow) {
            if (monthBirth == monthNow) {
                if (dayBirth > dayNow) {
                    age--;
                }
            } else
                age--;
        }

        return age;
    }

    public static int idIdExists(ArrayList<Person> list, int id){
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
