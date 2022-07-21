package Height.Converter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HeightConverter extends JFrame {

	private JPanel contentPane;
	private JTextField feetField;
	private JTextField inchField;
	private JTextField centimeterField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeightConverter frame = new HeightConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HeightConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.YELLOW);
		panel.setBackground(Color.BLUE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel feet = new JLabel("Feet");
		feet.setBounds(84, 100, 121, 45);
		feet.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(feet);
		
		feetField = new JTextField();
		feetField.setFont(new Font("Tahoma", Font.BOLD, 15));
		feetField.setBounds(271, 104, 188, 45);
		panel.add(feetField);
		feetField.setColumns(10);
		
		JLabel inches = new JLabel("Inches");
		inches.setBounds(84, 165, 121, 38);
		inches.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(inches);
		
		inchField = new JTextField();
		inchField.setFont(new Font("Tahoma", Font.BOLD, 15));
		inchField.setBounds(271, 176, 188, 45);
		inchField.setColumns(10);
		panel.add(inchField);
		
		JButton convert = new JButton(" Convert  To");
		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double feet=Double.parseDouble(feetField.getText());
				double inch=Double.parseDouble(inchField.getText());
				double centimeter= (feet*12+inch)*2.54;
				centimeterField.setText(String.valueOf(centimeter));
			}
		});
		convert.setForeground(Color.RED);
		convert.setBackground(Color.GREEN);
		convert.setBounds(238, 282, 260, 45);
		convert.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(convert);
		
		centimeterField = new JTextField();
		centimeterField.setFont(new Font("Tahoma", Font.BOLD, 15));
		centimeterField.setBounds(271, 370, 203, 45);
		panel.add(centimeterField);
		centimeterField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Height Converter");
		lblNewLabel_1.setBounds(339, 17, 198, 38);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblNewLabel_1);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feetField.setText(" ");
				inchField.setText(" ");
				centimeterField.setText(" ");
			}
		});
		reset.setBackground(new Color(255, 69, 0));
		reset.setBounds(84, 450, 121, 45);
		reset.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(reset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(new Color(255, 69, 0));
		btnExit.setBounds(618, 450, 121, 45);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnExit);
		
		JLabel centimeter = new JLabel("Centimeter");
		centimeter.setBounds(67, 377, 121, 38);
		centimeter.setBackground(Color.GREEN);
		centimeter.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(centimeter);
	}
}
