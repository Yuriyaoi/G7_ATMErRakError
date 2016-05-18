
package view;

import atm_tk.getDB;
import atm_tk.storeData;
import java.awt.Color;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
                no1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no1ActionPerformed(evt);
                    }
                });
		getContentPane().add(no1);
		
		no2 = new JButton("2");
		no2.setBounds(361, 298, 81, 43);
		setButtonStyle(no2);
                no2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no2ActionPerformed(evt);
                    }
                });
		getContentPane().add(no2);
		
		no3 = new JButton("3");
		no3.setBounds(465, 298, 81, 43);
		setButtonStyle(no3);
                no3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no3ActionPerformed(evt);
                    }
                });
		getContentPane().add(no3);
		
		no4 = new JButton("3");
		no4.setBounds(255, 352, 81, 43);
		setButtonStyle(no4);
                no4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no4ActionPerformed(evt);
                    }
                });
		getContentPane().add(no4);
		
		no5 = new JButton("5");
		no5.setBounds(361, 352, 81, 43);
		setButtonStyle(no5);
                no5.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no5ActionPerformed(evt);
                    }
                });
		getContentPane().add(no5);
		
		no6 = new JButton("6");
		no6.setBounds(465, 352, 81, 43);
		setButtonStyle(no6);
                no6.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no6ActionPerformed(evt);
                    }
                });
		getContentPane().add(no6);
		
		no7 = new JButton("7");
		no7.setBounds(255, 406, 81, 43);
		setButtonStyle(no7);
                no7.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no7ActionPerformed(evt);
                    }
                });
		getContentPane().add(no7);
		
                no8 = new JButton("8");
                no8.setBounds(361, 406, 81, 43);
                setButtonStyle(no8);
                no8.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no8ActionPerformed(evt);
                    }
                });
		getContentPane().add(no8);
		
		no9 = new JButton("9");
		no9.setBounds(465, 406, 81, 43);
		setButtonStyle(no9);
                no9.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no9ActionPerformed(evt);
                    }
                });
		getContentPane().add(no9);
		
		reset = new JButton("Reset");
		reset.setBounds(234, 465, 102, 33);
		setButtonStyle(reset);
                reset.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        resetActionPerformed(evt);
                    }
                });
		getContentPane().add(reset);
		
		no0 = new JButton("0");
		no0.setBounds(361, 460, 81, 43);
		setButtonStyle(no0);
                no0.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        no0ActionPerformed(evt);
                    }
                });
		getContentPane().add(no0);
		
		delete = new JButton("Delete");
		delete.setBounds(465, 465, 109, 33);
		setButtonStyle(delete);
                delete.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        deleteActionPerformed(evt);
                    }
                });
		getContentPane().add(delete);
		
		enter = new JButton("Enter");
		enter.setBounds(348, 514, 109, 33);
		setButtonStyle(enter);
		getContentPane().add(enter);
		
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
		getContentPane().add(back);
		
		amountLabel = new JLabel("");
                amountLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 20));
                amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		amountLabel.setBounds(255, 208, 263, 33);
		getContentPane().add(amountLabel);
                
                
		JLabel background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/image/Withdraw.png")));
		background.setBounds(0, 0, 800, 600);
		getContentPane().add(background);
		panel.setLayout(null);
		
	}
//        public static void main(String[] args) 
//        {
//		Withdraw frame = new Withdraw();
//		frame.setBounds(100, 100, 800, 600);
//                frame.setUndecorated(true);
//                frame. setLocationRelativeTo(null);
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setVisible(true);
//				
//	}
	public void setButtonStyle(JButton button)
	{
		button.setBackground(new Color(229, 211, 169));
		button.setForeground(new Color(91, 85, 81));
		button.setFocusPainted(false); //กรอบตัวอักษร
		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
	}
        private void backButtonActionPerformed(java.awt.event.ActionEvent evt)
        {                                          
            new Menu().setVisible(true);
            dispose();
        } 
        private void no1ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+1);
        } 
        private void no2ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+2);
        }                                   

        private void no3ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+3);
        }                                   

        private void no4ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+4);
        }                                   

        private void no5ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+5);
        }                                   

        private void no6ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+6);
        }                                   

        private void no7ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+7);
        }                                   

        private void no8ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+8);
        }                                   

        private void no9ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+9);
        }                                   

        private void no0ActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            amountLabel.setText(amountLabel.getText()+0);
        }                                   

        private void resetActionPerformed(java.awt.event.ActionEvent evt) 
        {                                      
            amountLabel.setText("");
        }                                     

        private void deleteActionPerformed(java.awt.event.ActionEvent evt) 
        {                                    
            String s = amountLabel.getText();
            if(s.length()>=1) {
               amountLabel.setText(s.substring(0,s.length()-1));
            }
        }                                   
//        private void enterActionPerformed(java.awt.event.ActionEvent evt) {                                    
//            int num1 = Integer.parseInt(storeData.balance); // set balance(String) convert to nums(int) 
//            int num2 = 0; // set num2 = 0
//            int change;
//            if(amountLabel.getText().length()>=1 && amountLabel.getText().length()<=10) { // des2 must have 1 to 10 length
//               num2 = Integer.parseInt(amountLabel.getText());      // because int can get 10 digit of number (or) billion
//              // get des2(text) text to num2
//            } else if(amountLabel.getText().length() > 10) { // des2 length more than 10
//               JOptionPane.showMessageDialog(null, "It's too much AMOUNT!!"); 
//               amountLabel.setText("");  
//            }
//
//            if(num2==0) { // num2 equal 0 (or) num2 isn't declared by des2(text)
//               JOptionPane.showMessageDialog(null, "Please insert MONEY!!");
//               amountLabel.setText("");
//            } else if(num2 <= 100000) { // num2 must lower equal 100,000
//                if(num2>0 && (num2%20==0||num2%50==0||num2%70==0)) { // if num2 inform of BANKNOTE 70 = 50 + 20
//                    change = num2+ num1;
//                    storeData.balance = Integer.toString(change);
//                    getDB.updateDB();
//                    getDB.updateStatement_De(amountLabel.getText());
//                    JOptionPane.showMessageDialog(null, "\nID : "+storeData.user+"\n"
//                            + "\nName : "+storeData.name+"\n"
//                            + "\nMode : Deposit\n"
//                            + "\nAmount : " + num2 +"\n"
//                            + "\nBalance : " + storeData.balance +"\n");
//                    in.setVisible(true);
//                    this.dispose();
//                } else if(!(num2%20==0||num2%50==0||num2%70==0)){ // if NOT BANKNOTE!!
//                    JOptionPane.showMessageDialog(null, "Plese insert correct money in the form of BANKNOTE!!");
//                    amountLabel.setText("");
//                } 
//            } else { // more than 100,000 about(100,001 to billion)
//                JOptionPane.showMessageDialog(null, "Cannot insert AMOUNT more than 100,000 Baht!!");
//                amountLabel.setText("");
//      }      
                 
}
