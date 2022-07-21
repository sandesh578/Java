package lab11;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

@SuppressWarnings("serial")
class MyFrames extends Frame{
	Label l;
	TextField tf;
	TextArea ta;
	Checkbox cb1,cb2,cb3,cb4,m1,m2;
	CheckboxGroup cg;
	Button b;
	public MyFrames()
	{
		super("Components");
		l=new Label("This is a Label");
		tf=new TextField(20);
        ta=new TextArea(10,20);
        cb1=new Checkbox("Java");
        cb2=new Checkbox("C++");
        cb3=new Checkbox("C");
        cb4=new Checkbox("JavaScript");
        cg=new CheckboxGroup();
        m1=new Checkbox("Male",false,cg);
        m2=new Checkbox("Female",false,cg);
		b=new Button("Click");
		setLayout(new FlowLayout());
		add(l);
		add(tf);
		add(ta);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(m1);
		add(m2);
		add(b);
	}
}
public class AppletWithAllComponents {

	public static void main(String[] args) {
		MyFrames f=new MyFrames();
		f.setSize(500,500);
		f.setVisible(true);

	}

}
