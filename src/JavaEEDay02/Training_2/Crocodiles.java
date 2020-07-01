package JavaEEDay02.Training_2;

/**
 * @PackageName:JavaEEDay02.Training_2
 * @ClassName:Crocodiles
 * @Description:
 * @author: CK
 * @data: 2020/6/23 17:54
 */

/**
 * 鳄鱼类
 */
public class Crocodiles extends Crawling{

    @Override
    public void eat() {
        System.out.println("吃吃吃鳄鱼也吃吃吃");
    }

    @Override
    public void crawling() {
        System.out.println("鳄鱼爬起来很快很快");
    }
}
