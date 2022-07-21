package awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

@SuppressWarnings("serial")
class ClsFrame extends Frame{
	
	public ClsFrame()
	{
		super("Menu Demo");
		setLayout(new FlowLayout());
		MenuBar m=new MenuBar();
		Menu file=new Menu("File");
		MenuItem m1=new MenuItem("Open");
		MenuItem m2=new MenuItem("Close");
		
		file.add(m1);
		file.add(m2);
		m.add(file);
		setMenuBar(m);
	}
}
public class MenuDemo {

	public static void main(String[] args) {
		ClsFrame f=new ClsFrame();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
