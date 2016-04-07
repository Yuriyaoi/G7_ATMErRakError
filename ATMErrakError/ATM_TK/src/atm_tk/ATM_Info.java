package atm_tk;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;

public class ATM_Info extends javax.swing.JFrame {
    public ATM_Info() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Deposit = new javax.swing.JButton();
        Withdraw = new javax.swing.JButton();
        Statement = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Account = new javax.swing.JLabel();
        CustomerID = new javax.swing.JLabel();
        CustomerName = new javax.swing.JLabel();
        CustomerBalance = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Bath = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TK-ATM ver.1.0.0");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("GG.png")));
        setResizable(false);

        Deposit.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        Deposit.setForeground(new Color(51, 153, 0));
        Deposit.setText("Deposit");
        Deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositMouseClicked(evt);
            }
        });

        Withdraw.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        Withdraw.setForeground(new Color(255, 102, 102));
        Withdraw.setText("Withdraw");
        Withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithdrawMouseClicked(evt);
            }
        });
        Withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawActionPerformed(evt);
            }
        });

        Statement.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        Statement.setForeground(new Color(0, 0, 255));
        Statement.setText("Statement");
        Statement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatementMouseClicked(evt);
            }
        });

        Back.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        Back.setForeground(new Color(102, 0, 51));
        Back.setText("logInButtonOut");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Account.setBackground(new Color(255, 51, 51));
        Account.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        Account.setForeground(new Color(0, 153, 153));
        Account.setHorizontalAlignment(SwingConstants.CENTER);
        Account.setText("Account Status");
        Account.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51), 2));

        CustomerID.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        CustomerID.setForeground(new Color(0, 102, 102));
        CustomerID.setHorizontalAlignment(SwingConstants.CENTER);
        CustomerID.setBorder(BorderFactory.createLineBorder(new Color(51, 51, 255), 2));
        CustomerID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CustomerID.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CustomerIDAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        CustomerID.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                CustomerIDInputMethodTextChanged(evt);
            }
        });

        CustomerName.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        CustomerName.setForeground(new Color(153, 0, 153));
        CustomerName.setHorizontalAlignment(SwingConstants.CENTER);
        CustomerName.setBorder(BorderFactory.createLineBorder(new Color(51, 51, 255), 2));
        CustomerName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CustomerBalance.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        CustomerBalance.setForeground(new Color(102, 102, 0));
        CustomerBalance.setHorizontalAlignment(SwingConstants.CENTER);
        CustomerBalance.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 51), 2));
        CustomerBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new Color(0, 153, 255));
        jLabel7.setText("ID:");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new Color(0, 153, 255));
        jLabel8.setText("Name:");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new Color(0, 102, 0));
        jLabel9.setText("Balance");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Bath.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        Bath.setHorizontalAlignment(SwingConstants.CENTER);
        Bath.setText("฿");
        Bath.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 51), 2));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CustomerBalance, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bath, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                            .addComponent(Back, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(Statement, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Deposit, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Withdraw, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(CustomerID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustomerName, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel9)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Account, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Account, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerID, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Deposit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(Withdraw, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bath, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CustomerBalance, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(Statement, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //no action here
    private void WithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawActionPerformed
        
    }//GEN-LAST:event_WithdrawActionPerformed
    
    private void DepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositMouseClicked
        ATM_Deposit in = new ATM_Deposit();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DepositMouseClicked

    private void WithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithdrawMouseClicked
        ATM_Withdraw in = new ATM_Withdraw();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_WithdrawMouseClicked

    private void StatementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatementMouseClicked
        ATM_Statement in = new ATM_Statement();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StatementMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        ATM_logInButtonin in = new ATM_logInButtonin();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed
    //no action here
    private void CustomerIDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CustomerIDInputMethodTextChanged

    }//GEN-LAST:event_CustomerIDInputMethodTextChanged

    private void CustomerIDAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CustomerIDAncestorAdded
        CustomerID.setText(storeData.user);
        CustomerName.setText(storeData.name);
        String s = ""; 
        String s1 = storeData.balance;
        int cnt = 0;
        for(int i = s1.length()-1;i>=0;i--,cnt++) {
            if(cnt==3) {
               s = "," + s;
               cnt=0;
            }
            s = s1.charAt(i)+s;
        }
        CustomerBalance.setText(s);
    }//GEN-LAST:event_CustomerIDAncestorAdded

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
            java.util.logInButtonging.logInButtonger.getlogInButtonger(ATM_Info.class.getName()).logInButton(java.util.logInButtonging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logInButtonging.logInButtonger.getlogInButtonger(ATM_Info.class.getName()).logInButton(java.util.logInButtonging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logInButtonging.logInButtonger.getlogInButtonger(ATM_Info.class.getName()).logInButton(java.util.logInButtonging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logInButtonging.logInButtonger.getlogInButtonger(ATM_Info.class.getName()).logInButton(java.util.logInButtonging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Bath;
    private javax.swing.JLabel CustomerBalance;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel CustomerName;
    private javax.swing.JButton Deposit;
    private javax.swing.JButton Statement;
    private javax.swing.JButton Withdraw;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
