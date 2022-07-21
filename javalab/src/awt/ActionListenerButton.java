package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class MyFrames extends Frame implements ActionListener{
	int count=0;
	Label l;
	Button b;
	public MyFrames()
	{
		super("Counter");
		l=new Label(" "+count);
		b=new Button("Click");
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(l);
		add(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText(" "+count);
		
	}
	
}
public class ActionListenerButton {

	public static void main(String[] args) {
		MyFrames m=new MyFrames();
		m.setSize(500,500);
		m.setVisible(true);

	}

}
