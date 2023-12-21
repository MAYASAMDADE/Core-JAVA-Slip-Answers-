// THIS PROGRAM WILL RUN WITHOUT COMPILING SO DONT TYPE javac Slip12A.java


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Slip12A extends JFrame implements ActionListener
{
JLabel l1;
JTextField t1;
DefaultListModel model;
JList lst;
Font f;
JButton b;
Slip12A()
{
l1 = new JLabel("Enter a number : ");
t1 = new JTextField(10);
b = new JButton("Display Table");
model = new DefaultListModel();
lst = new JList(model);
add(l1);add(t1);
add(b);
f = new Font("Arial",Font.BOLD,20);
add(lst);
lst.setFont(f);
l1.setFont(f);
t1.setFont(f);
b.setFont(f);
setSize(500,500);
setVisible(true);
setLayout(new FlowLayout());
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int n = Integer.parseInt(t1.getText());
model.removeAllElements();
for(int i =0;i<10;i++)
{
model.addElement((n*(i+1)+""));
}
}
public static void main(String [] args)
{
Slip12A ob = new Slip12A();
}
}
