package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import Operations.*;

public class Calculator {
	
	private String input = "";
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
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 434, 606);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane Screen = new JTextPane();
		Screen.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Screen.setEditable(false);
		Screen.setBounds(21, 120, 381, 46);
		frame.getContentPane().add(Screen);
		
		historyField = new JTextField();
		historyField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		historyField.setEditable(false);
		historyField.setBounds(21, 50, 381, 60);
		frame.getContentPane().add(historyField);
		historyField.setColumns(10);
		
		JLabel lblHistory = new JLabel("Historial de Operaciones");
		lblHistory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHistory.setBounds(21, 21, 237, 26);
		frame.getContentPane().add(lblHistory);
		
		// 0 =================================================================================
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "0";
				Screen.setText(input);
			}
		});
		btn0.setBounds(21, 460, 61, 54);
		frame.getContentPane().add(btn0);
		
		// 1 =================================================================================
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "1";
				Screen.setText(input);
			}
		});
		btn1.setBounds(21, 390, 61, 54);
		frame.getContentPane().add(btn1);

		// 2 =================================================================================
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "2";
				Screen.setText(input);
			}
		});
		btn2.setBounds(101, 390, 61, 54);
		frame.getContentPane().add(btn2);

		// 3 =================================================================================
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "3";
				Screen.setText(input);
			}
		});
		btn3.setBounds(181, 390, 61, 54);
		frame.getContentPane().add(btn3);
 
		// 4 =================================================================================
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "4";
				Screen.setText(input);
			}
		});
		btn4.setBounds(21, 320, 61, 54);
		frame.getContentPane().add(btn4);

		// 5 =================================================================================
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "5";
				Screen.setText(input);
			}
		});
		btn5.setBounds(101, 320, 61, 54);
		frame.getContentPane().add(btn5);

		// 6 =================================================================================
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "6";
				Screen.setText(input);
			}
		});
		btn6.setBounds(181, 320, 61, 54);
		frame.getContentPane().add(btn6);

		// 7 =================================================================================
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "7";
				Screen.setText(input);
			}
		});
		btn7.setBounds(21, 250, 61, 54);
		frame.getContentPane().add(btn7);

		// 8 =================================================================================
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "8";
				Screen.setText(input);
			}
		});
		btn8.setBounds(101, 250, 61, 54);
		frame.getContentPane().add(btn8);

		// 9 =================================================================================
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "9";
				Screen.setText(input);
			}
		});
		btn9.setBounds(181, 250, 61, 54);
		frame.getContentPane().add(btn9);

		// . =================================================================================
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += ".";
				Screen.setText(input);
			}
		});
		btnDot.setBounds(101, 460, 61, 54);
		frame.getContentPane().add(btnDot);
		
		// BK ================================================================================
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
		
		// C =================================================================================
		JButton btnRes = new JButton("C");
		btnRes.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = "";
				Screen.setText("");
			}
		});
		btnRes.setBounds(101, 180, 61, 54);
		frame.getContentPane().add(btnRes);
		
		// SUMA =============================================================================
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
		btnSum.setBounds(261, 180, 61, 54);
		frame.getContentPane().add(btnSum);
		
		// RESTA ============================================================================
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
		btnSub.setBounds(261, 250, 61, 54);
		frame.getContentPane().add(btnSub);
		
		// MULTIPLICACION ===================================================================
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
		btnMul.setBounds(261, 320, 61, 54);
		frame.getContentPane().add(btnMul);
		
		// DIVISION ========================================================================
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
		btnDiv.setBounds(261, 390, 61, 54);
		frame.getContentPane().add(btnDiv);

		// POWER ===========================================================================
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
		
		// ROOT =============================================================================
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
		
		// LOG ==============================================================================
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
		
		// SENO =============================================================================
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
		
		// COSENO ==========================================================================
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
		
		// TANGENTE ========================================================================
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
		
		// EQUAL ==========================================================================
		JButton btnEq = new JButton("=");
		btnEq.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side2 = Screen.getText();
				input = "";
				/** bugs
				 * 
				 **/
			solveForOperator solver = new solveForOperator(operator, side1, side2);
			
			Screen.setText(solver.solve());
			historyField.setText(solver.toString());
			
			side1 = null;
			side2 = null;
			
				
			}
		});
		btnEq.setBounds(181, 460, 141, 54);
		frame.getContentPane().add(btnEq);
	}
}