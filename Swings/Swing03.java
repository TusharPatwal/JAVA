//JScrollPane

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public abstract class Swing03 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example-3");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea t1 = new JTextArea(10,20);
        JScrollPane s = new JScrollPane(t1);
        f.getContentPane().add(s);
        
        f.setVisible(true);        
        f.setSize(300, 200);
    }
}
