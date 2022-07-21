package awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
class MyFrams extends Frame implements ItemListener{
	Label l;
	Checkbox c1,c2,c3;
	CheckboxGroup cg;
	public MyFrams()
	{
		super("Radio Button");
		l=new Label("Nothing is Selected");
		cg=new CheckboxGroup();
		c1=new Checkbox("Java",false,cg);
		c2=new Checkbox("Python",false,cg);
		c3=new Checkbox("C++",false,cg);
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
public class RadioButtonImplementation {

	public static void main(String[] args) {
		MyFrams m=new MyFrams();
		m.setSize(500,500);
		m.setVisible(true);

	}

}
