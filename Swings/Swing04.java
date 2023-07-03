// JTextField

import javax.swing.JFrame;
import javax.swing.JTextField;

public abstract class Swing04 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example-4");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField t = new JTextField();
        f.getContentPane().add(t);
        
        f.setVisible(true);        
        f.setSize(300, 200);
    }
}
