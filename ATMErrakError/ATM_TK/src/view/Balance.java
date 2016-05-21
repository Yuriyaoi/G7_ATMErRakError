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


public class Balance extends JFrame 
{
	private JPanel panel;
	private JLabel nameLabel;
	private JLabel idLabel;
        private JLabel balanceLabel;
	private JButton back;
        private JButton submit;
        private JLabel background;
	public Balance() 
        {
                
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);	
		
		nameLabel = new JLabel("");
		nameLabel.setBounds(300, 175, 250, 33);
                nameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 20));
                nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                nameLabel.setBorder(null);
		panel.add(nameLabel);
		
		idLabel = new JLabel("");
                idLabel.setBorder(null);
		idLabel.setBounds(300, 295, 250, 33);
                idLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 20));
                idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		panel.add(idLabel);
		
                balanceLabel = new JLabel("");
                balanceLabel.setBorder(null);
		balanceLabel.setBounds(300, 410, 220, 33);
                balanceLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 20));
                balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		panel.add(balanceLabel);
                	
		back = new JButton("Back");
		back.setBounds(347, 520, 108, 40);
		back.setBackground(new Color(85, 85, 85));
		back.setForeground(Color.WHITE);
		back.setFocusPainted(false); //กรอบตัวอักษร
		back.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel.add(back);
		
		background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/image/Balance1.png")));
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
        public void setIDLabel(String id){
            this.idLabel.setText(id);
        }
        public void setNameLabel(String name){
            this.nameLabel.setText(name);
        }
        public void setBalanceLabel(String balance){
            this.balanceLabel.setText(balance);
        }
}