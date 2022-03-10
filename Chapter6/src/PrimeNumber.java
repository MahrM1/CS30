import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class PrimeNumber {

	private JFrame frame;

	public boolean isprime(int x) 
	{
		if ((x %2) !=0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumber window = new PrimeNumber();
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
	public PrimeNumber() {
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
		
		
		
		JTextArea tF = new JTextArea();
		tF.setBounds(155, 29, 133, 22);
		frame.getContentPane().add(tF);
		
		JLabel PN = new JLabel("PrimeNumber");
		PN.setBounds(63, 33, 82, 17);
		frame.getContentPane().add(PN);
		
		JLabel TF = new JLabel("");
		TF.setBounds(48, 179, 309, 44);
		frame.getContentPane().add(TF);
		
		
		JButton Btn = new JButton("Submet");
		Btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int userNum = Integer.parseInt(tF.getText());
				
				if(isprime(userNum))
				{
					TF.setText("Prime Number");
				}
				else
				{
					TF.setText("NOT Prime Number");
				}
				
			}
		});
		Btn.setBounds(149, 82, 89, 23);
		frame.getContentPane().add(Btn);
		
		
		
		
	
	}
}
