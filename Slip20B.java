import java.awt.*;
import java.awt.event.*;
class Slip20B extends Frame implements WindowListener
{
	Slip20B()
	{
		setSize(500,500);
		setTitle("TY BBA-CA");
		setVisible(true);
		Color c=Color.red;
		setBackground(c);
		addWindowListener(this);
	}
	
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public static void main(String arg[])
	{
		Slip20B ob=new Slip20B();
	}
}
		