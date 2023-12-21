/*import java.awt.*;
import java.awt.event.*;
import java.swing.*;
class Slip2A extends JFrame implements MouseListener,MouseMotionListener
{
	JTextField t1;
	public Slip2A()
	{
		t1=new JTextField(35);
		Font f=new Font("Arial",Font.BOLD,24);
		add(t1);
		t1.setFont(f);
		setLayout(newFlowLayout());
		setsize(700,700);
		add MouseListener(this);
		add MouseMotionListener(this);
	}
	
	//override the methods of the mouselistener
	
	public void mouseClicked(MouseEvent e)
	{
		t1.setText("x position:" +e.getx() + "y position : "+e.gety());
	}

	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}

	//override the method of mousemotion listener
	
	public void mouseMoved(MouseEvent e)
	{
		t1.setText("x position :" + e.getx()+"y position"+e.gety());
	}

public static void main(String args[])
	{
		Slip2A ob=new Slip2A();
	}
}*/
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	TextField t,t1;
	Label l,l1;
	int x,y;
	Panel p;
	MyFrame(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		p=new Panel();
		p.setLayout(new GridLayout(2,2,5,5));
		t=new TextField(20);
		l= new Label("Co-ordinates of clicking");
		l1= new Label("Co-ordinates of movement");
		t1=new TextField(20);
		p.add(l);
		p.add(t);
		p.add(l1);
		p.add(t1);
		add(p);
		addMouseListener(new MyClick());
		addMouseMotionListener(new MyMove());
		setSize(500,500);
		setVisible(true);
	}
	class MyClick extends MouseAdapter
	{
		public void mouseClicked(MouseEvent me)
		{
			x=me.getX();
			y=me.getY();
			t.setText("X="+x+" Y="+y);
		}
	}
	class MyMove extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent me)
		{
			x=me.getX();
			y=me.getY();
			t1.setText("X="+ x +" Y="+y);
		}
	}
}
class Slip2A
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame("Mouse screen");
	}
}

/*import java.awt.*;
import java.awt.event.*;

public class Slip2A extends Frame
{
        TextField statusBar;
        public static void main(String []args)
        {
                new Slip2A().show();
        }

        public Slip2A()
        {
                addMouseListener(new MouseAdapter()
                {
                        public void mouseClicked(MouseEvent e)
                        {
                                statusBar.setText("Clicked at (" + e.getX() + "," + e.getY() + ")");
                                repaint();
                        }
                             public void mouseEntered(MouseEvent e)
                        {
                                statusBar.setText("Entered at (" + e.getX() + "," + e.getY() + ")");
                                repaint();
                        }
                       
                            
                });
                addWindowListener(new WindowAdapter()
                {
                        public void windowClosing(WindowEvent e)
                        {
                                System.exit(0);
                        }
                });
                setLayout(new FlowLayout());
                setSize(275,300);
                setTitle("Mouse Click Position");
                statusBar = new TextField(20);
                add(statusBar);
                setVisible(true);
        }
}*/