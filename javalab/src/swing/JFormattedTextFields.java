package swing;

import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

@SuppressWarnings("serial")
class MyFrame1 extends JFrame{
	JTextField tf;
	public MyFrame1()
	{
		super("Text Field Demo");
		setLayout(new FlowLayout());
		
		tf=new JTextField(15);
		
		//date formatter
		DateFormat df=new SimpleDateFormat("dd/MMMM/yyyy");
		JFormattedTextField ft=new JFormattedTextField(df);
		ft.setColumns(15);
		
		//number formatter
		//NumberFormat nf=NumberFormat.getInstance();
		NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormatter nf1=new NumberFormatter(nf);
		nf1.setAllowsInvalid(false);
		//nf1.setMinimum(0);
		//nf1.setMaximum(10000);
		JFormattedTextField ft1=new JFormattedTextField(nf1);
		ft1.setValue(0);
		ft1.setColumns(15);
		
		ft.setValue(new Date());
		add(tf);
		add(ft);
		add(ft1);
	}
}
public class JFormattedTextFields {

	public static void main(String[] args) {
		MyFrame1 m=new MyFrame1();
		m.setSize(400,400);
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
