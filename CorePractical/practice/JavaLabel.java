import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JavaLabel{
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("First Class"); // sets title of frame
        frame.setSize(420, 420); // set size in x & y dimension of frame
        frame.setVisible(true); // make frame visible
        frame.setResizable(false); // prevent from resizing the window
        
        ImageIcon image = new ImageIcon("logo.png"); // create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame 

        // frame.getContentPane().setBackground(Color.green); // change color of background
        frame.getContentPane().setBackground(new Color(125, 50, 250)); // change color of background
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the application (by default it is HIDE_ON_CLOSE)
    }
}