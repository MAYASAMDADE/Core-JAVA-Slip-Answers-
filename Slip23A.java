import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Slip23A extends JFrame
{
	JMenuBar bar;
	JMenu mf,me,ms;
	JMenuItem e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11;
	Font f;
	Slip23A()
	{
		f= new Font("Arial",Font.BOLD,16);
		bar = new JMenuBar();
		mf = new JMenu("File");
		me = new JMenu("Edit");
		ms = new JMenu("Search");
		e1 = new JMenuItem("Undo");
		e2 = new JMenuItem("Redo");
		e3 = new JMenuItem("Cut");
		e4 = new JMenuItem("Copy");
		e5 = new JMenuItem("Paste");
		e6 = new JMenuItem("Find");
		e7 = new JMenuItem("Replace");
		e8 = new JMenuItem("Open");
		e9 = new JMenuItem("Save");
		e10 = new JMenuItem("Save as");
		e11 = new JMenuItem("Exit");
		me.add(e1);me.add(e2);me.addSeparator();me.add(e3);me.add(e4);me.add(e5);
		ms.add(e6);ms.add(e7);
		mf.add(e8);mf.add(e9);mf.add(e10);mf.addSeparator();mf.add(e11);
		bar.add(mf);bar.add(me);bar.add(ms);
		bar.setFont(f);
		mf.setFont(f);me.setFont(f);ms.setFont(f);
		setSize(400,400);
		setVisible(true);
		setJMenuBar(bar);
		setLayout(null);
	}
		public static void main(String [] args)
		{
			Slip23A ob = new Slip23A();
		}
}