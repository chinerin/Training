package JavaEEDay04.Training_2;

/**
 * @PackageName:JavaEEDay04.Training_2
 * @ClassName:Teacher
 * @Description: 请定义教师（Teacher）类，属性包含姓名和专业名称。
 * @author: CK
 * @data: 2020/6/27 19:27
 */
public class Teacher {

    private String name;

    private String majorName;

    public Teacher() {
    }

    public Teacher(String name, String majorName) {
        this.name = name;
        this.majorName = majorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", majorName='" + majorName + '\'' +
                '}';
    }
}
