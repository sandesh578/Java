package WordCounter;

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

public class WordCounter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField wordsField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCounter frame = new WordCounter();
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
	public WordCounter() {
		setForeground(new Color(128, 0, 0));
		setBackground(new Color(255, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(230, 32, 363, 188);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Your Text");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(23, 104, 197, 49);
		contentPane.add(lblNewLabel);
		
		JButton countbtn = new JButton("Count Words");
		countbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField.getText();
				int count=1;
				for(int i=1;i<str.length();i++)
				{
					if(str.charAt(0)!=' '&&str.charAt(i)==' '&&i<=str.length()-1)
					{
						count=count+1;
					}
				}
				wordsField.setText(String.valueOf(count));
			}
		});
		countbtn.setForeground(new Color(255, 255, 255));
		countbtn.setBackground(new Color(139, 0, 0));
		countbtn.setFont(new Font("Tahoma", Font.BOLD, 22));
		countbtn.setBounds(151, 267, 323, 43);
		contentPane.add(countbtn);
		
		JButton clearbtn = new JButton("Clear");
		clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				wordsField.setText(" ");
			}
		});
		clearbtn.setBackground(new Color(220, 20, 60));
		clearbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		clearbtn.setBounds(23, 422, 119, 43);
		contentPane.add(clearbtn);
		
		JButton exitbtn = new JButton("Exit");
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitbtn.setBackground(new Color(220, 20, 60));
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		exitbtn.setBounds(462, 422, 119, 43);
		contentPane.add(exitbtn);
		
		JLabel totalwords = new JLabel("Total Words");
		totalwords.setFont(new Font("Tahoma", Font.BOLD, 22));
		totalwords.setBounds(23, 337, 197, 49);
		contentPane.add(totalwords);
		
		wordsField = new JTextField();
		wordsField.setFont(new Font("Tahoma", Font.BOLD, 15));
		wordsField.setBounds(230, 345, 187, 43);
		contentPane.add(wordsField);
		wordsField.setColumns(10);
	}

}
