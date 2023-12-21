import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="Slip19A" width="500" height="500"></applet>
public class Slip19A extends Applet implements MouseListener, MouseMotionListener {
    TextField t1;

    public void init() {
        t1 = new TextField(35);
        Font f = new Font("Arial", Font.BOLD, 24);
        t1.setFont(f);
        add(t1);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // Override the methods of the MouseListener
    public void mouseClicked(MouseEvent e) {
        t1.setText("Mouse Clicked - X Position: " + e.getX() + ", Y Position: " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        t1.setText("Mouse Pressed - X Position: " + e.getX() + ", Y Position: " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        t1.setText("Mouse Released - X Position: " + e.getX() + ", Y Position: " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        t1.setText("Mouse Entered - X Position: " + e.getX() + ", Y Position: " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        t1.setText("Mouse Exited");
    }

    // Override the methods of the MouseMotionListener
    public void mouseMoved(MouseEvent e) {
        t1.setText("Mouse Moved - X Position: " + e.getX() + ", Y Position: " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        t1.setText("Mouse Dragged - X Position: " + e.getX() + ", Y Position: " + e.getY());
    }
}
