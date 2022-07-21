package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class FramMy extends Frame implements ActionListener{
	Label l;
	TextArea ta;
	TextField tf;
	Button b;
	public FramMy()
	{
		super("Text Area");
		l=new Label("No text Entered");
		ta=new TextArea(10,30);
		tf=new TextField(20);
		b=new Button("Click");
		b.addActionListener(this);
		
		setLayout(new FlowLayout());//original was borderLayout
		add(ta);
		add(l);
		add(tf);
		add(b);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//l.setText(ta.getSelectedText());	
		//ta.append(tf.getText());
		ta.insert(tf.getText(),ta.getCaretPosition());//insert at cursor position
	}
	
	
}
public class TextAreaDemo {

	public static void main(String[] args) {
		FramMy m=new FramMy();
		m.setSize(400,400);
		m.setVisible(true);

	}

}
