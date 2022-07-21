package swing;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
class MyFrame3 extends JFrame{
	JToolBar tb;
	JTextArea ta;
	JButton b1,b2,b3,b4,b5,b6,b7;
	int count=0;
	public MyFrame3()
	{
		super("Editor App");
		tb=new JToolBar();
		b1=new JButton(new ImageIcon("‪C:\\Users\\KIIT\\Downloads\\open.jfif"));
		b2=new JButton(new ImageIcon("‪C:\\Users\\KIIT\\Downloads\\save.png"));
		b3=new JButton(new ImageIcon("‪C:\\Users\\KIIT\\Downloads\\search.png"));
		b4=new JButton(new ImageIcon("‪C:\\Users\\KIIT\\Downloads\\cut.png"));
		b5=new JButton(new ImageIcon("‪C:\\Users\\KIIT\\Downloads\\resize.jfif"));
		b6=new JButton(new ImageIcon("‪C:\\Users\\KIIT\\Downloads\\cancel.png"));
		b7=new JButton(new ImageIcon("‪C:\\Users\\KIIT\\Downloads\\open.jfif"));
		tb.add(b1);
		//tb.add(b2);
		tb.add(b3);
		tb.add(b4);
		tb.add(new JToolBar.Separator());
		tb.add(b5);
		//tb.add(b6);
		tb.add(b7);
		ta=new JTextArea();
		JScrollPane sp=new JScrollPane(ta);
		add(tb,BorderLayout.NORTH);
		add(sp,BorderLayout.CENTER);
		
		JMenuBar jm=new JMenuBar();
		JMenu file=new JMenu("File");
		JMenuItem m1=new JMenuItem("Save");
		JMenuItem m2=new JMenuItem("Open");
		m2.setMnemonic(KeyEvent.VK_O);
		file.add(m1);
		file.addSeparator();
		file.add(m2);
		jm.add(file);
		setJMenuBar(jm);
	}
	
}
public class textEditor {

	public static void main(String[] args) {
		MyFrame3 f=new MyFrame3();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);

	}

}
