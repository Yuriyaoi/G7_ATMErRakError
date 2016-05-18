package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;


public class  BillPayment extends JFrame 
{
	private JPanel panel;
	private JTextField bill_ID;
	private JTextField amount;
	private JButton back;
        private JButton submit;
        private JLabel background;
	public BillPayment() 
        {
                
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);

		
		setContentPane(panel);
		
		bill_ID = new JTextField();
		bill_ID.setBounds(275, 202, 296, 33);
                bill_ID.setBorder(null);
		panel.add(bill_ID);
		bill_ID.setColumns(10);
		
		amount = new JTextField();
		amount.setColumns(10);
                amount.setBorder(null);
		amount.setBounds(275, 311, 296, 33);
		panel.add(amount);
		
		submit = new JButton("Confirm");
		submit.setBounds(347, 428, 108, 40);
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
                back.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        backButtonActionPerformed(evt);
                    }
                });
		panel.add(back);
		
		background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/image/Bill.jpg")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);
		

                setBounds(100, 100, 800, 600);
                setUndecorated(true);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}   
        private void backButtonActionPerformed(java.awt.event.ActionEvent evt)
        {                                          
            new Menu().setVisible(true);
            dispose();
        } 
}




