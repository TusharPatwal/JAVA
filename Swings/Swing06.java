// MouseEvent, MouseListener, MouseMotionListener

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

class Test01 extends JFrame implements MouseListener, MouseMotionListener {
    JLabel l1;

    Test01() {
        l1 = new JLabel("Print over here");
        addMouseMotionListener(this);
        addMouseListener(this);
        add(l1);

        setVisible(true);
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent ae) {
        l1.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent ae) {
        l1.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent ae) {
        l1.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent ae) {
        l1.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent ae) {
        l1.setText("Mouse Exited");
    }

    public void mouseDragged(MouseEvent ae) {
        l1.setText("Mouse Dragged");
    }

    public void mouseMoved(MouseEvent ae) {
        l1.setText("Mouse Moved");
    }
}

public class Swing06 {
    public static void main(String[] args) {
        Test01 o = new Test01();
    }
}