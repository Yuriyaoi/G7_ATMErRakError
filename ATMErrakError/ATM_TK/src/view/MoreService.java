///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package view;
//
///**
// *
// * @author Tanyaluk
// */
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Font;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//
//public class MoreService extends JFrame 
//{
//
//	private JPanel panel;
//	private JButton chPassButton;
//	private JButton payBillButton;
//	private JButton donateButton;
//	private JButton backButton;
//
//	public MoreService() 
//        {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 800, 600);
//		
//		setUndecorated(true);
//		setLocationRelativeTo(null);
//		
//		panel = new JPanel();
//		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(panel);
//		panel.setLayout(null);
//		
//		chPassButton = new JButton("Change Password");
//		chPassButton.setBounds(88, 251, 168, 49);
//		chPassButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
//		chPassButton.setBackground(new Color(82, 132, 131));
//		chPassButton.setForeground(Color.WHITE);
//		chPassButton.setFocusPainted(false); //กรอบตัวอักษร
//		//setButtonStyle(chPassButton);
//		panel.add(chPassButton);
//		
//		payBillButton = new JButton("Pay Bill");
//		payBillButton.setBounds(88, 344, 168, 49);
//		panel.add(payBillButton);
//		setButtonStyle(payBillButton);
//		
//		donateButton = new JButton("Donate");
//		donateButton.setBounds(88, 437, 168, 49);
//		setButtonStyle(donateButton);
//		panel.add(donateButton);
//		
//		backButton = new JButton("Back");
//		backButton.setBounds(530, 251, 168, 49);
//		backButton.setBackground(new Color(85, 85, 85));
//		backButton.setForeground(Color.WHITE);
//		backButton.setFocusPainted(false); //กรอบตัวอักษร
//		backButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
//		panel.add(backButton);
//		
//		JLabel background = new JLabel("");
//                background.setIcon(new ImageIcon(getClass().getResource("/view/Transaction.png")));
//		background.setBounds(0, 0, 800, 600);
//		panel.add(background);
//		
//	}
//        public static void main(String[] args)
//        {
//		MoreService frame = new MoreService();
//		frame.setBounds(100, 100, 800, 600);
//                frame.setUndecorated(true);
//                frame. setLocationRelativeTo(null);
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setVisible(true);
//				
//	}
//	public void setButtonStyle(JButton button)
//	{
//		button.setBackground(new Color(82, 132, 131));
//		button.setForeground(Color.WHITE);
//		button.setFocusPainted(false); //กรอบตัวอักษร
//		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
//	}
//}
