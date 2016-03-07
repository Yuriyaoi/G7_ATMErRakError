
package atm_tk;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ATM_Login extends javax.swing.JFrame {
    getDB d1 = new getDB(); // call getDB
    ATM_Info in = new ATM_Info(); //call ATM info
    public ATM_Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InsertID = new javax.swing.JTextField();
        Log = new javax.swing.JButton();
        InsertPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TK-ATM ver.1.0.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("GG.png")));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("to");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TK-ATM");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));

        InsertID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InsertID.setForeground(new java.awt.Color(153, 153, 153));
        InsertID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InsertID.setText("Please Insert Your ID");
        InsertID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertIDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InsertIDMousePressed(evt);
            }
        });
        InsertID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertIDActionPerformed(evt);
            }
        });
        InsertID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InsertIDKeyPressed(evt);
            }
        });

        Log.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Log.setText("Login");
        Log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogMouseClicked(evt);
            }
        });
        Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogActionPerformed(evt);
            }
        });

        InsertPin.setForeground(new java.awt.Color(153, 153, 153));
        InsertPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InsertPin.setText("Ipin");
        InsertPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertPinMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InsertPinMousePressed(evt);
            }
        });
        InsertPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InsertPinKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(InsertID, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertPin, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(Log, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(InsertID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(InsertPin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Log, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// no action here
    private void InsertIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertIDMouseClicked
        
    }//GEN-LAST:event_InsertIDMouseClicked
// no action here
    private void LogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogMouseClicked
        
    }//GEN-LAST:event_LogMouseClicked
//do nothing here
    private void InsertIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertIDActionPerformed

    }//GEN-LAST:event_InsertIDActionPerformed

    private void InsertPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InsertPinKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if(InsertID.getText().equals("Please Insert Your ID")||InsertID.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Please Insert Your ID");
            }
            else if(!(InsertID.getText().equals("Please Insert Your ID")||InsertID.getText().equals(""))) {
                if("Correct password".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
                   in.setVisible(true);
                   this.dispose();
                }
                else if("Wrong password".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
                    if(InsertPin.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please insert PIN");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect PIN, Please try again");
                    }
                }
                else if("Wrong User".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
                    JOptionPane.showMessageDialog(null, "Don't have this Account, Should register");
                }
            }
        }
    }//GEN-LAST:event_InsertPinKeyPressed
// no action here
    private void InsertPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertPinMouseClicked
      
    }//GEN-LAST:event_InsertPinMouseClicked

    private void InsertIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InsertIDKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if(InsertID.getText().equals("Please Insert Your ID")||InsertID.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Please Insert Your ID");
            }
            else if(!(InsertID.getText().equals("Please Insert Your ID")||InsertID.getText().equals(""))) {
                if("Correct password".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
                   in.setVisible(true);
                   this.dispose();
                }
                else if("Wrong password".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
                    if(InsertPin.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please insert PIN");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect PIN, Please try again");
                    }
                }
                else if("Wrong User".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
                    JOptionPane.showMessageDialog(null, "Don't have this Account, Should register");
                }
            }
        }
    }//GEN-LAST:event_InsertIDKeyPressed

    private void InsertIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertIDMousePressed
         if(InsertID.getText().equals("Please Insert Your ID")) {
            InsertID.setText("");
            InsertID.setForeground(new java.awt.Color(0, 0, 0));
        }if(InsertPin.getText().equals("")) {
            InsertPin.setForeground(new java.awt.Color(153, 153, 153));
            InsertPin.setText("Ipin");
        }
    }//GEN-LAST:event_InsertIDMousePressed

    private void InsertPinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertPinMousePressed
        if(InsertPin.getText().equals("Ipin")) {
            InsertPin.setText("");
            InsertPin.setForeground(new java.awt.Color(0, 0, 0));
        }if(InsertID.getText().equals("")) {
            InsertID.setForeground(new java.awt.Color(153, 153, 153));
            InsertID.setText("Please Insert Your ID");
        }
    }//GEN-LAST:event_InsertPinMousePressed

    private void LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogActionPerformed
        if(InsertID.getText().equals("Please Insert Your ID")||InsertID.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Please Insert Your ID");
        } 
        else if(!(InsertID.getText().equals("Please Insert Your ID")||InsertID.getText().equals(""))) {
            if("Correct password".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
               in.setVisible(true);
               this.dispose();
            }
            else if("Wrong password".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
                if(InsertPin.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please insert PIN");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect PIN, Please try again");
                }
            }
            else if("Wrong User".equals(d1.checkPassword(InsertID.getText(), InsertPin.getText()))) {
               JOptionPane.showMessageDialog(null, "Don't have this Account, Should register");
            }
        }
        if (InsertID.getText().length()>=0 && InsertPin.getText().length()>=0) {
            if(InsertID.getText().length()==0) {
                InsertID.setForeground(new java.awt.Color(153, 153, 153));
                InsertID.setText("Please Insert Your ID");
            }
            if(InsertPin.getText().length()==0){
                InsertPin.setForeground(new java.awt.Color(153, 153, 153));
                InsertPin.setText("Ipin");
            }   
        } 
    }//GEN-LAST:event_LogActionPerformed

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
    private javax.swing.JTextField InsertID;
    private javax.swing.JPasswordField InsertPin;
    private javax.swing.JButton Log;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
