package lab11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class MyFram extends Frame implements ActionListener{
	Label l,l1;
	TextField tf;
	Button b;
	public MyFram()
	{
		super("Even or Odd");
		l=new Label("Enter a number:");
		tf=new TextField(20);
		l1=new Label(" ");
		b=new Button("Check");
		setLayout(new FlowLayout());
		add(l);
		add(tf);
		add(b);
		add(l1);
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str=tf.getText();
		int a=Integer.parseInt(str);
		if(a%2==0)
		{
			l1.setText("Even");
		}
		else
		{
			l1.setText("Odd");
		}
		if(str.equals(""))
		{
			l1.setText("Blank");
		}
		
	}
}
public class CheckEvenOdd {

	public static void main(String[] args) {
		MyFram f=new MyFram();
		f.setSize(500,500);
		f.setVisible(true);

	}

}
