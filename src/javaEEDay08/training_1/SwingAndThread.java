package javaEEDay08.training_1;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @PackageName:JavaEEDay08.Training_1
 * @ClassName:SwingAndThread
 * @Description: 图标移动功能
 * @author: CK
 * @data: 2020/7/4 18:14
 */
public class SwingAndThread extends JFrame {
    /**
     * 声明JLabel对象，线程对象，计数器变量和容器
     */
    private JLabel jl = new JLabel();
    private static Thread t;
    private int count = 0;
    private Container container = getContentPane();

    public SwingAndThread() {
        setBounds(300, 200, 250, 100);
        container.setLayout(null);
        URL url = SwingAndThread.class.getResource("Snipaste_2020-07-04_18-20-24.png");
        //Image image = Toolkit.getDefaultToolkit().getImage("D:\\workspace\\test\\src\\javaEEDay08\\training_1\\Snipaste_2020-07-04_18-20-24.png");
        Icon icon = new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setBounds(10, 10, 200, 50);
        jl.setOpaque(true);
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 200) {
                    jl.setBounds(count, 10, 200, 50);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count += 4;
                    if (count == 200){
                        count = 10;
                    }
                }
            }
        });
        t.start();
        container.add(jl);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args){
        new SwingAndThread();
    }

}
