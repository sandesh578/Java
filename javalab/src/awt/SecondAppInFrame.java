package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

@SuppressWarnings("serial")
class MyFrame extends Frame{
	Label l;
	TextField tf;
	Button b;
	public MyFrame()
	{
		super("My App");
		setLayout(new FlowLayout());
		l=new Label("Name");
		tf=new TextField(20);
		b=new Button("Ok");
		add(l);
		add(tf);
		add(b);
		
	}
}
public class SecondAppInFrame {

	public static void main(String[] args) {
		MyFrame m=new MyFrame();
		m.setSize(500,500);
        m.setVisible(true);
	}

}
