import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class BreakAPlates {

	private JFrame frame;
	
	
	JLabel plates,prizeWon;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlates window = new BreakAPlates();
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
	public BreakAPlates()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon p = new ImageIcon("..\\Chapter10\\src\\plates.gif");
		ImageIcon p1 = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon p2 = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon p3 = new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
		ImageIcon p4 = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 414, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel plate = new JLabel("");
		plate.setIcon(new ImageIcon("C:\\Users\\1100015963\\Downloads\\plates.gif"));
		plate.setBounds(66, 22, 270, 71);
		frame.getContentPane().add(plate);
		
		JLabel ST = new JLabel("");
		ST.setIcon(new ImageIcon("C:\\Users\\1100015963\\Downloads\\placeholder.gif"));
		ST.setBounds(138, 152, 125, 68);
		frame.getContentPane().add(ST);
		
		JButton Play = new JButton("Play");
		Play.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent event) 
			{
				String eventName = event.getActionCommand();
				String prize = null;
				
				int ranNum;
				ranNum = (int)(Math.random() * 3);
				
				
				
				if (eventName.equals("Play"))
				{
					if (ranNum == 3) 
					{
						plate.setIcon(p);
						Play.setText("Play Again");
						
					}
					
					if(ranNum == 2) 
					{
						plate.setIcon(p2);
						ST.setIcon(p4);
						
						
						
					}
					
					if(ranNum == 1) 
					{
						plate.setIcon(p1);
						ST.setIcon(p3);
					
					}
					
					
					
				}	
				

			/*
				if (eventName.equals("Play")) 
				{
					
					if ( ranNum == 1)
					{
					
					}
					
					if(ranNum == 2) 
					{
						ST.setIcon(p4);
					}
					
					if(ranNum == 2) 
					{
						ST.setIcon(p3);
					}
				}
				
			*/	
			}
				
		});
		Play.setBounds(123, 104, 140, 37);
		frame.getContentPane().add(Play);
		
		
	}
}
