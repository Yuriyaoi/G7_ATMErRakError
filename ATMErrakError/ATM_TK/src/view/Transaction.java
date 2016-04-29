/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Tanyaluk
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Transaction extends JFrame {

	private JPanel panel;
	private JLabel background;
	private JButton withdrawButton ;
	private JButton tranferButton;
	private JButton depositButton;
	private JButton moreServiceButton;
	private JButton logoutButton;

	public Transaction() 
        {
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(88, 251, 168, 49);
		setButtonStyle(withdrawButton);
		panel.add(withdrawButton);
		
		tranferButton = new JButton("Tranfer");
		tranferButton.setBounds(88, 349, 168, 49);
		panel.add(tranferButton);
		setButtonStyle(tranferButton);
		
		depositButton = new JButton("Deposit ");
		depositButton.setBounds(88, 437, 168, 49);
		setButtonStyle(depositButton);
		panel.add(depositButton);
		
		moreServiceButton = new JButton("More Service");
		moreServiceButton.setBounds(530, 251, 168, 49);
		setButtonStyle(moreServiceButton);
		panel.add(moreServiceButton);
		
		logoutButton = new JButton("Logout");
		logoutButton.setBackground(new Color(85, 85, 85));
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setFocusPainted(false); //กรอบตัวอักษร
		logoutButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		logoutButton.setBounds(530, 344, 168, 49);
		//setButtonStyle(logoutButton);
		panel.add(logoutButton);
		
		background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/view/Transaction.png")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);

	}
        
	public static void main(String[] args)
        {
            Transaction frame = new Transaction();
	    frame.setBounds(100, 100, 800, 600);
            frame.setUndecorated(true);
            frame. setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
				
	}
        
	public void setButtonStyle(JButton button)
	{
		button.setBackground(new Color(82, 132, 131));
		button.setForeground(Color.WHITE);
		button.setFocusPainted(false); //กรอบตัวอักษร
		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
	}
}
