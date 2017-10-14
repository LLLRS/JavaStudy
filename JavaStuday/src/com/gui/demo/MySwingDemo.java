package gui.demo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MySwingDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JButton bt7 = new JButton("7");
	private JTextField tf;
	private StringBuilder tp = new StringBuilder();
	private static int comflag = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwingDemo frame = new MySwingDemo();
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
	public MySwingDemo() {
		setTitle("\u7B80\u6613\u4E24\u4F4D\u6570\u8BA1\u7B97\u5668");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(6, 6, 371, 63);
		contentPane.add(tf);
		tf.setColumns(20);
		
		JLabel label = new JLabel("");
		label.setBounds(81, 6, 75, 63);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(156, 6, 75, 63);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(231, 6, 75, 63);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(306, 6, 75, 63);
		contentPane.add(label_3);
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println("button7 run .....");
				tp.append(7);
				tf.setText(tp.toString());
			}
		});
		bt7.setBounds(6, 69, 75, 63);
		contentPane.add(bt7);
		
		JButton bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tp.append(8);
				tf.setText(tp.toString());
			}
		});
		bt8.setBounds(81, 69, 75, 63);
		contentPane.add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.setBounds(156, 69, 75, 63);
		bt9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tp.append(9);
				tf.setText(tp.toString());
			}
		});
		contentPane.add(bt9);
		
		JButton c1 = new JButton("+");
		c1.setBounds(231, 69, 75, 63);
		c1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tp.append('+');
				tf.setText(tp.toString());
				comflag = 1;
			}
		});
		contentPane.add(c1);
		
		JButton c2 = new JButton("-");
		c2.setBounds(306, 69, 75, 63);
		c2.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				tp.append('-');
				tf.setText(tp.toString());
				comflag = 2;
				
			}
		});
		contentPane.add(c2);
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tp.append(4);
				tf.setText(tp.toString());
			}
		});
		bt4.setBounds(6, 132, 75, 63);
		contentPane.add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tp.append(5);
				tf.setText(tp.toString());
			}
		});
		bt5.setBounds(81, 132, 75, 63);
		contentPane.add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tp.append(6);
				tf.setText(tp.toString());

			}
		});
		bt6.setBounds(156, 132, 75, 63);
		contentPane.add(bt6);
		
		JButton c3 = new JButton("*");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tp.append('*');
				tf.setText(tp.toString());
				comflag = 3;
			}
		});
		c3.setBounds(231, 132, 75, 63);
		contentPane.add(c3);
		
		JButton c4 = new JButton("/");
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tp.append('/');
				tf.setText(tp.toString());
				comflag = 4;
			}
		});
		c4.setBounds(306, 132, 75, 63);
		contentPane.add(c4);
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tp.append(1);
				tf.setText(tp.toString());
			}
		});
		bt1.setBounds(6, 195, 75, 63);
		contentPane.add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tp.append(2);
				tf.setText(tp.toString());
			}
		});
		bt2.setBounds(81, 195, 75, 63);
		contentPane.add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tp.append(3);
				tf.setText(tp.toString());
			}
		});
		bt3.setBounds(156, 195, 75, 63);
		contentPane.add(bt3);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tp.append(0);
				tf.setText(tp.toString());
			}
		});
		bt0.setBounds(231, 195, 75, 63);
		contentPane.add(bt0);
		
		JButton c5 = new JButton("=");
		c5.setBounds(306, 195, 75, 63);
		c5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				switch (comflag) {
				case 1: MyAdd();break;
				case 2:	MySub();break;
				case 3:	MyMul();break;
				case 4:	MyDiv();break;
				default:break;
				}
				
				
			}
		});
		contentPane.add(c5);
	}

	private void MyAdd() {
			String s = tf.getText();
//					System.out.println(s);
			String[] sp = new String[2];
			sp = s.split("\\+");
			int[] np = new int[sp.length]; 
			int sum = 0;
			for(int i = 0;i<sp.length;i++) {
				np[i] =  Integer.parseInt(sp[i]);
				//System.out.println(np[i]);
				sum = sum + np[i];
			}
			tf.setText(String.valueOf(sum));
			tp.delete( 0, tp.length() );
	}
	private void MySub(){
	   String s = tf.getText();
		//	System.out.println(s);
		String[] sp = new String[2];
		sp = s.split("\\-");
		int[] np = new int[sp.length]; 

		for(int i = 0;i<sp.length;i++) {
		np[i] =  Integer.parseInt(sp[i]);
		}
		int sub = np[0] - np[1];
		tf.setText(String.valueOf(sub));
		tp.delete( 0, tp.length() );
	}
	private void MyMul(){
		   String s = tf.getText();
			//	System.out.println(s);
			String[] sp = new String[2];
			sp = s.split("\\*");
			int[] np = new int[sp.length]; 

			for(int i = 0;i<sp.length;i++) {
			np[i] =  Integer.parseInt(sp[i]);
			}
			int mul = np[0] * np[1];
			tf.setText(String.valueOf(mul));
			tp.delete( 0, tp.length() );
		}
	private void MyDiv(){
		   String s = tf.getText();
			//	System.out.println(s);
			String[] sp = new String[2];
			sp = s.split("\\/");
			int[] np = new int[sp.length]; 

			for(int i = 0;i<sp.length;i++) {
			np[i] =  Integer.parseInt(sp[i]);
			}
			int div = np[0] / np[1];
			tf.setText(String.valueOf(div));
			tp.delete( 0, tp.length() );
		}
}
