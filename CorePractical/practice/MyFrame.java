import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("First Class"); // sets title of frame
        this.setSize(420, 420); // set size in x & y dimension of frame
        this.setVisible(true); // make frame visible
        this.setResizable(false); // prevent from resizing the window
        
        ImageIcon image = new ImageIcon("logo.png"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame 

        this.getContentPane().setBackground(new Color(75, 50, 250)); // change color of background
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the application (by default it is HIDE_ON_CLOSE) 
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}