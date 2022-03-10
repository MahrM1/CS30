import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisbleBy3 {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisbleBy3 window = new DivisbleBy3();
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
	public DivisbleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb = new JLabel("Enter an integer:");
		lb.setBounds(29, 33, 142, 31);
		frame.getContentPane().add(lb);
		
		tf1 = new JTextField();
		tf1.setBounds(181, 33, 176, 31);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JButton btn = new JButton("Check");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int num , Num; 
				
				num = Integer.parseInt(tf1.getText().toString());
				
				 Num = num / 3;
				 tf2.setText(Integer.toString(Num));
				 
				 
				  
				 
				
			}
		});
		btn.setBounds(29, 94, 142, 31);
		frame.getContentPane().add(btn);
		
		tf2 = new JTextField();
		tf2.setBounds(181, 94, 176, 31);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
	}
}

