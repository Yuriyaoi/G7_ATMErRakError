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

public class Balance extends JFrame 
{

	private JPanel panel;
	private JLabel background;
	private JButton statementButton;
	private JButton depositButton;
	private JButton withdrawButton;
	private JButton logoutButton;
	private JLabel balanceLabel;
	private JLabel idLabel;
	private JLabel nameLabel;
	
	public Balance() 
        {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		nameLabel = new JLabel("");
		nameLabel.setBounds(300, 171, 249, 35);
		getContentPane().add(nameLabel);
		
		idLabel = new JLabel("");
		idLabel.setBounds(300, 259, 249, 35);
		getContentPane().add(idLabel);
		
		balanceLabel = new JLabel("");
		balanceLabel.setBounds(84, 428, 249, 35);
		getContentPane().add(balanceLabel);
		
		logoutButton = new JButton("Logout");
		logoutButton.setBounds(101, 534, 108, 40);
		logoutButton.setBackground(new Color(85, 85, 85));
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setFocusPainted(false); //กรอบตัวอักษร
		logoutButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		getContentPane().add(logoutButton);
		
		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(542, 428, 181, 47);
		setButtonStyle(withdrawButton);
		getContentPane().add(withdrawButton);
		
		depositButton = new JButton("Deposit");
		depositButton.setBounds(542, 486, 181, 47);
		setButtonStyle(depositButton);
		getContentPane().add(depositButton);
		
		statementButton = new JButton("Statement");
		statementButton.setBounds(542, 543, 181, 47);
		setButtonStyle(statementButton);
		getContentPane().add(statementButton);
		
		background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/view/Balance.png")));
		background.setBounds(22, 0, 800, 600);
		getContentPane().add(background);
		panel.setLayout(null);
	}
        
        public static void main(String[] args) 
        {
		Balance frame = new Balance();
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