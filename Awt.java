import java.awt.*;
class Awt extends Frame
{
	Label l;
	Awt()
	{
		l=new Label("hello");
		add(l);
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		
	}
	
	public static void main(String arg[])
	{
	Awt ob=new Awt();
	}
}
	