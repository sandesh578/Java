package lab11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class MyFrame extends Frame implements ActionListener{
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4;
	Button b;
	public MyFrame()
	{
		super("User Details");
		l1=new Label("Enter name");
		l2=new Label("Enter Roll No");
		l3=new Label("Enter Branch");
		l4=new Label("Enter Section");
		l5=new Label(" ");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		b=new Button("Display");
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b);
		add(l5);
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str=" Name: "+t1.getText()+"\n"+" Roll No: "+t2.getText()+"\n"+" Branch: "+t3.getText()+"\n"+" Section: "+t4.getText();
		l5.setText(str);
		
	}
}
public class DisplayUserinfo {

	public static void main(String[] args) {
		MyFrame f=new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);

	}

}
