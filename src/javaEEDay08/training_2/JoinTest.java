package javaEEDay08.training_2;

import javax.swing.*;
import java.awt.*;

/**
 * @PackageName:JavaEEDay08.Training_2
 * @ClassName:JoinTest
 * @Description:    进度条组件测试类
 * @author: CK
 * @data: 2020/7/4 19:46
 */
public class JoinTest extends JFrame {
    private Thread threadA;
    private Thread threadB;
    final JProgressBar progressBar = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();

    int count = 0;

    public static void main(String[] args){
        init(new JoinTest(),100,100);
    }

    private static void init(JFrame jFrame, int width, int height) {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(width,height);
        jFrame.setVisible(true);

    }

    public JoinTest(){
        super();
        getContentPane().add(progressBar,BorderLayout.NORTH);
        getContentPane().add(progressBar2,BorderLayout.SOUTH);
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);

        threadA = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true){
                    progressBar.setValue(++count);
                    try {
                        Thread.sleep(100);
                        threadB.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true){
                    progressBar2.setValue(++count);
                    try {
                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (count == 100)
                        break;
                }
            }
        });
        threadB.start();
    }
}
