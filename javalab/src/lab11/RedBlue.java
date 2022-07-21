package lab11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class MyFrm extends Frame implements ActionListener{
	Label l;
	Button red,blue;
	public MyFrm()
	{
		super("Buttons");
		l=new Label("");
		red=new Button("Red");
		blue=new Button("Blue");
		setLayout(new FlowLayout());
		add(red);
		add(blue);
		add(l);
		red.addActionListener(this);
		blue.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==red)
		{
			l.setText("You Clicked Red Button");
		}
		else
		{
			l.setText("You Clicked Blue Button");
		}
		
	}
}
public class RedBlue {

	public static void main(String[] args) {
		MyFrm f=new MyFrm();
		f.setSize(300,300);
		f.setVisible(true);

	}

}
