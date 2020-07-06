package demoPackage;

import java.util.ArrayList;

/**
 * @PackageName:DemoPackage
 * @ClassName:Test_2
 * @Description:
 * @author: CK
 * @data: 2020/6/22 20:05
 */
public class Test_2 {
    /**
     * 2.定义类：test,类中定义main()方法，按以下要求编写代码:
     * 2.1分别实例化四个Singer对象，四个对象的属性分别为："刘德华" ,25,”打篮球”、"张学友" ,35,”游泳”、"郭富城" ,19,”踢足球”、"黎明" ,18,”击剑”;
     * 2.2创建一个ArrayList集合，这个集合里面存储的是Singer类型，分别将上面的四个Singer对象添加到集合中 ；
     * 2.3遍历这个集合，在遍历的过程中，如果集合中对象的年龄大于30，那么将这个对象的爱好改成”打保龄球”，如果对象的年龄小于20，那么就把这个对象删除。
     * 2.4正确修改和删除对象后，遍历集合，打印集合里所有对象的所有属性信息到控制台。
     *
     * @param args
     */
    public static void main(String[] args) {

        Singer s1 = new Singer("刘德华", 25, "打篮球");
        Singer s2 = new Singer("张学友", 35, "游泳");
        Singer s3 = new Singer("郭富城", 19, "踢足球");
        Singer s4 = new Singer("黎明", 18, "击剑");

        ArrayList<Singer> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getAge() > 30) {
                arrayList.get(i).setLike("打保龄球");
            } else if (arrayList.get(i).getAge() < 20) {
                arrayList.remove(i);
                i--;
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
        }
    }
}
