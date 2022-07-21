package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
public class FirstAppInFrame {

	public static void main(String[] args) {
		
		Frame f=new Frame("First App");
		f.setLayout(new FlowLayout());
		
		Button b=new Button("Ok");
		Label l=new Label("Name");
		
		TextField tf=new TextField();
		f.add(l);
		f.add(tf);
		f.add(b);
		f.setSize(500,500);
		f.setVisible(true);
        
	}

}
