
import java.awt.*;
import java.awt.event.*;
class Slip14A extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b;
	Frame f;
	TextArea te;

	Slip14A()
	{
		Font fnt=new Font("Arial",Font.BOLD,20);
		setFont(fnt);
		l1=new Label("Enter Employee Number :");
		l2=new Label("Enter Employee Name :");
		l3=new Label("Enter Employee salary :");

		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);

		b=new Button("dispaly");
	
		f=new Frame();
		f.setFont(fnt);
		te=new TextArea(4,2);
		
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());

		b.addActionListener(this);

		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b);

		f.setSize(500,500);
		f.setVisible(false);
	
	}

	public void actionPerformed(ActionEvent e)
	{
		String str=t1.getText()+ "\n" + t2.getText()+"\n" + t3.getText();
		te.append(str);
		f.add(te);
		f.setVisible(true);
	}

	public static void main(String[] arg)
	{
		Slip14A ob= new Slip14A();
	}
}




