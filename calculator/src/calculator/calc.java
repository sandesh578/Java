package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 366, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(10, 10, 337, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btndel = new JButton("\uF0E7");
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btndel.setBackground(Color.CYAN);
		btndel.setFont(new Font("Windings", Font.BOLD, 18));
		btndel.setBounds(10, 94, 85, 60);
		frame.getContentPane().add(btndel);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBackground(Color.CYAN);
		btn7.setBounds(10, 151, 85, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBackground(Color.CYAN);
		btn6.setBounds(10, 210, 85, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn1.getText();
				textField.setText(num);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBackground(Color.CYAN);
		btn1.setBounds(10, 268, 85, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn0.getText();
				textField.setText(num);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBackground(Color.CYAN);
		btn0.setBounds(10, 325, 85, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnClr = new JButton("C");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnClr.getText();
				textField.setText(num);
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClr.setBackground(Color.CYAN);
		btnClr.setBounds(94, 94, 85, 60);
		frame.getContentPane().add(btnClr);
		
		JButton btnzero = new JButton("00");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnzero.getText();
				textField.setText(num);
			}
		});
		btnzero.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnzero.setBackground(Color.CYAN);
		btnzero.setBounds(178, 94, 85, 60);
		frame.getContentPane().add(btnzero);
		
		JButton btnmodulo = new JButton("%");
		btnmodulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnmodulo.getText();
				textField.setText(num);
			}
		});
		btnmodulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmodulo.setBackground(Color.CYAN);
		btnmodulo.setBounds(261, 94, 85, 60);
		frame.getContentPane().add(btnmodulo);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn8.getText();
				textField.setText(num);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBackground(Color.CYAN);
		btn8.setBounds(94, 151, 85, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn5.getText();
				textField.setText(num);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBackground(Color.CYAN);
		btn5.setBounds(94, 210, 85, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn2.getText();
				textField.setText(num);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBackground(Color.CYAN);
		btn2.setBounds(94, 268, 85, 60);
		frame.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btndot.getText();
				textField.setText(num);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBackground(Color.CYAN);
		btndot.setBounds(94, 325, 85, 60);
		frame.getContentPane().add(btndot);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBackground(Color.CYAN);
		btn9.setBounds(178, 151, 85, 60);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBackground(Color.CYAN);
		btn4.setBounds(178, 210, 85, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn3.getText();
				textField.setText(num);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBackground(Color.CYAN);
		btn3.setBounds(178, 268, 85, 60);
		frame.getContentPane().add(btn3);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btndivide.getText();
				textField.setText(num);
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndivide.setBackground(Color.CYAN);
		btndivide.setBounds(178, 325, 85, 60);
		frame.getContentPane().add(btndivide);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnadd.getText();
				textField.setText(num);
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnadd.setBackground(Color.CYAN);
		btnadd.setBounds(261, 151, 85, 60);
		frame.getContentPane().add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnsub.getText();
				textField.setText(num);
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsub.setBackground(Color.CYAN);
		btnsub.setBounds(261, 210, 85, 60);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnmul.getText();
				textField.setText(num);
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmul.setBackground(Color.CYAN);
		btnmul.setBounds(261, 268, 85, 60);
		frame.getContentPane().add(btnmul);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//first=textField.getText();
				
				operation=textField.getText();
				switch(operation)
				{
				  case "+":
				  	  result=first+second;
				      textField.setText(answer);
					  break;
				  case "-":
					  result=first-second;
				      textField.setText(answer);
					  break;
				  case "*":
					  result=first*second;
				      textField.setText(answer);
					  break;
				  case "/":
					  result=first/second;
				      textField.setText(answer);
					  break;
				  case "%":
					  result=first%second;
				      textField.setText(answer);
					  break;
				  default:
						System.out.println("Invalid input");
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequal.setBackground(Color.CYAN);
		btnequal.setBounds(261, 325, 85, 60);
		frame.getContentPane().add(btnequal);
	}
}
