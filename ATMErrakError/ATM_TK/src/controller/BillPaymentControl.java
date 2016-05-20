package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Login;
import view.Withdraw;
import view.BillPayment;
public class BillPaymentControl 
{
        private BillPayment billPayment;
        private MenuControl menu;
        
        public BillPaymentControl(){
           billPayment = new BillPayment();
           billPayment.setActionBack(new backButtonAction());
           billPayment.setVisible(true);
        } 
        public static void main(String[] args) {
            new BillPaymentControl();
        }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menu = new MenuControl();
                billPayment.dispose();
            }
        }
}
