package ctgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ctgui {

	private JFrame frame;
	private JTextField Lf;
	private JTextField Lb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ctgui window = new ctgui();
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
	public ctgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel FL = new JLabel("Frist Name");
		FL.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(FL);
		
		Lf = new JTextField();
		Lf.setBounds(88, 8, 86, 20);
		frame.getContentPane().add(Lf);
		Lf.setColumns(10);
		
		JLabel LB = new JLabel("Last Name");
		LB.setBounds(204, 11, 79, 14);
		frame.getContentPane().add(LB);
		
		Lb = new JTextField();
		Lb.setBounds(274, 8, 86, 20);
		frame.getContentPane().add(Lb);
		Lb.setColumns(10);
		
		JComboBox NU = new JComboBox();
		NU.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		NU.setBounds(70, 63, 46, 22);
		frame.getContentPane().add(NU);
		
		JLabel DCP = new JLabel("");
		DCP.setBounds(24, 178, 375, 111);
		frame.getContentPane().add(DCP);
		
		JLabel GR = new JLabel("Grate");
		GR.setBounds(24, 67, 46, 14);
		frame.getContentPane().add(GR);
		
		JComboBox CH = new JComboBox();
		CH.setModel(new DefaultComboBoxModel(new String[] {"CHHS", "JFHS", "PHS"}));
		CH.setBounds(242, 63, 137, 22);
		frame.getContentPane().add(CH);
		
		JLabel SH = new JLabel("School");
		SH.setBounds(204, 67, 46, 14);
		frame.getContentPane().add(SH);
		
		JButton SBT = new JButton("Submet");
		SBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String firstN =Lf.getText();
				String lastN =Lb.getText();
				String Grade = NU.getSelectedItem().toString();
				String School = CH.getSelectedItem().toString();
				if (School.equalsIgnoreCase("CHHS")) 
				{
					
				}
				
				
				DCP.setText("First name -"+firstN+" "+"Last name -"+lastN +" Grade:" + Grade+" School:" + School);
				
			}
		});
		SBT.setBounds(120, 104, 92, 35);
		frame.getContentPane().add(SBT);
		
		JLabel Ma = new JLabel("");
		Ma.setBounds(242, 111, 120, 96);
		frame.getContentPane().add(Ma);
		
		
	}
}
