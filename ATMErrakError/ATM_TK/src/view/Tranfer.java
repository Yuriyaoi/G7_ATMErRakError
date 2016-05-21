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
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Tranfer extends JFrame 
{
	private JPanel panel;
	private JTextField destinationID;
	private JTextField amount;
        private JLabel balanceLabel;
	private JButton submit;
        private JButton back;
        private JLabel background;
	public Tranfer() 
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
                background.setIcon(new ImageIcon(getClass().getResource("/image/Tranfer.png")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);
		
                setContentPane(panel);
                setBounds(100, 100, 800, 600);
                setUndecorated(true);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
	
	public void setButtonStyle(JButton button)
	{
		button.setBackground(new Color(82, 132, 131));
		button.setForeground(Color.WHITE);
		button.setFocusPainted(false); //กรอบตัวอักษร
		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
	}
        public void setActionBack(ActionListener act)
        {
             back.addActionListener(act);
        }
        public void setActionSubmit(ActionListener act)
        {
             submit.addActionListener(act);
        }
        public static void main(String[] args)
        {
            Tranfer tran = new Tranfer();
            tran.setVisible(true);
        }
//        public void setActionWithdraw(ActionListener act)
//        {
//            withdrawButton.addActionListener(act);
//        }
//        public void setActionDeposit(ActionListener act)
//        {
//            depositButton.addActionListener(act);
//        }
//        public void  setActionStatement(ActionListener act)
//        {
//            statementButton.addActionListener(act);
//        }
   
}