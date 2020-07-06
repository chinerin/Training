package javaEEDay02.training_3;

/**
 * @PackageName:JavaEEDay02.Training_3
 * @ClassName:Athlete
 * @Description:
 * @author: CK
 * @data: 2020/6/23 18:26
 */

/**
 * 运动员类
 */
public class Athlete extends Person{
    private String aid;

    private String cath;

    @Override
    public void eat() {
        System.out.println("运动员餐只能给运动员吃！~");
    }

    public Athlete() {
    }

    public Athlete(String name, String sex, int age, String aid, String cath) {
        super(name, sex, age);
        this.aid = aid;
        this.cath = cath;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }


}
