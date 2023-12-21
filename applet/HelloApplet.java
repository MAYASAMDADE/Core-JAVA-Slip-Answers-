import java.applet.*;
import java.awt.*;
public class HelloApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("hello world!",100,100);
	}
}