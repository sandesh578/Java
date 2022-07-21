package awt;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


@SuppressWarnings("serial")
class MyFrem extends Frame implements ItemListener,ActionListener{
	List l;
	TextArea ta;
	Choice c;
	public MyFrem()
	{
		super("ListBox");
		l=new List(4,true);
		ta=new TextArea(20,30);
		c=new Choice();
		l.add("SUnday");
		l.add("Tuesday");
		l.add("Friday");
		l.add("Thursday");
		l.add("Saturday");
		
		c.add("January");
		c.add("February");
		c.add("March");
		c.add("April");
		c.add("May");
		
		l.addItemListener(this);
		c.addItemListener(this);
		l.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(l);
		add(c);
		add(ta);
					
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==l)
		{
			ta.setText(l.getSelectedItem());
		}
		else
		{
			ta.setText(c.getSelectedItem());
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String list[]=l.getSelectedItems();
		
		String txt="";
		for(String s:list)
		{
			txt+=s+"\n";
		}
		ta.setText(txt);
	}
	
}
public class ListBoxAndChoiceDemo {

	public static void main(String[] args) {
		MyFrem m=new MyFrem();
		m.setSize(400,400);
		m.setVisible(true);

	}

}
