import javax.swing.*;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Abc extends JFrame implements MouseMotionListener, MouseListener {
    JLabel l1;

    Abc() {
        l1 = new JLabel("Print over here");
        addMouseMotionListener(this);
        addMouseListener(this);
        add(l1);

        setVisible(true);
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseEntered(MouseEvent ae) {
        getContentPane().setBackground(Color.BLUE);
        l1.setText("Mouse is Dragged");
    }
    public void mousePressed(MouseEvent ae) {
        getContentPane().setBackground(Color.GRAY);
        l1.setText("Mouse is Dragged");
    }
    public void mouseReleased(MouseEvent ae) {
        getContentPane().setBackground(Color.BLACK);
        l1.setText("Mouse is Dragged");
    }
    public void mouseClicked(MouseEvent ae) {
        getContentPane().setBackground(Color.YELLOW);
        l1.setText("Mouse is Dragged");
    }
    public void mouseExited(MouseEvent ae) {
        getContentPane().setBackground(Color.PINK);
        l1.setText("Mouse is Dragged");
    }
    public void mouseDragged(MouseEvent ae) {
        getContentPane().setBackground(Color.RED);
        l1.setText("Mouse is Dragged");
    }

    public void mouseMoved(MouseEvent ae) {
        getContentPane().setBackground(Color.GREEN);
        l1.setText("Mouse is Moved");
    }
}

public class Mouse_Swings {
    public static void main(String[] args) {
        Abc obj = new Abc();
    }
}
