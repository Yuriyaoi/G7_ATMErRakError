/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


/**
 *
 * @author Yuri
 */

public class LogIn_View extends JFrame{
    private JTextField insertID;
    private JPasswordField insertPin;
    private JButton logInButton;
    private JLabel message1;
    private JLabel message2;
    private JLabel message3;
    
    public LogIn_View(){
        initComponents();
    }
    
     private void initComponents() {

        message1 = new JLabel();
        message2 = new JLabel();
        message3 = new JLabel();
        insertID = new JTextField();
        logInButton = new JButton();
        insertPin = new JPasswordField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TK-ATM ver.1.0.0");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("GG.png")));
        setResizable(false);

        message1.setBackground(new Color(255, 255, 255));
        message1.setFont(new Font("Tahoma", 1, 36)); // NOI18N
        message1.setForeground(new Color(255, 0, 0));
        message1.setHorizontalAlignment(SwingConstants.CENTER);
        message1.setText("Welcome");
        message1.setBorder(BorderFactory.createLineBorder(new Color(255, 51, 0), 2));

        message2.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        message2.setForeground(new Color(255, 0, 51));
        message2.setHorizontalAlignment(SwingConstants.CENTER);
        message2.setText("to");
        message2.setBorder(BorderFactory.createLineBorder(new Color(255, 51, 0), 2));

        message3.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        message3.setForeground(new Color(255, 0, 0));
        message3.setHorizontalAlignment(SwingConstants.CENTER);
        message3.setText("TK-ATM");
        message3.setBorder(BorderFactory.createLineBorder(new Color(255, 51, 0), 2));

        insertID.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        insertID.setForeground(new Color(153, 153, 153));
        insertID.setHorizontalAlignment(JTextField.CENTER);
        insertID.setText("Please Insert Your ID");
//        insertID.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                insertIDMouseClicked(evt);
//            }
//            public void mousePressed(java.awt.event.MouseEvent evt) {
//                insertIDMousePressed(evt);
//            }
//        });
//        insertID.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                insertIDActionPerformed(evt);
//            }
//        });
//        insertID.addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyPressed(java.awt.event.KeyEvent evt) {
//                insertIDKeyPressed(evt);
//            }
//        });

        logInButton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        logInButton.setText("Log in");
        
//        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                logInButtonMouseClicked(evt);
//            }
//        });
//        logInButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                logInButtonActionPerformed(evt);
//            }
//        });
        
        insertPin.setForeground(new Color(153, 153, 153));
        insertPin.setHorizontalAlignment(JTextField.CENTER);
        insertPin.setText("Ipin");
//        insertPin.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                insertPinMouseClicked(evt);
//            }
//            public void mousePressed(java.awt.event.MouseEvent evt) {
//                insertPinMousePressed(evt);
//            }
//        });
//        insertPin.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                insertPinActionPerformed(evt);
//            }
//        });
//        insertPin.addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyPressed(java.awt.event.KeyEvent evt) {
//                insertPinKeyPressed(evt);
//            }
//        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(message1, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(message2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(message3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                    .addComponent(insertID, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertPin, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(logInButton, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(message1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(message2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(message3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(insertID, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(insertPin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(logInButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }                     
    
    public String getUsername(){
        return insertID.getText();
    }
    
    public String getPassword(){
        return insertPin.getText();
    }
    
    public void setActionLogIn(ActionListener act){
        logInButton.addActionListener(act);
    }
}
