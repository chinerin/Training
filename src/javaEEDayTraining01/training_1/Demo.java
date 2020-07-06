package javaEEDayTraining01.training_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PackageName:JavaEEDayTraining01.Training_1
 * @ClassName:Demo
 * @Description: 针对for for each lambda测试使用方法
 * @author: CK
 * @data: 2020/7/1 10:25
 */
public class Demo {
    public static void main(String[] args) {

        //mapForEachTest();
        //mapForEachLambdaTest();
        //listForEach();
        listForEachLambdaTest();

    }

    /**
     * foreach + lambda 遍历list集合
     */
    private static void listForEachLambdaTest() {
        List<String> lists = new ArrayList<>();
        lists.add("11");
        lists.add("22");
        lists.add("33");
        lists.forEach(list -> {
            if ("11".equals(list))
                System.out.println("你好11");
        });
    }

    /**
     * 简单的foreach循环遍历list集合
     */
    private static void listForEach() {
        List<Integer> lists = new ArrayList<>();
        lists.add(11);
        lists.add(22);
        lists.add(33);

        for (Integer list : lists) {
            System.out.println(list);
        }
    }

    /**
     * foreach + lambda遍历Map集合基本格式
     * items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
     */
    private static void mapForEachLambdaTest() {
        //补充，Map中无法存放相同key值，测试相同key值会怎样。
        //测试后，如果map中存在相同的key值，则将会覆盖修改原有key下的value
        Map<String, Integer> map = new HashMap<>();
        map.put("forEach", 10);
        map.put("lambda", 20);
        map.put("map", 30);

        map.forEach((String, Integer) -> {
                    System.out.println("key:" + String + "  value:" + Integer);
                    if ("map".equals(String))
                        System.out.println("hello map");
                }
        );
        /*for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key:" + entry.getKey() + "  value:" + entry.getValue());
        }*/
    }

    /**
     * foreach 测试map遍历
     */
    private static void mapForEachTest() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "AA");
        map.put(20, "BB");
        map.put(30, "CC");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + "  value:" + entry.getValue());
        }
    }
}
