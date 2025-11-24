package pekan9_2511532002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator_2511532002 {

	private JFrame frame;
	private JTextField txtf;
	
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
					Calculator_2511532002 window = new Calculator_2511532002();
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
	public Calculator_2511532002() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(233, 218, 224));
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frame.setBounds(100, 100, 300, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtf = new JTextField();
		txtf.setForeground(new Color(255, 255, 255));
		txtf.setBackground(new Color(248, 241, 244));
		txtf.setFont(new Font("Arial", Font.BOLD, 20));
		txtf.setBounds(26, 26, 237, 60);
		frame.getContentPane().add(txtf);
		txtf.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setForeground(new Color(255, 255, 255));
		btnBackspace.setBackground(new Color(157, 77, 105));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if (txtf.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(txtf.getText());
					str.deleteCharAt(txtf.getText().length()-1);
					backSpace=str.toString();
					txtf.setText(backSpace);
				}
				
			}
		});
		btnBackspace.setFont(new Font("Windings", Font.BOLD, 14));
		btnBackspace.setBounds(26, 116, 52, 45);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnc = new JButton("C");
		btnc.setForeground(new Color(255, 255, 255));
		btnc.setBackground(new Color(157, 77, 105));
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtf.setText(null);
			}
		});
		btnc.setFont(new Font("Arial", Font.BOLD, 14));
		btnc.setBounds(88, 116, 52, 45);
		frame.getContentPane().add(btnc);
		
		JButton btn00 = new JButton("00");
		btn00.setBackground(new Color(227, 183, 194));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn00.getText();
				txtf.setText(number);
			}
		});
		btn00.setFont(new Font("Arial", Font.BOLD, 14));
		btn00.setBounds(150, 116, 52, 45);
		frame.getContentPane().add(btn00);
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(new Color(227, 183, 194));
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtf.getText());
				txtf.setText("");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Arial", Font.BOLD, 14));
		btnplus.setBounds(212, 116, 52, 45);
		frame.getContentPane().add(btnplus);
		
		JButton btnminus = new JButton("-");
		btnminus.setBackground(new Color(227, 183, 194));
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtf.getText());
				txtf.setText("");
				operation="-";
			}
		});
		btnminus.setFont(new Font("Arial", Font.BOLD, 14));
		btnminus.setBounds(212, 171, 52, 45);
		frame.getContentPane().add(btnminus);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(227, 183, 194));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn9.getText();
				txtf.setText(number);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 14));
		btn9.setBounds(150, 171, 52, 45);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(227, 183, 194));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn8.getText();
				txtf.setText(number);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 14));
		btn8.setBounds(88, 171, 52, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(227, 183, 194));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn7.getText();
				txtf.setText(number);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 14));
		btn7.setBounds(26, 171, 52, 45);
		frame.getContentPane().add(btn7);
		
		JButton btnkali = new JButton("*");
		btnkali.setBackground(new Color(227, 183, 194));
		btnkali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtf.getText());
				txtf.setText("");
				operation="*";
				
			}
		});
		btnkali.setFont(new Font("Arial", Font.BOLD, 14));
		btnkali.setBounds(212, 226, 52, 45);
		frame.getContentPane().add(btnkali);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(227, 183, 194));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn6.getText();
				txtf.setText(number);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 14));
		btn6.setBounds(150, 226, 52, 45);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(227, 183, 194));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn5.getText();
				txtf.setText(number);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 14));
		btn5.setBounds(88, 226, 52, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(227, 183, 194));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn4.getText();
				txtf.setText(number);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 14));
		btn4.setBounds(26, 226, 52, 45);
		frame.getContentPane().add(btn4);
		
		JButton btnbagi = new JButton("/");
		btnbagi.setBackground(new Color(227, 183, 194));
		btnbagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtf.getText());
				txtf.setText("");
				operation="/";
			}
		});
		btnbagi.setFont(new Font("Arial", Font.BOLD, 14));
		btnbagi.setBounds(212, 284, 52, 45);
		frame.getContentPane().add(btnbagi);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(227, 183, 194));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn3.getText();
				txtf.setText(number);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 14));
		btn3.setBounds(150, 284, 52, 45);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(227, 183, 194));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn2.getText();
				txtf.setText(number);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 14));
		btn2.setBounds(88, 284, 52, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(227, 183, 194));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btn1.getText();
				txtf.setText(number);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 14));
		btn1.setBounds(26, 284, 52, 45);
		frame.getContentPane().add(btn1);
		
		JButton btnhasil = new JButton("=");
		btnhasil.setBackground(new Color(157, 77, 105));
		btnhasil.setForeground(new Color(255, 255, 255));
		btnhasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(txtf.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					txtf.setText(answer);
				}
				else if (operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					txtf.setText(answer);
				}
				else if (operation=="*")
				{
						result=first*second;
					answer=String.format("%.2f", result);
					txtf.setText(answer);
				}
				else if (operation=="/")
				{
					result=first/second;
				answer=String.format("%.2f", result);
				txtf.setText(answer);
				}
				else if (operation=="%")
				{
					result=first%second;
				answer=String.format("%.2f", result);
				txtf.setText(answer);
				}
			}
		});
		btnhasil.setFont(new Font("Arial", Font.BOLD, 14));
		btnhasil.setBounds(150, 339, 52, 45);
		frame.getContentPane().add(btnhasil);
		
		JButton btnpersen = new JButton("%");
		btnpersen.setBackground(new Color(227, 183, 194));
		btnpersen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtf.getText());
				txtf.setText("");
				operation="%";
			}
		});
		btnpersen.setFont(new Font("Arial", Font.BOLD, 14));
		btnpersen.setBounds(212, 339, 52, 45);
		frame.getContentPane().add(btnpersen);
		
		JButton btndot = new JButton(".");
		btndot.setBackground(new Color(227, 183, 194));
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=txtf.getText()+btndot.getText();
				txtf.setText(number);
			}
		});
		btndot.setFont(new Font("Arial", Font.BOLD, 14));
		btndot.setBounds(88, 339, 52, 45);
		frame.getContentPane().add(btndot);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(227, 183, 194));
		btn0.setFont(new Font("Arial", Font.BOLD, 14));
		btn0.setBounds(26, 339, 52, 45);
		frame.getContentPane().add(btn0);
	}
}
