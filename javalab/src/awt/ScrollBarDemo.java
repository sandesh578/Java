package awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

@SuppressWarnings("serial")
class Fram extends Frame implements AdjustmentListener{
	Scrollbar red;
	Scrollbar blue;
	Scrollbar green;
	TextField tf;
	public Fram()
	{
		red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		tf=new TextField(20);
		
		setLayout(null);
		tf.setBounds(50,50,300,50);
		red.setBounds(50,150,300,30);
		blue.setBounds(50,200,300,30);
		green.setBounds(50,250,300,30);
		
		add(tf);
		add(red);
		add(blue);
		add(green);
		red.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
		
	}
}
public class ScrollBarDemo {

	public static void main(String[] args) {
		Fram f=new Fram();
		f.setSize(500,500);
		f.setVisible(true);

	}

}
