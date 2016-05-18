package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import controller.*;

public class Login extends JFrame 
{
	private JPanel panel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton loginButton;
        private JLabel closeButton;
        private JLabel background;

        //Controller controller = new Controller();
 
        /**
         * constructor to populate components
         */
	public Login() 
        {
                
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		usernameField = new JTextField();
		usernameField.setHorizontalAlignment(SwingConstants.CENTER);
		usernameField.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		usernameField.setBorder(null);
		usernameField.setBounds(309, 270, 177, 32);
		panel.add(usernameField);
		//usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBorder(null);
		passwordField.setBounds(319, 348, 177, 32);
		panel.add(passwordField);
		
		loginButton = new JButton("Login");
		loginButton.setBackground(new Color(85, 85, 85));
		loginButton.setForeground(Color.WHITE);
		loginButton.setFocusPainted(false); //กรอบตัวอักษร
		loginButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		loginButton.setBounds(339, 429, 112, 48);
                loginButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        loginButtonActionPerformed(evt);
                }
                });
		panel.add(loginButton);
		
		closeButton = new JLabel();
                closeButton.setIcon(new ImageIcon(getClass().getResource("/image/Close Button.png")));
		closeButton.setBounds(760, 0, 40, 40);
		closeButton.addMouseListener(new MouseAdapter() 
                {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				//closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("K:\\WorkSpace\\UserInterface\\src\\LoginForm\\ButtonHover.png")));
				System.exit(0);
			}
		});
		panel.add(closeButton);
		
		background = new JLabel();
		background.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                background.setIcon(new ImageIcon(getClass().getResource("/image/Draft_Login1 Test.jpg")));
		background.setBounds(0, 0, 800, 600);
		panel.add(background);
		
		setContentPane(panel);
                setBounds(100, 100, 800, 600);
                setUndecorated(true);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
	}   
        private void loginButtonActionPerformed(java.awt.event.ActionEvent evt)
        {                                          
            new Menu().setVisible(true);
            dispose();
        }   
}
