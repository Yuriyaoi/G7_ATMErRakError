package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Menu extends JFrame {

	private JPanel panel;
	private JLabel background;
	private JButton withdrawButton ;
	private JButton balanceButton;
	private JButton depositButton;
	private JButton donateButton;
        private JButton payBillButton;
	private JButton logoutButton;
        private JButton AddCustom;

	public Menu() 
        {
 		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
                
		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(0, 251, 230, 49); // x = 88 ,width = 168 
                withdrawButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
                withdrawButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       withdrawButtonActionPerformed(evt);
                    }
                });
		setButtonStyle(withdrawButton);

		panel.add(withdrawButton);
		
		balanceButton = new JButton("Check Balance");
		balanceButton.setBounds(0, 437, 230, 49); 
		panel.add(balanceButton);
                balanceButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        balanceButtonActionPerformed(evt);
                    }
                });
		setButtonStyle(balanceButton);
		
		depositButton = new JButton("Deposit ");
		depositButton.setBounds(0, 349, 230, 49);
		setButtonStyle(depositButton);
                depositButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        depositButtonActionPerformed(evt);
                    }
                });
		panel.add(depositButton);
		
		donateButton = new JButton("Donate");
		donateButton.setBounds(569, 251, 230, 49); // x = 530
		setButtonStyle(donateButton);
		panel.add(donateButton);
                
                payBillButton = new JButton("Pay Bill");
		payBillButton.setBounds(569, 344, 230, 49);
		setButtonStyle(payBillButton);
                payBillButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                         payBillButtonActionPerformed(evt);
                    }
                });
		panel.add(payBillButton);
		
		logoutButton = new JButton("Logout");
		logoutButton.setBackground(new Color(85, 85, 85));
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setFocusPainted(false); //กรอบตัวอักษร
		logoutButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
                //logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                //logoutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		logoutButton.setBounds(569, 437, 230, 49);
                logoutButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        dispose();
                    }
                });

		panel.add(logoutButton);
		
		background = new JLabel("");
                background.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                background.setIcon(new ImageIcon(getClass().getResource("/image/Transaction.png")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);

                setContentPane(panel);
                setBounds(100, 100, 800, 600);
                setUndecorated(true);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //setVisible(true);

	}
        
	public void setButtonStyle(JButton button)
	{
		button.setBackground(new Color(82, 132, 131));
		button.setForeground(Color.WHITE);
		button.setFocusPainted(false); //กรอบตัวอักษร
                button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
	}
        private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt)
        {                                          
            new Withdraw().setVisible(true);
            dispose();
        } 
        private void depositButtonActionPerformed(java.awt.event.ActionEvent evt)
        {                                          
            new Deposit().setVisible(true);
            dispose();
        } 
         private void balanceButtonActionPerformed(java.awt.event.ActionEvent evt)
        {                                          
            new Balance().setVisible(true);
            dispose();
        } 
//        private void donateButtonActionPerformed(java.awt.event.ActionEvent evt)
//        {                                          
//            new Menu().setVisible(true);
//            dispose();
//        } 
        private void payBillButtonActionPerformed(java.awt.event.ActionEvent evt)
        {                                          
            new BillPayment().setVisible(true);
            dispose();
        } 
}

