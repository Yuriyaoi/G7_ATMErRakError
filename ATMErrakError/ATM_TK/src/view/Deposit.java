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


public class Deposit extends JFrame 
{

	private JPanel panel;
	private JLabel amountLabel;
        private JLabel background;
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
        //private JButton back;
	
	public Deposit() 
        {
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
                panel.setLayout(null);
		
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
		
		no4 = new JButton("4");
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
		
		enter = new JButton("Enter");
		enter.setBounds(348, 514, 109, 33);
		setButtonStyle(enter);
		getContentPane().add(enter);
		
		back = new JButton("back");
		back.setBounds(15, 535, 109, 33);
		back.setBackground(new Color(85, 85, 85));
		back.setForeground(Color.WHITE);
		back.setFocusPainted(false); //กรอบตัวอักษร
		back.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		getContentPane().add(back);
		
		amountLabel = new JLabel("");
                amountLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 20));
                amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		amountLabel.setBounds(255, 208, 263, 33);
		getContentPane().add(amountLabel);
		
		background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/image/Deposit1.png")));
		background.setBounds(0, 0, 800, 600);
		getContentPane().add(background);
		panel.setLayout(null);
                
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setUndecorated(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
	}
	public void setButtonStyle(JButton button)
	{
                button.setBackground(new Color(229, 211, 169));
                button.setForeground(new Color(91, 85, 81));
		button.setFocusPainted(false); //กรอบตัวอักษร
		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
	}
        
        public void setActionbackButton(ActionListener act)
        {
            back.addActionListener(act);
        }
        public void setAmount(String amount)
        {
            this.amountLabel.setText(amount);
        }

        public String getAmount()
        {
            return this.amountLabel.getText();
        }
        public void setActionNo1(ActionListener act)
        {
            no1.addActionListener(act);
        }
        public void setActionNo2(ActionListener act)
        {
            no2.addActionListener(act);
        }
        public void setActionNo3(ActionListener act)
        {
            no3.addActionListener(act);
        }
        public void setActionNo4(ActionListener act)
        {
            no4.addActionListener(act);
        }
        public void setActionNo5(ActionListener act)
        {
            no5.addActionListener(act);
        }
        public void setActionNo6(ActionListener act)
        {
            no6.addActionListener(act);
        }
        public void setActionNo7(ActionListener act)
        {
            no7.addActionListener(act);
        }
        public void setActionNo8(ActionListener act)
        {
            no8.addActionListener(act);
        }
        public void setActionNo9(ActionListener act)
        {
            no9.addActionListener(act);
        }
        public void setActionNo0(ActionListener act)
        {
            no0.addActionListener(act);
        }
        public void setActionReset(ActionListener act)
        {
            reset.addActionListener(act);
        }
        public void setActionDelete(ActionListener act)
        {
            delete.addActionListener(act);
        }
        public void setActionEnter(ActionListener act)
        {
            enter.addActionListener(act);
        }
}

