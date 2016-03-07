
package atm_tk;

import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class ATM_Deposit extends javax.swing.JFrame {
    ATM_Info in = new ATM_Info();
    public ATM_Deposit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Bath = new javax.swing.JLabel();
        des2 = new javax.swing.JLabel();
        No1 = new javax.swing.JButton();
        No2 = new javax.swing.JButton();
        No3 = new javax.swing.JButton();
        No4 = new javax.swing.JButton();
        No5 = new javax.swing.JButton();
        No6 = new javax.swing.JButton();
        No7 = new javax.swing.JButton();
        No8 = new javax.swing.JButton();
        No9 = new javax.swing.JButton();
        reSet = new javax.swing.JButton();
        No0 = new javax.swing.JButton();
        Del = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TK-ATM ver.1.0.0");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("GG.png")));
        setResizable(false);

        ent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ent.setText("Enter");
        ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deposit");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));

        Back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Bath.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Bath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bath.setText("฿");
        Bath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        des2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        des2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        des2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));

        No1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No1.setText("1");
        No1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No1ActionPerformed(evt);
            }
        });

        No2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No2.setText("2");
        No2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No2ActionPerformed(evt);
            }
        });

        No3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No3.setText("3");
        No3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No3ActionPerformed(evt);
            }
        });

        No4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No4.setText("4");
        No4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No4ActionPerformed(evt);
            }
        });

        No5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No5.setText("5");
        No5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No5ActionPerformed(evt);
            }
        });

        No6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No6.setText("6");
        No6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No6ActionPerformed(evt);
            }
        });

        No7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No7.setText("7");
        No7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No7ActionPerformed(evt);
            }
        });

        No8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No8.setText("8");
        No8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No8ActionPerformed(evt);
            }
        });

        No9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No9.setText("9");
        No9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No9ActionPerformed(evt);
            }
        });

        reSet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reSet.setText("reset");
        reSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reSetActionPerformed(evt);
            }
        });

        No0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No0.setText("0");
        No0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No0ActionPerformed(evt);
            }
        });

        Del.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Del.setText("Del");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(des2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(No1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reSet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(No5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Del, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ent, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bath, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(des2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No1)
                    .addComponent(No2)
                    .addComponent(No3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No4)
                    .addComponent(No5)
                    .addComponent(No6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No7)
                    .addComponent(No8)
                    .addComponent(No9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reSet)
                    .addComponent(No0)
                    .addComponent(Del))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entActionPerformed
        int num1 = Integer.parseInt(storeData.balance); // set balance(String) convert to nums(int) 
        int num2 = 0; // set num2 = 0
        int change;
        if(des2.getText().length()>=1 && des2.getText().length()<=10) { // des2 must have 1 to 10 length
           num2 = Integer.parseInt(des2.getText());      // because int can get 10 digit of number (or) billion
          // get des2(text) text to num2
        } else if(des2.getText().length() > 10) { // des2 length more than 10
           JOptionPane.showMessageDialog(null, "It's too much AMOUNT!!"); 
           des2.setText("");  
        }
        
        if(num2==0) { // num2 equal 0 (or) num2 isn't declared by des2(text)
           JOptionPane.showMessageDialog(null, "Please insert MONEY!!");
           des2.setText("");
        } else if(num2 <= 100000) { // num2 must lower equal 100,000
            if(num2>0 && (num2%20==0||num2%50==0||num2%70==0)) { // if num2 inform of BANKNOTE 70 = 50 + 20
                change = num2+ num1;
                storeData.balance = Integer.toString(change);
                getDB.updateDB();
                getDB.updateStatement_De(des2.getText());
                JOptionPane.showMessageDialog(null, "\nID : "+storeData.user+"\n"
                        + "\nName : "+storeData.name+"\n"
                        + "\nMode : Deposit\n"
                        + "\nAmount : " + num2 +"\n"
                        + "\nBalance : " + storeData.balance +"\n");
                in.setVisible(true);
                this.dispose();
            } else if(!(num2%20==0||num2%50==0||num2%70==0)){ // if NOT BANKNOTE!!
                JOptionPane.showMessageDialog(null, "Plese insert correct money in the form of BANKNOTE!!");
                des2.setText("");
            } 
        } else { // more than 100,000 about(100,001 to billion)
            JOptionPane.showMessageDialog(null, "Cannot insert AMOUNT more than 100,000 Baht!!");
            des2.setText("");
        }
    }//GEN-LAST:event_entActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void No1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No1ActionPerformed
        des2.setText(des2.getText()+1);
    }//GEN-LAST:event_No1ActionPerformed

    private void No2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No2ActionPerformed
        des2.setText(des2.getText()+2);
    }//GEN-LAST:event_No2ActionPerformed

    private void No3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No3ActionPerformed
        des2.setText(des2.getText()+3);
    }//GEN-LAST:event_No3ActionPerformed

    private void No4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No4ActionPerformed
        des2.setText(des2.getText()+4);
    }//GEN-LAST:event_No4ActionPerformed

    private void No5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No5ActionPerformed
        des2.setText(des2.getText()+5);
    }//GEN-LAST:event_No5ActionPerformed

    private void No6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No6ActionPerformed
        des2.setText(des2.getText()+6);
    }//GEN-LAST:event_No6ActionPerformed

    private void No7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No7ActionPerformed
        des2.setText(des2.getText()+7);
    }//GEN-LAST:event_No7ActionPerformed

    private void No8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No8ActionPerformed
        des2.setText(des2.getText()+8);
    }//GEN-LAST:event_No8ActionPerformed

    private void No9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No9ActionPerformed
        des2.setText(des2.getText()+9);
    }//GEN-LAST:event_No9ActionPerformed

    private void No0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No0ActionPerformed
        des2.setText(des2.getText()+0);
    }//GEN-LAST:event_No0ActionPerformed

    private void reSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reSetActionPerformed
        des2.setText("");
    }//GEN-LAST:event_reSetActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        String s = des2.getText();
        if(s.length()>=1) {
           des2.setText(s.substring(0,s.length()-1));
        }
    }//GEN-LAST:event_DelActionPerformed

    
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
            java.util.logging.Logger.getLogger(ATM_Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM_Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM_Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM_Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM_Deposit().setVisible(true);
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
    private javax.swing.JLabel des2;
    private javax.swing.JButton ent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reSet;
    // End of variables declaration//GEN-END:variables
}
