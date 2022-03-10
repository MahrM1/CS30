import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorldGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldGui window = new HelloWorldGui();
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
	public HelloWorldGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn = new JButton("button");
		
		btn.setBounds(94, 0, 231, 62);
		frame.getContentPane().add(btn);
		
		JLabel LB = new JLabel("");
		LB.setForeground(Color.BLACK);
		LB.setBackground(new Color(240, 240, 240));
		LB.setBounds(35, 84, 289, 62);
		frame.getContentPane().add(LB);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				LB.setText("Hello Mahr");
			}
		});
	}
}
