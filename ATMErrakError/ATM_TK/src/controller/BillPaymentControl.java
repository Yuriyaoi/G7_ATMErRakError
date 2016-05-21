package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BillPayment;
public class BillPaymentControl 
{
        private BillPayment billPayment;
        private MoreServiceControl moreServiceControl;
        
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
                moreServiceControl = new MoreServiceControl();
                billPayment.dispose();
            }
        }
}
