
package atm_tk;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ATM_Login extends javax.swing.JFrame {
    getDB d1 = new getDB(); // call getDB
    ATM_Info in = new ATM_Info(); //call ATM info
    public ATM_Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        message3 = new javax.swing.JLabel();
        insertID = new JTextField();
        logInButton = new javax.swing.JButton();
        insertPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TK-ATM ver.1.0.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        insertID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertIDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertIDMousePressed(evt);
            }
        });
        insertID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertIDActionPerformed(evt);
            }
        });
        insertID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insertIDKeyPressed(evt);
            }
        });

        logInButton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        logInButton.setText("logInButtonin");
        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInButtonMouseClicked(evt);
            }
        });
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        insertPin.setForeground(new Color(153, 153, 153));
        insertPin.setHorizontalAlignment(JTextField.CENTER);
        insertPin.setText("Ipin");
        insertPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertPinMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertPinMousePressed(evt);
            }
        });
        insertPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPinActionPerformed(evt);
            }
        });
        insertPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insertPinKeyPressed(evt);
            }
        });

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
    }// </editor-fold>//GEN-END:initComponents
// no action here
    private void insertIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertIDMouseClicked
        
    }//GEN-LAST:event_insertIDMouseClicked
// no action here
    private void logInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseClicked
        
    }//GEN-LAST:event_logInButtonMouseClicked
//do nothing here
    private void insertIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertIDActionPerformed

    }//GEN-LAST:event_insertIDActionPerformed

    private void insertPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertPinKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if(insertID.getText().equals("Please Insert Your ID")||insertID.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Please Insert Your ID");
            }
            else if(!(insertID.getText().equals("Please Insert Your ID")||insertID.getText().equals(""))) {
                if("Correct password".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
                   in.setVisible(true);
                   this.dispose();
                }
                else if("Wrong password".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
                    if(insertPin.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please insert PIN");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect PIN, Please try again");
                    }
                }
                else if("Wrong User".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
                    JOptionPane.showMessageDialog(null, "Don't have this Account, Should register");
                }
            }
        }
    }//GEN-LAST:event_insertPinKeyPressed
// no action here
    private void insertPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPinMouseClicked
      
    }//GEN-LAST:event_insertPinMouseClicked

    private void insertIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertIDKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if(insertID.getText().equals("Please Insert Your ID")||insertID.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Please Insert Your ID");
            }
            else if(!(insertID.getText().equals("Please Insert Your ID")||insertID.getText().equals(""))) {
                if("Correct password".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
                   in.setVisible(true);
                   this.dispose();
                }
                else if("Wrong password".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
                    if(insertPin.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please insert PIN");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect PIN, Please try again");
                    }
                }
                else if("Wrong User".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
                    JOptionPane.showMessageDialog(null, "Don't have this Account, Should register");
                }
            }
        }
    }//GEN-LAST:event_insertIDKeyPressed

    private void insertIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertIDMousePressed
         if(insertID.getText().equals("Please Insert Your ID")) {
            insertID.setText("");
            insertID.setForeground(new Color(0, 0, 0));
        }if(insertPin.getText().equals("")) {
            insertPin.setForeground(new Color(153, 153, 153));
            insertPin.setText("Ipin");
        }
    }//GEN-LAST:event_insertIDMousePressed

    private void insertPinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPinMousePressed
        if(insertPin.getText().equals("Ipin")) {
            insertPin.setText("");
            insertPin.setForeground(new Color(0, 0, 0));
        }if(insertID.getText().equals("")) {
            insertID.setForeground(new Color(153, 153, 153));
            insertID.setText("Please Insert Your ID");
        }
    }//GEN-LAST:event_insertPinMousePressed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        if(insertID.getText().equals("Please Insert Your ID")||insertID.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Please Insert Your ID");
        } 
        else if(!(insertID.getText().equals("Please Insert Your ID")||insertID.getText().equals(""))) {
            if("Correct password".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
               in.setVisible(true);
               this.dispose();
            }
            else if("Wrong password".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
                if(insertPin.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please insert PIN");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect PIN, Please try again");
                }
            }
            else if("Wrong User".equals(d1.checkPassword(insertID.getText(), insertPin.getText()))) {
               JOptionPane.showMessageDialog(null, "Don't have this Account, Should register");
            }
        }
        if (insertID.getText().length()>=0 && insertPin.getText().length()>=0) {
            if(insertID.getText().length()==0) {
                insertID.setForeground(new Color(153, 153, 153));
                insertID.setText("Please Insert Your ID");
            }
            if(insertPin.getText().length()==0){
                insertPin.setForeground(new Color(153, 153, 153));
                insertPin.setText("Ipin");
            }   
        } 
    }//GEN-LAST:event_logInButtonActionPerformed

    private void insertPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATM_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField insertID;
    private javax.swing.JPasswordField insertPin;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JLabel message3;
    // End of variables declaration//GEN-END:variables
}
