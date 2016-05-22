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
import javax.swing.JScrollPane;

public class Statement extends JFrame{
    
        private JPanel panel;
	private JButton back;
        private JLabel background;
        private JTable table;
        private JScrollPane scroll;
	public Statement() 
        {         
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);	     
                
                scroll = new JScrollPane();
                scroll.setBounds(130,150,550,350);
                scroll.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
                scroll.setBackground(new Color(65, 171, 225));
                scroll.setBorder(null);
                
                table = new JTable();
                table.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
                table.setBorder(null);
                table.setBackground(new Color(65, 171, 225));
                table.setModel(new DefaultTableModel
                (
                    new Object [][] {}, 
                    new String [] {"Transaction NO", "Customer ID", "Mode", "Amount"}
                ));
                
                scroll.setViewportView(table);
                panel.add(scroll);

		back = new JButton("Back");
		back.setBounds(15, 535, 109, 33);
		back.setBackground(new Color(85, 85, 85));
		back.setForeground(Color.WHITE);
		back.setFocusPainted(false); 
		back.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel.add(back);
		
		background = new JLabel("");
                background.setIcon(new ImageIcon(getClass().getResource("/image/Statement1.png")));
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
}
