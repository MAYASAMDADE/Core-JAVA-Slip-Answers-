import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Slip10A extends JFrame implements ActionListener
{
    JPanel p1,p2,p3,p4,p5;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    Slip10A()
    {
        p1=new JPanel();
        l1=new JLabel("Compund Interest Calculator");
        p1.add(l1);
        p1.setLayout(new FlowLayout());
        add(p1);

        p2=new JPanel();
        l2=new JLabel("Principle Amount");
        t1=new JTextField();
        p2.add(l2);p2.add(t1);
        p2.setLayout(new GridLayout(1,2));
        add(p2);

        p3=new JPanel();
        l3=new JLabel("Interest Rate(%)");
        t2=new JTextField();
        l4=new JLabel("Time(Yrs)");
        t3=new JTextField();
        p3.add(l3);p3.add(t2);
        p3.add(l4);p3.add(t3);
        p3.setLayout(new GridLayout(1,4));
        add(p3);

        p4=new JPanel();
        l5=new JLabel("Total Amount");
        t4=new JTextField();
        l6=new JLabel("Interest Amount");
        t5=new JTextField();
        p3.add(l5);p3.add(t4);
        p3.add(l6);p3.add(t5);
        p3.setLayout(new GridLayout(2,2));
        add(p3);

        p5=new JPanel();
        b1=new JButton("Calculate");
        b2=new JButton("Clear");
        b3=new JButton("Close");
        p5.add(b1);p5.add(b2);p5.add(b3);
        p5.setLayout(new GridLayout(1,2));
        add(p5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setLayout(new GridLayout(5,1));
        setVisible(true);
        setSize(500,300);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            double p=Double.parseDouble(t1.getText());
            double r=Double.parseDouble(t2.getText());
            double n=Double.parseDouble(t3.getText());
            double A=p*Math.pow((1+(r/100)),n);
            double CI=A-p;
            t4.setText(String.format("%.2f", A));
            t5.setText(String.format("%.2f", CI));
        }
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
        else if(e.getSource()==b3)
        {
            System.exit(0);
        }
    }
    public static void main(String arg[])
    {
        Slip10A ob=new Slip10A();
    }
}



