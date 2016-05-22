package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.AssignData;
import model.BillPaymentTransaction;
import model.GetData;
import view.BillPayment;
public class BillPaymentControl 
{
        private BillPayment billPayment;
        private BillPaymentTransaction billPaymentTransaction;
        private MoreServiceControl moreServiceControl;
        private GetData getData;
        private AssignData assignData;
        
        public BillPaymentControl(){
           billPayment = new BillPayment();
           billPaymentTransaction = new BillPaymentTransaction();
           getData = new GetData();
           assignData = new AssignData();
           billPayment.setActionBack(new backButtonAction());
           billPayment.setActionSubmit(new submitButtonAction());
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
        
        private class submitButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String billID;
                double amount;
                try{
                    billID = billPayment.getBillID();                    
                    amount = Double.parseDouble(billPayment.getAmount());
                    ArrayList<HashMap> list = getData.getUser(billID);
                    if(billPaymentTransaction.checkValidDestination(list)){
                        assignData.assignDestinationInfo(list);
                        if(billPaymentTransaction.checkAmount(amount)){
                            if(billPaymentTransaction.checkLimit(amount)){
                                billPaymentTransaction.doTransaction(amount);
                                billPaymentTransaction.updateStatement(getData.getLastestStateNo(), "Pay Bill", amount);
                                billPaymentTransaction.updateDestinationStatement(getData.getLastestStateNo(), "Receive Payment", amount);
                                billPayment.showPopUp("Pay bill successfully");
                                billPayment.setAmount("");
                                if (billPayment.askConfirm("Do you want to pay bill more?", "") == JOptionPane.NO_OPTION){
                                    moreServiceControl = new MoreServiceControl();
                                }
                            } else{
                                billPayment.showPopUp("More than your current balance");
                            }
                        } else{
                            billPayment.showPopUp("Sorry, we limit 100000 Baht per one bill payment");
                            billPayment.setAmount("100000");
                        }
                    }else{
                        billPayment.showPopUp("Sorry, there is no this account in the system");
                    }
                    } catch(NumberFormatException num){
                            amount = 100000;
                            billPayment.showPopUp("Sorry, we limit 100000 Baht per one bill payment");
                            billPayment.setAmount(amount+"");
                      }
            }
        }
}
