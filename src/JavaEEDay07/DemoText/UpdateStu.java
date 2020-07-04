package JavaEEDay07.DemoText;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @PackageName:JavaEEDay07.DemoText
 * @ClassName:UpdateStu
 * @Description:
 * @author: CK
 * @data: 2020/7/3 17:58
 */
public class UpdateStu implements Comparable<Object> {

    String name;
    long id;

    public UpdateStu(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        UpdateStu updateStu = (UpdateStu) o;
        //存入TreeSet类实现的Set集合必须实现Comparable接口，该接口中的comprareTo(Object o) 方法比较此对象与指定对象得顺序
        //如果该对象小于等于或者大于指定对象，则分别返回负整数0或者正整数。
        int result = id > updateStu.id ? 1 : (id == updateStu.id ? 0 : -1);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String[] args){
        UpdateStu updateStu1 = new UpdateStu("王博",8801);
        UpdateStu updateStu2 = new UpdateStu("陈楠",5987);
        UpdateStu updateStu3 = new UpdateStu("富源",3453);
        UpdateStu updateStu4 = new UpdateStu("甘郡",1245);

        TreeSet<UpdateStu> treeSet = new TreeSet<>();
        treeSet.add(updateStu1);
        treeSet.add(updateStu2);
        treeSet.add(updateStu3);
        treeSet.add(updateStu4);
        Iterator<UpdateStu> iterator = treeSet.iterator();

        System.out.println("Set集合中的所有元素：");
        while (iterator.hasNext()){
            UpdateStu stu = iterator.next();
            System.out.println(stu.getName() + " " + stu.getId());
        }

        System.out.println("截取陈楠前面部分元素打印：");
        iterator = treeSet.headSet(updateStu2).iterator();
        while (iterator.hasNext()){
            UpdateStu next = iterator.next();
            System.out.println(next.getName() + " " + next.getId());
        }

        System.out.println("截取陈楠和富源中间的元素并打印：");
        //iterator = treeSet.subSet(updateStu2, updateStu3).iterator();
        iterator = treeSet.subSet(updateStu3, updateStu2).iterator();
        while (iterator.hasNext()){
            UpdateStu next = iterator.next();
            System.out.println(next.getName() + " " + next.getId());
        }
    }

}
