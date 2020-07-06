package javaEEDay02.training_2;

/**
 * @PackageName:JavaEEDay02.Training_2
 * @ClassName:Test
 * @Description:
 * @author: CK
 * @data: 2020/6/23 17:55
 */

/**
 * 测试特有属性
 */
public class Test {

    public static void main(String[] args){
        Elephant elephant = new Elephant();
        elephant.eat();

        Crocodiles crocodiles = new Crocodiles();
        crocodiles.eat();
        crocodiles.crawling();

        Parrots parrots = new Parrots();
        parrots.eat();
        parrots.speek();

    }
}
