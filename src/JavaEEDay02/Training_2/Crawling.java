package JavaEEDay02.Training_2;

/**
 * @PackageName:JavaEEDay02.Training_2
 * @ClassName:Crawling
 * @Description:
 * @author: CK
 * @data: 2020/6/23 17:51
 */

/**
 * 爬行动物类
 */
public class Crawling extends Animal {

    @Override
    public void eat() {
        System.out.println("爬行动物吃吃吃");
    }

    public void crawling(){
        System.out.println("爬行动物会爬");
    }
}
