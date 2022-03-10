import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion {

	private JFrame frame;
	private JLabel lb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 194);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb = new JLabel("Select a conversion type:");
		lb.setBounds(33, 27, 277, 27);
		frame.getContentPane().add(lb);
		
		JComboBox CB = new JComboBox();
		CB.setModel(new DefaultComboBoxModel(new String[] {"feet to meters", "inch to centimeters", "gallon to liters", "pound to kilograms"}));
		CB.setSelectedIndex(0);
		CB.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CB.setToolTipText("");
		CB.setBackground(new Color(255, 255, 255));
		CB.setBounds(33, 60, 226, 22);
		frame.getContentPane().add(CB);
		
		lb1 = new JLabel("");
		lb1.setBounds(33, 104, 160, 40);
		frame.getContentPane().add(lb1);
		
		JButton btn = new JButton("Chick");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String conversion = CB.getActionCommand();
				
				
				if(CB.getSelectedItem().equals("feet to meters")) 
				{
					conversion = "1 foot = 0.3048";
				}
				
				else if  (CB.getSelectedItem().equals("inch to centimeters"))
				{
					conversion = "1 inch = 2.45 centimeters";
				}
				
				else if  (CB.getSelectedItem().equals("gallon to liters")) 
				{
					conversion= "1 gallon = 4.5461 liters";
				}
				
				else if  (CB.getSelectedItem().equals("pound to kilograms")) 
				{
					conversion ="1 pound = 0.4536 kilograms";
				}
				
				
				lb1.setText( conversion );
				
				
			}
		});
		btn.setBounds(203, 106, 71, 38);
		frame.getContentPane().add(btn);
	}
}
