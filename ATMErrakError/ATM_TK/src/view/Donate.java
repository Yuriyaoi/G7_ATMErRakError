package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class  Donate extends JFrame 
{
	private JPanel panel;
	private JTextField destinationID;
	private JTextField amount;
        private JLabel balanceLabel;
	private JButton back;
        private JButton submit;
        private JLabel background;
	public Donate() 
        {         
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		destinationID = new JTextField();
		destinationID.setHorizontalAlignment(SwingConstants.CENTER);
                destinationID.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		destinationID.setBounds(265, 220, 270, 33);
                destinationID.setBorder(null);
		panel.add(destinationID);
		destinationID.setColumns(10);
		
		amount = new JTextField();
		amount.setHorizontalAlignment(SwingConstants.CENTER);
                amount.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
                amount.setBorder(null);
		amount.setBounds(285, 335, 220, 33);
		panel.add(amount);
		                
		submit = new JButton("Submit");
		submit.setBounds(347, 430, 108, 40);
                submit.setBackground(new Color(82, 132, 131));
		submit.setForeground(Color.WHITE);
		submit.setFocusPainted(false); //กรอบตัวอักษร
		submit.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel.add(submit);
		
                back = new JButton("Back");
		back.setBounds(15, 535, 109, 33);
		back.setBackground(new Color(85, 85, 85));
		back.setForeground(Color.WHITE);
		back.setFocusPainted(false); //กรอบตัวอักษร
		back.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel.add(back);
		
		background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/image/Donate1.png")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);
			
		setContentPane(panel);
                setBounds(100, 100, 800, 600);
                setUndecorated(true);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}   
        public void setActionBack(ActionListener act)
        {
            back.addActionListener(act);
        }
        
        
}




