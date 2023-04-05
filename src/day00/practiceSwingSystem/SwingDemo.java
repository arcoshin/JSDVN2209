package src.day00.practiceSwingSystem;


import javax.swing.JFrame;
import javax.swing.JPanel;


public class SwingDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.add(panel);
        frame.setSize(400,700);
        frame.setLocationRelativeTo(null);
        frame.getDefaultCloseOperation();

        frame.setVisible(true);//顯示面板

    }
}
