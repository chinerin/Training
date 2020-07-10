package javaEEDay13.training_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:javaEEDay13.training_3
 * @ClassName:BufferedReadDemo
 * @Description:    请编写main()方法，定义一个字符缓冲输入流BufferedReader，读取test.txt文件，一次读取一行，
 *                  将读取的内容存储到一个List<String>集合中，遍历、并打印集合中的每个元素：
 * @author: CK
 * @data: 2020/7/10 20:30
 */
public class BufferedReadDemo{
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\javaEEDay13\\training_3\\text.txt"));
                ){
            String lineResult;
            while ((lineResult = bufferedReader.readLine()) != null){
                list.add(lineResult);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
