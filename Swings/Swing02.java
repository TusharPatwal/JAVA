//Buttons (JButton, JToggleButton, JCheckBox,JRadioButton)

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;


public class Swing02 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Example-2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton jbtn1 = new JButton("Chilk1");
        JToggleButton jbtn2 = new JToggleButton("Chilk2");
        JCheckBox jbtn3 = new JCheckBox("Chilk3");
        JRadioButton jbtn4 = new JRadioButton("Chilk4");
        
        jbtn1.setBounds(50,50,100,30);
        jbtn2.setBounds(50,90,100,30);
        jbtn3.setBounds(50,130,100,30);
        jbtn4.setBounds(50,170,100,30);
        
        f.getContentPane().add(jbtn1);
        f.getContentPane().add(jbtn2);
        f.getContentPane().add(jbtn3);
        f.getContentPane().add(jbtn4);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300, 300);
        
    }
}
