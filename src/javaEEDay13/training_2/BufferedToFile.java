package javaEEDay13.training_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:javaEEDay13.training_2
 * @ClassName:BufferedToFile
 * @Description:    定义一个存储String的集合：List<String>，并初始化
 *                  请定义“字符缓冲输出流”BufferedWriter将集合中的数据写入到文件：test3_2.txt中，每个名字一行。
 * @author: CK
 * @data: 2020/7/10 19:55
 */
public class BufferedToFile {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("周杰伦");
        list.add("蔡徐坤");

        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\javaEEDay13\\training_2\\text.txt"));
                ){
            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
