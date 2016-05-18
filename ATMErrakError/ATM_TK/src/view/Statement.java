package view;

import java.awt.Color;
import java.awt.Font;
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

//		table.setModel(new DefaultTableModel
//                (
//                    new Object [][] {},
//                    new String [] {"No.", "ID", "Mode", "Amount"}
//                ) 
//                {
//                    boolean[] canEdit = new boolean [] {false, false, false, false};
//
//                    public boolean isCellEditable(int rowIndex, int columnIndex) 
//                    {
//                        return canEdit [columnIndex];
//                    }
//                });
//                panel.add(table);
            
//                jScrollPane1.setViewportView(User_Statement);
//                if (User_Statement.getColumnModel().getColumnCount() > 0) {
//                User_Statement.getColumnModel().getColumn(0).setResizable(false);
//                User_Statement.getColumnModel().getColumn(0).setPreferredWidth(10);
//                User_Statement.getColumnModel().getColumn(1).setResizable(false);
//                User_Statement.getColumnModel().getColumn(1).setPreferredWidth(100);
//                User_Statement.getColumnModel().getColumn(2).setResizable(false);
//                User_Statement.getColumnModel().getColumn(3).setResizable(false);
//                }
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
                back.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        backButtonActionPerformed(evt);
                    }
                });
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
        private void backButtonActionPerformed(java.awt.event.ActionEvent evt)
        {                                          
            new Menu().setVisible(true);
            dispose();
        }
        private void User_StatementAncestorAdded(javax.swing.event.AncestorEvent evt) {                                             
//            DefaultTableModel model = (DefaultTableModel) User_Statement.getModel();
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
