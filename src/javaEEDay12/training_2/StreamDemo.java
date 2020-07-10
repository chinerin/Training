package javaEEDay12.training_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @PackageName:javaEEDay12.training_2
 * @ClassName:StreamDemo
 * @Description: 请使用字节流复制一个文件，一次读、写一个字节。
 * @author: CK
 * @data: 2020/7/10 17:42
 */
public class StreamDemo {
    public static void main(String[] args) throws IOException {
        //使用字节流读取文件
        FileInputStream fileInputStream = new FileInputStream("src\\javaEEDay12\\training_2\\StreamTest.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src\\javaEEDay12\\training_2\\StreamTestCopy.text");

        //Stream_1Method(fileInputStream, fileOutputStream);
    }

    private static void Stream_1Method(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        int b;
        while ((b = fileInputStream.read()) != -1) {
            fileOutputStream.write(b);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }
}
