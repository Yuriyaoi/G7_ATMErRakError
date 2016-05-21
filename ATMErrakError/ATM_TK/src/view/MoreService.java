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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MoreService extends JFrame 
{

	private JPanel panel;
	private JButton tranferButton;
	private JButton logoutButton;
	private JButton payBillButton;
	private JButton backButton;
        private JButton statement;

	public MoreService() 
        {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		payBillButton = new JButton("Pay Bill");
		payBillButton.setBounds(0, 251, 230, 49);
		payBillButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		payBillButton.setBackground(new Color(82, 132, 131));
		payBillButton.setForeground(Color.WHITE);
		payBillButton.setFocusPainted(false); //กรอบตัวอักษร
		//setButtonStyle(tranferButton);
		panel.add(payBillButton);
		
		tranferButton = new JButton("Tranfer");
		tranferButton.setBounds(0, 344, 230, 49);
		panel.add(tranferButton);
		setButtonStyle(tranferButton);
		
                statement = new JButton("Statement");
		statement.setBounds(0, 437, 230, 49); 
		panel.add(statement);;
		setButtonStyle(statement);
                
		logoutButton = new JButton("Log out");
		logoutButton.setBounds(569, 344, 230, 49);
		logoutButton.setBackground(new Color(85, 85, 85));
		logoutButton.setForeground(Color.WHITE);
                logoutButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		logoutButton.setFocusPainted(false); //กรอบตัวอักษร
		panel.add(logoutButton);
		
		backButton = new JButton("Back");
		backButton.setBounds(569, 251, 251, 49);
		backButton.setBackground(new Color(85, 85, 85));
		backButton.setForeground(Color.WHITE);
		backButton.setFocusPainted(false); //กรอบตัวอักษร
		backButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel.add(backButton);
		
		JLabel background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/image/Transaction.png")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);
		
	}
        public static void main(String[] args)
        {
		MoreService frame = new MoreService();
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
        public void setActionBack(ActionListener act){
            backButton.addActionListener(act);
        }
        public void setActionLogout(ActionListener act){
            logoutButton.addActionListener(act);
        }
        public void setActionBillPayment(ActionListener act){
            payBillButton.addActionListener(act);
        }
        public void setActionTranfer(ActionListener act){
            tranferButton.addActionListener(act);
        }
        public void setActionStatement(ActionListener act){
            statement.addActionListener(act);
        }
}
