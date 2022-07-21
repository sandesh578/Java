package awt;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
class MyFram extends Frame implements ItemListener{
	Label l;
	Checkbox c1,c2,c3;
	public MyFram()
	{
		super("Check Box");
		l=new Label("Nothing is Selected");
		c1=new Checkbox("Java");
		c2=new Checkbox("Python");
		c3=new Checkbox("C++");
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String str=" ";
		if(c1.getState())
		{
			str=str+" "+c1.getLabel();
		}
		if(c2.getState())
		{
			str=str+" "+c2.getLabel();
		}
		if(c3.getState())
		{
			str=str+"  "+c3.getLabel();
		}
		if(str.isEmpty())
		{
			str="Nothing is Selected";
		}
		l.setText(str);
	}
	
	
}
public class CheckBox {

	public static void main(String[] args) {
		MyFram m=new MyFram();
		m.setSize(500,500);
		m.setVisible(true);

	}

}
