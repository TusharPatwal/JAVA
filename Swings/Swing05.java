// JList
import javax.swing.JFrame;
import javax.swing.JList;

public class Swing05 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example-5");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"1", "2", "3","4","5"};
        JList<String> list = new JList<>(items);

        f.getContentPane().add(list);
        f.setVisible(true);        
        f.setSize(200, 150);
    }
}
