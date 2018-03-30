package Calculator;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextPane;

import Operations.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Calculator {
	
	private String input = "";
	private String side1, side2, operator;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane Screen = new JTextPane();
		Screen.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Screen.setEditable(false);
		Screen.setBounds(20, 20, 381, 46);
		frame.getContentPane().add(Screen);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "7";
				Screen.setText(input);
			}
		});
		btn7.setBounds(20, 150, 61, 54);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "8";
				Screen.setText(input);
			}
		});
		btn8.setBounds(100, 150, 61, 54);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "9";
				Screen.setText(input);
			}
		});
		btn9.setBounds(180, 150, 61, 54);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "-";
				input = "";
				Screen.setText(input);
			}
		});
		btnSub.setBounds(260, 150, 61, 54);
		frame.getContentPane().add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "4";
				Screen.setText(input);
			}
		});
		btn4.setBounds(20, 220, 61, 54);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "5";
				Screen.setText(input);
			}
		});
		btn5.setBounds(100, 220, 61, 54);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "6";
				Screen.setText(input);
			}
		});
		btn6.setBounds(180, 220, 61, 54);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "1";
				Screen.setText(input);
			}
		});
		btn1.setBounds(20, 290, 61, 54);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "2";
				Screen.setText(input);
			}
		});
		btn2.setBounds(100, 290, 61, 54);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "3";
				Screen.setText(input);
			}
		});
		btn3.setBounds(180, 290, 61, 54);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "0";
				Screen.setText(input);
			}
		});
		btn0.setBounds(20, 360, 61, 54);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += ".";
				Screen.setText(input);
			}
		});
		btnDot.setBounds(100, 360, 61, 54);
		frame.getContentPane().add(btnDot);
		
		JButton btnPlusMinus = new JButton("+-");
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlusMinus.setBounds(180, 360, 61, 54);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "*";
				input = "";
				Screen.setText(input);
			}
		});
		btnMul.setBounds(260, 220, 61, 54);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "/";
				input = "";
				Screen.setText(input);
			}
		});
		btnDiv.setBounds(260, 290, 61, 54);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEq = new JButton("=");
		btnEq.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result;
				side2 = Screen.getText();
				
				/** bugs
				 * Si le das al igual con la pantalla vacia no pasa nada pero da error
				 * Si le das al igual con un numero escrito en la pantalla sin operador da error
				 */
				
				double side1d = Double.parseDouble(side1);
				double side2d = Double.parseDouble(side2);
				
				if (operator.equals("+")) {
					Operation sum = new Sum(side1d, side2d);
					result = sum.operate();
					Screen.setText(result);
					side1 = null;
					side2 = null;
				} else if (operator.equals("-")) {
					Operation subtraction = new Subtract(side1d, side2d);
					result = subtraction.operate();
					Screen.setText(result);
					side1 = null;
					side2 = null;
				} else if (operator.equals("*")) {
					Operation multiply = new Multiply(side1d, side2d);
					result = multiply.operate();
					Screen.setText(result);
					side1 = null;
					side2 = null;
				} else if (operator.equals("/")) {
					Operation division = new Divide(side1d, side2d);
					result = division.operate();
					Screen.setText(result);
					side1 = null;
					side2 = null;
				} else if (operator.equals("^")) {
					Operation power = new Power(side1d, side2d);
					result = power.operate();
					Screen.setText(result);
					side1 = null;
					side2 = null;
				} else if (operator.equals("\u221A")) {
					Operation root = new Root(side1d, side2d);
					result = root.operate();
					Screen.setText(result);
				} else if (side2.equals(null)) {
					Screen.setText(input);
				}
			}
		});
		btnEq.setBounds(260, 360, 141, 54);
		frame.getContentPane().add(btnEq);
		
		JButton btnBk = new JButton("BK");
		btnBk.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Screen.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(Screen.getText());
					strB.deleteCharAt(Screen.getText().length() - 1);
					input = strB.toString();
					Screen.setText(input);
				}
			}
		});
		btnBk.setBounds(20, 80, 61, 54);
		frame.getContentPane().add(btnBk);
		
		JButton btnRes = new JButton("C");
		btnRes.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = "";
				Screen.setText("");
			}
		});
		btnRes.setBounds(100, 80, 61, 54);
		frame.getContentPane().add(btnRes);
		
		JButton btnPow = new JButton("^");
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "^";
				input = "";
				Screen.setText(input);
			}
		});
		btnPow.setBounds(180, 80, 61, 54);
		frame.getContentPane().add(btnPow);
		
		JButton btnSum = new JButton("+");
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "+";
				input = "";
				Screen.setText(input);
				
			}
		});
		btnSum.setBounds(260, 80, 61, 54);
		frame.getContentPane().add(btnSum);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "\u221A";
				input = "";
				Screen.setText(input);
				
			}
		});
		btnRoot.setBounds(340, 80, 61, 54);
		frame.getContentPane().add(btnRoot);
	}
}
