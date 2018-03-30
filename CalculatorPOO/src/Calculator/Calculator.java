package Calculator;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextPane;

import Operations.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculator {
	
	private String input = "";
	private String historyStr = "";
	private String side1, side2, operator;

	private JFrame frame;
	private JTextField historyField;

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
		frame.setBounds(100, 100, 434, 606);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane Screen = new JTextPane();
		Screen.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Screen.setEditable(false);
		Screen.setBounds(21, 120, 381, 46);
		frame.getContentPane().add(Screen);
		
		historyField = new JTextField();
		historyField.setEditable(false);
		historyField.setBounds(21, 50, 381, 60);
		frame.getContentPane().add(historyField);
		historyField.setColumns(10);
		
		JLabel lblHistory = new JLabel("Historial de Operaciones");
		lblHistory.setBounds(21, 21, 237, 26);
		frame.getContentPane().add(lblHistory);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "7";
				historyStr += "7";
				Screen.setText(input);
			}
		});
		btn7.setBounds(21, 250, 61, 54);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "8";
				historyStr += "8";
				Screen.setText(input);
			}
		});
		btn8.setBounds(101, 250, 61, 54);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "9";
				historyStr += "9";
				Screen.setText(input);
			}
		});
		btn9.setBounds(181, 250, 61, 54);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "-";
				input = "";
				historyStr += " - ";
				Screen.setText(input);
			}
		});
		btnSub.setBounds(261, 250, 61, 54);
		frame.getContentPane().add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "4";
				historyStr += "4";
				Screen.setText(input);
			}
		});
		btn4.setBounds(21, 320, 61, 54);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "5";
				historyStr += "5";
				Screen.setText(input);
			}
		});
		btn5.setBounds(101, 320, 61, 54);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "6";
				historyStr += "6";
				Screen.setText(input);
			}
		});
		btn6.setBounds(181, 320, 61, 54);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "1";
				historyStr += "1";
				Screen.setText(input);
			}
		});
		btn1.setBounds(21, 390, 61, 54);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "2";
				historyStr += "2";
				Screen.setText(input);
			}
		});
		btn2.setBounds(101, 390, 61, 54);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "3";
				historyStr += "3";
				Screen.setText(input);
			}
		});
		btn3.setBounds(181, 390, 61, 54);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "0";
				historyStr += "0";
				Screen.setText(input);
			}
		});
		btn0.setBounds(21, 460, 61, 54);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += ".";
				historyStr += ".";
				Screen.setText(input);
			}
		});
		btnDot.setBounds(101, 460, 61, 54);
		frame.getContentPane().add(btnDot);
		
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "*";
				input = "";
				historyStr += " * ";
				Screen.setText(input);
			}
		});
		btnMul.setBounds(261, 320, 61, 54);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "/";
				input = "";
				historyStr += " / ";
				Screen.setText(input);
			}
		});
		btnDiv.setBounds(261, 390, 61, 54);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEq = new JButton("=");
		btnEq.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result;
				side2 = Screen.getText();
				Screen.setText(null);
				/** bugs
				 * Si le das al igual con la pantalla vacia no pasa nada pero da error
				 * Si le das al igual con un numero escrito en la pantalla sin operador da error
				 */
				
				double side1d = Double.parseDouble(side1);
				double side2d = Double.parseDouble(side2);
				
				if (operator.equals("+")) {
					OperationDouble sum = new Sum(side1d, side2d);
					result = sum.operate();
					Screen.setText(null);
					Screen.setText(result);
					historyStr += " = " + result;
					historyField.setText(historyStr);
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (operator.equals("-")) {
					OperationDouble subtraction = new Subtract(side1d, side2d);
					result = subtraction.operate();
					Screen.setText(result);
					historyStr += " = " + result;
					historyField.setText(historyStr);
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (operator.equals("*")) {
					OperationDouble multiply = new Multiply(side1d, side2d);
					result = multiply.operate();
					Screen.setText(result);
					historyStr += " = " + result;
					historyField.setText(historyStr);
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (operator.equals("/")) {
					OperationDouble division = new Divide(side1d, side2d);
					result = division.operate();
					Screen.setText(result);
					historyStr += " = " + result;
					historyField.setText(historyStr);
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (operator.equals("^")) {
					OperationDouble power = new Power(side1d, side2d);
					result = power.operate();
					Screen.setText(result);
					historyStr += " = " + result;
					historyField.setText(historyStr);
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();

				} else if (operator.equals("\u221A")) {
					OperationDouble root = new Root(side1d, side2d);
					result = root.operate();
					Screen.setText(result);
					historyStr += " = " + result;
					historyField.setText(historyStr);
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (operator.equals("Log")) {
					OperationDouble log = new Log(side1d, side2d);
					result = log.operate();
					Screen.setText(result);
					historyStr += " = " + result;
					historyField.setText(historyStr);
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (operator.equals("sn")) {
					OperationSingle sn = new Seno(side2d);
					result = sn.operate();
					Screen.setText(result);
					historyField.setText(sn.toString());
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (operator.equals("cs")) {
					OperationSingle cs = new Coseno(side2d);
					result = cs.operate();
					Screen.setText(result);
					historyField.setText(cs.toString());
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (operator.equals("tn")) {
					OperationSingle tn = new Tangente(side2d);
					result = tn.operate();
					Screen.setText(result);
					historyField.setText(tn.toString());
					side1 = null;
					side2 = null;
					historyStr = Screen.getText();
				} else if (side2.equals(null)) {
					Screen.setText(input);
					historyField.setText(historyStr);
					historyStr = Screen.getText();
				}
			}
		});
		btnEq.setBounds(181, 460, 141, 54);
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
		btnBk.setBounds(21, 180, 61, 54);
		frame.getContentPane().add(btnBk);
		
		JButton btnRes = new JButton("C");
		btnRes.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = "";
				Screen.setText("");
				historyStr = "";
			}
		});
		btnRes.setBounds(101, 180, 61, 54);
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
		btnPow.setBounds(181, 180, 61, 54);
		frame.getContentPane().add(btnPow);
		
		JButton btnSum = new JButton("+");
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "+";
				input = "";
				historyStr += " + ";
				Screen.setText(input);
				
			}
		});
		btnSum.setBounds(261, 180, 61, 54);
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
		btnRoot.setBounds(341, 180, 61, 54);
		frame.getContentPane().add(btnRoot);
		
		JButton btnLog = new JButton("lg");
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1 = Screen.getText();
				operator = "Log";
				input = "";
				Screen.setText(input);
				
			}
		});
		btnLog.setBounds(341, 250, 61, 54);
		frame.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("sn");
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				side1 = "0";
				operator = "sn";
				input = "";
				Screen.setText(input);
			}
		});
		btnSin.setBounds(341, 320, 61, 54);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cs");
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				side1 = "0";
				operator = "cs";
				input = "";
				Screen.setText(input);
			}
		});
		btnCos.setBounds(341, 390, 61, 54);
		frame.getContentPane().add(btnCos);
		
		JButton btnTn = new JButton("tg");
		btnTn.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnTn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				side1 = "0";
				operator = "tn";
				input = "";
				Screen.setText(input);
			}
		});
		btnTn.setBounds(341, 460, 61, 54);
		frame.getContentPane().add(btnTn);
		
	}
}
