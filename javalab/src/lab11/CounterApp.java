package lab11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class MyFrems extends Frame implements ActionListener{
	Label l;
	TextField tf;
	Button b;
	int count=0;
	public MyFrems()
	{
		super("Counter App");
		l=new Label("Counter");
		tf=new TextField(10);
		b=new Button("Count");
		setLayout(new FlowLayout());
		add(l);
		add(tf);
		add(b);
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		tf.setText(String.valueOf(count));
		
	}
}
public class CounterApp {

	public static void main(String[] args) {
		MyFrems f=new MyFrems();
		f.setSize(300,300);
		f.setVisible(true);

	}

}
