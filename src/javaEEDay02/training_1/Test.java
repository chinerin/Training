package javaEEDay02.training_1;

/**
 * @PackageName:JavaEEDay02.Training_1
 * @ClassName:Test
 * @Description:
 * @author: CK
 * @data: 2020/6/23 16:40
 */
public class Test {
    public static void main(String[] args){
        //测试toString方法拼接是否存在问题。
        Television television = new Television("品牌","dav","红色",300.0,17.5,"全系");
        System.out.println(television.toString());
    }
}
