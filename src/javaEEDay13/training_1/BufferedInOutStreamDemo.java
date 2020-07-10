package javaEEDay13.training_1;

import java.io.*;

/**
 * @PackageName:javaEEDay13.training_1
 * @ClassName:BufferedInOutStreamDemo
 * @Description: 请将D:盘下的一个文件复制到E:盘下，例如：d:\\视频.itcast，复制到E:\\视频.itcast。
 * 请使用“字节缓冲流”：BufferedInputStream和BufferedOutputStream实现
 * @author: CK
 * @data: 2020/7/10 19:36
 */

/**
 * 这个异常捕捉格式，格式化了为什么还是这样难看？
 */
public class BufferedInOutStreamDemo {
    public static void main(String[] args) {
        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\javaEEDay13\\training_1\\text.txt"));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\javaEEDay13\\training_1\\copyText.txt"));
        ) {
            byte[] bytes = new byte[1024 * 8];
            int len;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
