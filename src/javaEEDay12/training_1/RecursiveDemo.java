package javaEEDay12.training_1;

import java.io.File;

/**
 * @PackageName:javaEEDay12.training_1
 * @ClassName:RecursiveDemo
 * @Description: 递归练习 + File文件递归  遍历文件递归打印的时候需要重新理清思路
 * @author: CK
 * @data: 2020/7/9 18:06
 */
public class RecursiveDemo {
    public static void main(String[] args) {
        //System.out.println(recursive_1(5));
        //System.out.println(recursive_2(100));
        printFile(new File("D:\\黑马99\\Day12_File类、递归、字节流、字符流"));
    }

    /**
     * 注意点,在遍历file对象时,一时理不清遍历对象,此处使用file.listFiles()方法获得file文件目录集合
     * @param file
     */
    private static void printFile(File file) {
        if (file.isDirectory()){
            for (File f : file.listFiles()) {
                printFile(f);
            }
        }else if (file.isFile()){
            System.out.println(file.getAbsolutePath());
        }
    }

    /**
     * 递归方法的使用还是比较宽泛,在找到循环调用本方法的规律之后可以使用,在使用的时候只需要考虑单次的计算,不需要太考虑后面的步骤计算
     * @param i
     * @return
     */
    private static int recursive_2(int i) {
        if (i == 1) {
            return 1;
        }
        return i += recursive_2(i - 1);
    }

    /**
     * 阶乘方法一定需要一个出口,否则会报出StackOverflowError异常,并且调用次数需要限制,否则栈内存会爆.
     *
     * @param i
     * @return
     */
    private static int recursive_1(int i) {
        if (i == 1) {
            return 1;
        }
        return i *= recursive_1(i - 1);
    }
}
