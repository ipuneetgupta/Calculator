package Calculators;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
    double Istnum;
	double IIndnum;
	double res;
	
	String operation;
	String ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 417);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.PINK);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 260, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn7.getText();
				textField.setText(Enum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBackground(Color.GRAY);
		btn7.setBounds(10, 75, 50, 50);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn8.getText();
				textField.setText(Enum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBackground(Color.GRAY);
		btn8.setBounds(80, 75, 50, 50);
		contentPane.add(btn8);
		
	
		
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn9.getText();
				textField.setText(Enum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBackground(Color.GRAY);
		btn9.setBounds(151, 75, 50, 50);
		contentPane.add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Istnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBackground(Color.GRAY);
		btnplus.setBounds(222, 75, 50, 50);
		contentPane.add(btnplus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn4.getText();
				textField.setText(Enum);
			}
		});
		btn4.setBackground(Color.GRAY);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 136, 50, 50);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn5.getText();
				textField.setText(Enum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBackground(Color.GRAY);
		btn5.setBounds(80, 136, 50, 50);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn6.getText();
				textField.setText(Enum);
			}
		});
		btn6.setBackground(Color.GRAY);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(150, 136, 50, 50);
		contentPane.add(btn6);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Istnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBackground(Color.GRAY);
		btnminus.setBounds(220, 136, 50, 50);
		contentPane.add(btnminus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn1.getText();
				textField.setText(Enum);
			}
		});
		btn1.setBackground(Color.GRAY);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 197, 50, 50);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn2.getText();
				textField.setText(Enum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBackground(Color.GRAY);
		btn2.setBounds(80, 197, 50, 50);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn3.getText();
				textField.setText(Enum);
			}
		});
		btn3.setBackground(Color.GRAY);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(150, 197, 50, 50);
		contentPane.add(btn3);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Istnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmult.setBackground(Color.GRAY);
		btnmult.setBounds(220, 197, 50, 50);
		contentPane.add(btnmult);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enum=textField.getText()+btn0.getText();
				textField.setText(Enum);
			}
		});
		btn0.setBackground(Color.GRAY);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(104, 319, 84, 50);
		contentPane.add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dot=textField.getText()+".";
				textField.setText("");
				textField.setText(dot);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBackground(Color.GRAY);
		btndot.setBounds(10, 258, 50, 50);
		contentPane.add(btndot);
		
		JButton btnbackspace= new JButton("<--");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()>0) {
					String bk="";
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(str.length()-1);
					bk=str.toString();
					textField.setText(bk);
				}
			}
		});
	
		btnbackspace.setBackground(Color.GRAY);
		btnbackspace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbackspace.setBounds(10, 319, 84, 50);
		contentPane.add(btnbackspace);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans="";
				IIndnum=Double.parseDouble(textField.getText());
				if(operation=="+") {
					res=Istnum+IIndnum;
					ans=String.format("%.2f", res);
				}
				else if(operation=="-") {
					res=Istnum-IIndnum;
					ans=String.format("%.2f", res);
				}
             	else if(operation=="*") {
             		res=Istnum*IIndnum;
					ans=String.format("%.2f", res);
				}
              	else if(operation=="/") {
              		res=Istnum/IIndnum;
					ans=String.format("%.2f", res);
	}
	            else if(operation=="rem") {
	            	res=Istnum%IIndnum;
					ans=String.format("%.2f", res);
	}
				textField.setText(ans);
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBackground(Color.ORANGE);
		btnequal.setBounds(80, 258, 50, 50);
		contentPane.add(btnequal);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Istnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="/";
			}
		});
		btndiv.setBackground(Color.GRAY);
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 19));
		btndiv.setBounds(220, 258, 50, 50);
		contentPane.add(btndiv);
		
		JButton btnsqr = new JButton("%");
		btnsqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Istnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="rem";
			}
		});
		btnsqr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsqr.setBackground(Color.GRAY);
		btnsqr.setBounds(198, 319, 74, 50);
		contentPane.add(btnsqr);
		
		JButton btnback = new JButton("C");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnback.setBackground(Color.GRAY);
		btnback.setBounds(151, 258, 50, 50);
		contentPane.add(btnback);
		
		
	}
}
