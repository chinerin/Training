package javaEEDay02.training_2;

/**
 * @PackageName:JavaEEDay02.Training_2
 * @ClassName:Parrots
 * @Description:
 * @author: CK
 * @data: 2020/6/23 17:31
 */

/**
 * 鹦鹉
 */
public class Parrots extends Bird {

    private String type;//随便设置一个独有属性。

    @Override
    public void eat() {
        System.out.println("鹦鹉吃吃吃");
    }

    public void speek(){
        System.out.println("鹦鹉学人说话~~~");
    }
}
