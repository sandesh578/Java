package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class MyFrems extends JFrame implements ActionListener{
	JLabel l;
	JTextField tf;
	JButton b;
	int count=0;
	public MyFrems()
	{
		super("Counter App");
		l=new JLabel("Counter");
		tf=new JTextField(10);
		b=new JButton("Count");
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
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);

	}

}
