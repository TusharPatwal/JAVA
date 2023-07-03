// KeyEvent, KeyListener

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

class Test02 extends JFrame implements KeyListener {
    JLabel l1;

    Test02() {
        l1 = new JLabel("Print over here");
        addKeyListener(this);
        add(l1);

        setVisible(true);
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyTyped(KeyEvent e) {
        l1.setText("Key Typed");
    }

    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l1.setText("Key Released");
    }
}

public class Swing07 {
    public static void main(String[] args) {
        Test02 o = new Test02();
    }
}