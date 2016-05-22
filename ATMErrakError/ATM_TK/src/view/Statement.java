package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Statement extends JFrame{
    
        private JPanel panel;
	private JButton back;
        private JLabel background;
        private JTable table;
	public Statement() 
        {
                
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
                
                
		setContentPane(panel);
		
//		bill_ID = new JTextField();
//		bill_ID.setBounds(275, 202, 296, 33);
//                bill_ID.setBorder(null);
//		panel.add(bill_ID);
//		bill_ID.setColumns(10);
//		
//		amount = new JTextField();
//		amount.setColumns(10);
//                amount.setBorder(null);
//		amount.setBounds(275, 311, 296, 33);
//		panel.add(amount);
		
		
		back = new JButton("Back");
		back.setBounds(15, 535, 109, 33);
		back.setBackground(new Color(85, 85, 85));
		back.setForeground(Color.WHITE);
		back.setFocusPainted(false); //กรอบตัวอักษร
		back.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel.add(back);
		
		background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/image/Statement1.png")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);
		

                setBounds(100, 100, 800, 600);
                setUndecorated(true);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}   
        public void setActionBack(ActionListener act)
        {
            back.addActionListener(act);
        }
        
        private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {                                             
//            DefaultTableModel model = (DefaultTableModel) table.getModel();
//            int c = 0;
//            storeData.no_each = "0";
//            for(int i = 0; i < storeData.cnt ; i++) {
//              getDB.statementStoreNo_Each();
//              c++;
//            }
//            storeData.no_each = "0";
//            for(int i = 1; i < c ; i++) {
//                getDB.statementStoreNo_Each();
//                model.addRow(new Object[]{i,storeData.user,storeData.mode,storeData.amount});
//            }
//            storeData.cnt = 1;
        }                                             
}
