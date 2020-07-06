package javaEEDay04.training_1;

import java.util.ArrayList;
/**
 * @PackageName:JavaEEDay04.Training_1
 * @ClassName:Demo
 * @Description: 现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，请将所有的元素按顺序存入ArrayList集合中，
 *                并遍历集合查看存储结果。
 * @author: CK
 * @data: 2020/6/27 19:17
 */

public class Demo {
    public static void main(String[] args){
        String[] s = new String[]{"aaa", "bbb", "aaa", "aaa", "ccc", "bbb"};

        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < s.length; i++){
            arrayList.add(s[i]);
        }
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
