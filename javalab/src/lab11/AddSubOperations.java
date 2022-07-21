package lab11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class MyFrem extends Frame implements ActionListener{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	public MyFrem()
	{
		super("Even or Odd");
		l1=new Label("Enter a number:");
		l2=new Label("Enter another number:");
		l3=new Label("");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		b1=new Button("Add");
		b2=new Button("Subtract");
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1); 
		add(b2);
		add(l3);
		add(t3);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str1=t1.getText();
		String str2=t2.getText();
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int res;
		if(e.getSource()==b1)
		{
			l3.setText("Result of Subtraction is:");
			res=a+b;
		}
		else
		{
			l3.setText("Result of Subtraction is:");
			res=a-b;
		}
		String result=String.valueOf(res);
		t3.setText(result);
		
	}
}
public class AddSubOperations {

	public static void main(String[] args) {
		MyFrem f=new MyFrem();
		f.setSize(500,500);
		f.setVisible(true);

	}

}
