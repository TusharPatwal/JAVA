import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
public static void main(String[] args) {
    
    ImageIcon image = new ImageIcon("bird.png");
    JLabel label = new JLabel();
    
    label.setText("Do you code?");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
    label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.add(label);  
    }   
}