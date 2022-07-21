package awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

@SuppressWarnings("serial")
class FrameMy extends Frame {
	Label l1,l2;
	TextField tf;
	public FrameMy()
	{
		super("Text Field");
		l1=new Label("No text Is Entered Yet");
		l2=new Label("Enter key is not Hit yet.");
		tf=new TextField(20);
		tf.setEchoChar('*');
		Handler h=new Handler();
		tf.addTextListener(h);
		tf.addActionListener(h);
		setLayout(new FlowLayout());
		add(l1);
		add(tf);
		add(l2);
		
		
	}
	
	
	class Handler implements TextListener,ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			l1.setText(tf.getText());
			
		}
		@Override
		public void textValueChanged(TextEvent e) {
			l2.setText(tf.getText());
			
		}
	}
}
public class TextFieldDemo {

	public static void main(String[] args) {
		FrameMy m=new FrameMy();
		m.setSize(400,400);
		m.setVisible(true);

	}

}
