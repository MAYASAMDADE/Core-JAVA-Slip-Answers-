import java.applet.*;
import java.awt.*;
//<applet code="Slip15A" width="500" height="500"></applet>
public class Slip15A extends Applet
{
	public void paint(Graphics g)
	{
		Color c=Color.YELLOW;
		g.setColor(c);
		g.fillOval(100,100,250,250);

		g.setColor(Color.BLACK);
		g.fillOval(170,170,30,30);
		g.fillOval(250,170,30,30);
		
		g.setColor(Color.BLACK);
		g.fillOval(170,180,10,10);
		g.fillOval(250,180,10,10);
		g.drawLine(225,200,225,240);
		// g.setColor(Color.WHITE);
		g.fillOval(55,170,50,50);
		g.fillOval(345,170,50,50);
		g.fillArc(190,220,70,60,180,180);


	}

}
