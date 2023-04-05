package src.day00.practiceSwingSystem;


import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    ImageIcon icon = new ImageIcon("images/airplane0.png");

    public void paint(Graphics g) {
        //g 是繪圖API，相當於面板上的畫筆
        //paintIcon 是 ImageIcon類型 提供的繪圖方法
        icon.paintIcon(this, g, 10, 10);
        //參數this沒有用途
        //參數 g 表示當前面板繪製圖片
        //參數 10,10 表示在面板上的位置
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setSize(400, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println(panel.icon.getImageLoadStatus());

    }


}
