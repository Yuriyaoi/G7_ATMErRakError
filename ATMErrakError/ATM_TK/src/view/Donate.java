package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;


public class  Donate extends JFrame 
{
	private JPanel panel;
	private JTextField destinationID;
	private JTextField amount;
        private JLabel balanceLabel;
	private JButton back;
        private JButton submit;
        private JLabel background;
        
        private JRadioButton org1;
        private JRadioButton org2;
        private JRadioButton org3;
        private JRadioButton org4;
        private ButtonGroup group;
        
	public Donate() 
        {         
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		destinationID = new JTextField();
		destinationID.setHorizontalAlignment(SwingConstants.CENTER);
                destinationID.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		destinationID.setBounds(265, 280, 270, 33);
                destinationID.setBorder(null);
		panel.add(destinationID);
		destinationID.setColumns(10);
		
		amount = new JTextField();
		amount.setHorizontalAlignment(SwingConstants.CENTER);
                amount.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
                amount.setBorder(null);
		amount.setBounds(285, 408, 220, 33);
		panel.add(amount);
		       
                org1 = new JRadioButton("UNICEF");
                org1.setBounds(225, 130, 130, 30);
                org1.setFocusPainted(false);
                org1.setBackground(new Color(65, 171, 225));
                org1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
                panel.add(org1);
                
                org2 = new JRadioButton("WHO");
                org2.setBounds(225, 170, 130, 30);
                org2.setFocusPainted(false);
                org2.setBackground(new Color(65, 171, 225));
                org2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
                panel.add(org2);
                
                org3 = new JRadioButton("World Animals Protection");
                org3.setBounds(370, 130, 200, 30);
                org3.setFocusPainted(false);
                org3.setBackground(new Color(65, 171, 225));
                org3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
                panel.add(org3);
                
                org4 = new JRadioButton("The Mirror Foundation");
                org4.setBounds(370, 170, 200, 30);
                org4.setFocusPainted(false);
                org4.setBackground(new Color(65, 171, 225));
                org4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
                panel.add(org4);
                
                group = new ButtonGroup();
                group.add(org1);
                group.add(org2);
                group.add(org3);
                group.add(org4);
                
		submit = new JButton("Submit");
		submit.setBounds(347, 470, 108, 40);
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
                background.setIcon(new ImageIcon(getClass().getResource("/image/Donate2.png")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);
			
		setContentPane(panel);
                setBounds(100, 100, 800, 600);
                setUndecorated(true);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}   
        public void setActionBack(ActionListener act)
        {
            back.addActionListener(act);
        }
        public void setActionOrg1(ActionListener act)
        {
            org1.addActionListener(act);
        }
        public void setActionOrg2(ActionListener act)
        {
            org2.addActionListener(act);
        }
        public void setActionOrg3(ActionListener act)
        {
            org3.addActionListener(act);
        }
        public void setActionOrg4(ActionListener act)
        {
            org4.addActionListener(act);
        }
        public JRadioButton getOrg1()
        {
            return org1;
        }
        public JRadioButton getOrg2()
        {
            return org2;
        }
        public JRadioButton getOrg3()
        {
            return org3;
        }
        public JRadioButton getOrg4()
        {
            return org4;
        }
        public void setDestinationID(String str)
        {
            this.destinationID.setText(str);
        }
        public static void main(String[] arg)
        {
            Donate don = new Donate();
            don.setVisible(true);
        }
}




