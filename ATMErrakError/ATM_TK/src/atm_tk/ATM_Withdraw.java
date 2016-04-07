
package atm_tk;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class ATM_Withdraw extends javax.swing.JFrame {
    ATM_Info in = new ATM_Info();
    public ATM_Withdraw() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        message1 = new javax.swing.JLabel();
        ent = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Bath = new javax.swing.JLabel();
        wit2 = new javax.swing.JLabel();
        No9 = new javax.swing.JButton();
        reSet = new javax.swing.JButton();
        No0 = new javax.swing.JButton();
        No1 = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        No2 = new javax.swing.JButton();
        No3 = new javax.swing.JButton();
        No4 = new javax.swing.JButton();
        No5 = new javax.swing.JButton();
        No6 = new javax.swing.JButton();
        No7 = new javax.swing.JButton();
        No8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TK-ATM ver.1.0.0");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("GG.png")));
        setPreferredSize(null);
        setResizable(false);

        message1.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        message1.setHorizontalAlignment(SwingConstants.CENTER);
        message1.setText("Withdraw");
        message1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(204, 0, 51)));

        ent.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        ent.setText("Enter");
        ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entActionPerformed(evt);
            }
        });

        Back.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Bath.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        Bath.setHorizontalAlignment(SwingConstants.CENTER);
        Bath.setText("฿");
        Bath.setBorder(BorderFactory.createLineBorder(new Color(51, 51, 255), 2));

        wit2.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        wit2.setHorizontalAlignment(SwingConstants.CENTER);
        wit2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 204), 2));

        No9.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No9.setText("9");
        No9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No9ActionPerformed(evt);
            }
        });

        reSet.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        reSet.setText("reset");
        reSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reSetActionPerformed(evt);
            }
        });

        No0.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No0.setText("0");
        No0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No0ActionPerformed(evt);
            }
        });

        No1.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No1.setText("1");
        No1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No1ActionPerformed(evt);
            }
        });

        Del.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        Del.setText("Del");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        No2.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No2.setText("2");
        No2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No2ActionPerformed(evt);
            }
        });

        No3.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No3.setText("3");
        No3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No3ActionPerformed(evt);
            }
        });

        No4.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No4.setText("4");
        No4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No4ActionPerformed(evt);
            }
        });

        No5.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No5.setText("5");
        No5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No5ActionPerformed(evt);
            }
        });

        No6.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No6.setText("6");
        No6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No6ActionPerformed(evt);
            }
        });

        No7.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No7.setText("7");
        No7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No7ActionPerformed(evt);
            }
        });

        No8.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        No8.setText("8");
        No8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No8ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(message1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(No4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(No7, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(reSet, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(No1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(No5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(No2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(No8, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(No0, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(Del, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(No9, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(No6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(No3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(wit2, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bath, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(ent, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(message1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bath, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wit2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(No3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(No6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(No9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Del))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(No2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(No5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(No8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(No0))
                        .addComponent(No1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(No4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(No7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(reSet))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ent, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entActionPerformed
        int num1 = Integer.parseInt(storeData.balance); // set balance(String) of USER convert to num1(int) 
        int num2 = 0; // set num2(int) for getting wit2(text) which convert to int 
        int change; // change calculate num1 and num2
        if(wit2.getText().length()>=1 && wit2.getText().length()<=10) { // wit2 must have 1 to 10 length
           num2 = Integer.parseInt(wit2.getText());      // because int can get 10 digit of number (or) billion
          // get wit2(text) text to num2
        } else if(wit2.getText().length() > 10) { // wit2 length more than 10
           JOptionPane.showMessageDialogInButton(null, "It's too much AMOUNT!!"); 
           wit2.setText("");  
        }
        
        if(num2==0) { // num2 equal 0 (or) num2 isn't declared by wit2(text)
           JOptionPane.showMessageDialogInButton(null, "Please insert MONEY!!");
           wit2.setText("");
        } else if(num2 <= 100000) { // num2 must be lower equal 100,000
            if(num2>0 && (num2%20==0||num2%50==0||num2%70==0)) {  // num2 must inform of BANKNOTE
                if(num2<=num1) { // if MONEY insertion(num2) is less than balance(num1)
                   change = num1-num2;
                   storeData.balance = Integer.toString(change);
                   getDB.updateDB();
                   getDB.updateStatement_With(wit2.getText());
                   JOptionPane.showMessageDialogInButton(null, "\nID : "+storeData.user+"\n"
                        + "\nName : "+storeData.name+"\n"
                        + "\nMode : Withdraw\n"
                        + "\nAmount : " + num2 +"\n"
                        + "\nBalance : " + storeData.balance +"\n");
                   in.setVisible(true);
                   this.dispose();
                } else { // IF MONEY insertion > balance!!
                   JOptionPane.showMessageDialogInButton(null, "Don't have enough balance for Withdraw, Please try again!!");
                   wit2.setText("");
                }
            } else if(!(num2%20==0||num2%50==0||num2%70==0)) { // IF NOT BANKNOTE!!
                JOptionPane.showMessageDialogInButton(null, "Plese insert correct money in the form of BANKNOTE!!");
                wit2.setText("");
            }
        } else { // more than 100,000 about(100,001 to billion)
            JOptionPane.showMessageDialogInButton(null, "Cannot insert AMOUNT more than 100,000 Baht!!");
            wit2.setText("");
        }
    }//GEN-LAST:event_entActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void No1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No1ActionPerformed
        wit2.setText(wit2.getText()+1);
    }//GEN-LAST:event_No1ActionPerformed

    private void No2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No2ActionPerformed
        wit2.setText(wit2.getText()+2);
    }//GEN-LAST:event_No2ActionPerformed

    private void No3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No3ActionPerformed
        wit2.setText(wit2.getText()+3);
    }//GEN-LAST:event_No3ActionPerformed

    private void No4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No4ActionPerformed
        wit2.setText(wit2.getText()+4);
    }//GEN-LAST:event_No4ActionPerformed

    private void No5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No5ActionPerformed
        wit2.setText(wit2.getText()+5);
    }//GEN-LAST:event_No5ActionPerformed

    private void No6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No6ActionPerformed
        wit2.setText(wit2.getText()+6);
    }//GEN-LAST:event_No6ActionPerformed

    private void No7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No7ActionPerformed
        wit2.setText(wit2.getText()+7);
    }//GEN-LAST:event_No7ActionPerformed

    private void No8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No8ActionPerformed
        wit2.setText(wit2.getText()+8);
    }//GEN-LAST:event_No8ActionPerformed

    private void No9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No9ActionPerformed
        wit2.setText(wit2.getText()+9);
    }//GEN-LAST:event_No9ActionPerformed

    private void No0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No0ActionPerformed
        wit2.setText(wit2.getText()+0);
    }//GEN-LAST:event_No0ActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        String s = wit2.getText();
        if(s.length()>=1) {
          wit2.setText(s.substring(0,s.length()-1));
        }
    }//GEN-LAST:event_DelActionPerformed

    private void reSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reSetActionPerformed
        wit2.setText("");
    }//GEN-LAST:event_reSetActionPerformed

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
            java.util.logInButtonging.logInButtonger.getlogInButtonger(ATM_Withdraw.class.getName()).logInButton(java.util.logInButtonging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logInButtonging.logInButtonger.getlogInButtonger(ATM_Withdraw.class.getName()).logInButton(java.util.logInButtonging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logInButtonging.logInButtonger.getlogInButtonger(ATM_Withdraw.class.getName()).logInButton(java.util.logInButtonging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logInButtonging.logInButtonger.getlogInButtonger(ATM_Withdraw.class.getName()).logInButton(java.util.logInButtonging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM_Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Bath;
    private javax.swing.JButton Del;
    private javax.swing.JButton No0;
    private javax.swing.JButton No1;
    private javax.swing.JButton No2;
    private javax.swing.JButton No3;
    private javax.swing.JButton No4;
    private javax.swing.JButton No5;
    private javax.swing.JButton No6;
    private javax.swing.JButton No7;
    private javax.swing.JButton No8;
    private javax.swing.JButton No9;
    private javax.swing.JButton ent;
    private javax.swing.JLabel message1;
    private javax.swing.JButton reSet;
    private javax.swing.JLabel wit2;
    // End of variables declaration//GEN-END:variables
}
