import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing2 extends JFrame implements MouseListener, MouseMotionListener {
    JTextField t1;

    public Swing2() {
        t1 = new JTextField(35);
        Font f = new Font("Arial", Font.BOLD, 24);
        add(t1);
        t1.setFont(f);
        setLayout(new FlowLayout());
        setSize(700, 700);
        addMouseListener(this);
        addMouseMotionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        t1.setText("Mouse Clicked - X: " + x + ", Y: " + y);
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        t1.setText("Mouse Moved - X: " + x + ", Y: " + y);
    }

    public void mouseDragged(MouseEvent e) {
    }

    public static void main(String args[]) {
        Swing2 ob = new Swing2();
    }
}
