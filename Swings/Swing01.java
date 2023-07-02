// JLabel and ImageIcon

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing01 {
    public static void main(String[] args) {

        // imageicon
        ImageIcon icon = new ImageIcon("img.png");

        // jlabel
        JLabel label = new JLabel();
        label.setText("hello");
        label.setIcon(icon);

        // jframe
        JFrame frame = new JFrame("Example01");
        frame.setSize(500, 400);
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
    }
}
