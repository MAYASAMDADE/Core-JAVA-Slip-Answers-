import java.awt.*;
class Slip7B extends Frame
{
	Label l;
	Slip7B()
	{	l=new Label("DR.D Y Patil College");
		setSize(500,500);
		setVisible(true);
		Color c=Color.red;
		setBackground(c);
		Font fnt=new Font("Arial",Font.BOLD,20);
		setFont(fnt);
		add(l);
	}
	
	public static void main(String arg[])
	{
		Slip7B ob=new Slip7B();
	}
}
		