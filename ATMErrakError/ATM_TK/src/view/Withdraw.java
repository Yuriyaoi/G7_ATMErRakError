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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Withdraw extends JFrame 
{

	private JPanel panel;
	private JLabel amountLabel;
	private JButton back;
	private JButton delete;
	private JButton no0;
	private JButton no1;
	private JButton no2;
	private JButton no3;
	private JButton no4;
	private JButton no5;
	private JButton no6;
        private JButton no7;
        private JButton no8;
	private JButton no9;
	private JButton enter;
	private JButton reset;	

	public Withdraw()
        {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		no1 = new JButton("1");
		no1.setBounds(255, 298, 81, 43);
		setButtonStyle(no1);
		getContentPane().add(no1);
		
		no2 = new JButton("2");
		no2.setBounds(361, 298, 81, 43);
		setButtonStyle(no2);
		getContentPane().add(no2);
		
		no3 = new JButton("3");
		no3.setBounds(465, 298, 81, 43);
		setButtonStyle(no3);
		getContentPane().add(no3);
		
		no4 = new JButton("3");
		no4.setBounds(255, 352, 81, 43);
		setButtonStyle(no4);
		getContentPane().add(no4);
		
		no5 = new JButton("5");
		no5.setBounds(361, 352, 81, 43);
		setButtonStyle(no5);
		getContentPane().add(no5);
		
		no6 = new JButton("6");
		no6.setBounds(465, 352, 81, 43);
		setButtonStyle(no6);
		getContentPane().add(no6);
		
		no7 = new JButton("7");
		no7.setBounds(255, 406, 81, 43);
		setButtonStyle(no7);
		getContentPane().add(no7);
		
                no8 = new JButton("8");
                no8.setBounds(361, 406, 81, 43);
                setButtonStyle(no8);
		getContentPane().add(no8);
		
		no9 = new JButton("9");
		no9.setBounds(465, 406, 81, 43);
		setButtonStyle(no9);
		getContentPane().add(no9);
		
		reset = new JButton("Reset");
		reset.setBounds(234, 465, 102, 33);
		setButtonStyle(reset);
		getContentPane().add(reset);
		
		no0 = new JButton("0");
		no0.setBounds(361, 460, 81, 43);
		setButtonStyle(no0);
		getContentPane().add(no0);
		
		delete = new JButton("Delete");
		delete.setBounds(465, 465, 109, 33);
		setButtonStyle(delete);
		getContentPane().add(delete);
		
		JButton enter = new JButton("Enter");
		enter.setBounds(336, 514, 109, 33);
		setButtonStyle(enter);
		getContentPane().add(enter);
		
		JButton back = new JButton("Back");
		back.setBounds(15, 535, 109, 33);
		back.setBackground(new Color(85, 85, 85));
		back.setForeground(Color.WHITE);
		back.setFocusPainted(false); //กรอบตัวอักษร
		back.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		getContentPane().add(back);
		
		amountLabel = new JLabel("");
		amountLabel.setBounds(255, 208, 263, 33);
		getContentPane().add(amountLabel);
		JLabel background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/view/Withdraw.png")));
		background.setBounds(0, 0, 800, 600);
		getContentPane().add(background);
		panel.setLayout(null);
		
	}
        public static void main(String[] args) 
        {
		Withdraw frame = new Withdraw();
		frame.setBounds(100, 100, 800, 600);
                frame.setUndecorated(true);
                frame. setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
				
	}
	public void setButtonStyle(JButton button)
	{
		button.setBackground(new Color(229, 211, 169));
		button.setForeground(new Color(91, 85, 81));
		button.setFocusPainted(false); //กรอบตัวอักษร
		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
	}

}
