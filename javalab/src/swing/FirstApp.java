package swing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
@SuppressWarnings("serial")
class MyFrame extends JFrame{
	JLabel jl,jl1;
	JTextField jt;
	JButton jb;
	public MyFrame()
	{
		super("My First App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
        setVisible(true);
        setLayout(null);
		jl=new JLabel("Enter name");
		jl.setBounds(10,5,80,20);
		jl1=new JLabel("");
		jl1.setBounds(150,90,500,20);
		jt=new JTextField(20);
		jt.setBounds(80,5,100,20);
		jb=new JButton("Click Me");
		jb.setBounds(250,50,80,30);
		//JPanel
		JPanel greenPanel = new JPanel();
		greenPanel.setBounds(100,200,200,100);
		greenPanel.setLayout(new BorderLayout());
		greenPanel.setBackground(Color.GREEN);
		
		JLabel helloLabel = new JLabel("Hello");
		helloLabel.setBounds(50,20, 100,30);
		helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
		helloLabel.setVerticalAlignment(SwingConstants.CENTER);

		Font font = new Font("Courier", Font.BOLD,12);
		helloLabel.setFont(font);
		helloLabel.setFont(helloLabel.getFont().deriveFont(16f));

		greenPanel.add(helloLabel); // adding label to the panel
		
		add(jl);
		add(jt);
		add(jb);
		add(jl1);
		add(greenPanel);
		/*jb.addActionListener(new ActionListener()
				{
				@Override
				public void actionPerformed(ActionEvent e) {
					
					jl1.setText("Hello "+jt.getText());
					
				}
				});*/
		jb.addActionListener(e -> {
			
		String helloText = "Hello";
	    String name = jt.getText();
	    if (name != null && name.trim().length() > 0) {
	       helloText += String.format(", %s", name);
	    }
	    jl1.setText(helloText);
        //System.out.println("The button is clicked");
		});
	}
}
public class FirstApp {

	public static void main(String[] args) throws Exception{
		Runnable initFrame=new Runnable()
		{
			@Override
			public void run()
			{
				new MyFrame();
			}
		};
		
		SwingUtilities.invokeAndWait(initFrame);

	}

}
