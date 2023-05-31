import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;

class MyMouseListener extends JFrame implements MouseListener {
    JLabel l;

    MyMouseListener() {
        l = new JLabel("Hello Mr");
        addMouseListener(this);
        add(l);
        setVisible(true);
        // setSize(300,300);
        // setLocation(200,200);
        // Above Both(setSize, setLocation) are same as setBounds

        setBounds(200, 100, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
}

public class Test01 {
    public static void main(String[] args) {
        MyMouseListener obj = new MyMouseListener();
    }
}
