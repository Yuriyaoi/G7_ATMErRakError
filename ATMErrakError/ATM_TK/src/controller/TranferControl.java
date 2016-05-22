package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.AssignData;
import model.GetData;
import model.TransferTransaction;
import view.Tranfer;
public class TranferControl 
{
        private Tranfer tranfer;
        private MenuControl menu;
        private MoreServiceControl moreServiceControl;
        private TransferTransaction transferTransaction;
        private GetData getData;
        private AssignData assignData;
        public TranferControl(){
           tranfer = new Tranfer();
           transferTransaction = new TransferTransaction();
           getData = new GetData();
           assignData = new AssignData();
           tranfer.setActionBack(new backButtonAction());
           tranfer.setActionSubmit(new submitButtonAction());
           tranfer.setVisible(true);
        } 
        public static void main(String[] args) {
            new TranferControl();
        }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menuControl = new MenuControl();
                tranfer.dispose();
            }
        }
        
        private class submitButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destID;
                double amount;
                try{
                    destID = tranfer.getDestinationID();                    
                    amount = Double.parseDouble(tranfer.getAmount());
                    ArrayList<HashMap> list = getData.getUser(destID);
                    if(transferTransaction.checkValidDestination(list)){
                        assignData.assignDestinationInfo(list);
                        if(transferTransaction.checkAmount(amount)){
                            if(transferTransaction.checkLimit(amount)){
                                transferTransaction.doTransaction(amount);
                                transferTransaction.updateStatement(getData.getLastestStateNo(), "Transfer out", amount);
                                transferTransaction.updateDestinationStatement(getData.getLastestStateNo(), "Transfer in", amount);
                                tranfer.showPopUp("transfer out successfully");
                                tranfer.setAmount("");
                                if (tranfer.askConfirm("Do you want to transfer more?", "") == JOptionPane.NO_OPTION){
                                    menu = new MenuControl();
                                }
                            } else{
                                tranfer.showPopUp("More than your current balance");
                            }
                        } else{
                            tranfer.showPopUp("Sorry, we limit 100000 Baht per one transfer");
                            tranfer.setAmount("100000");
                        }
                    }else{
                        tranfer.showPopUp("Sorry, there is no this account in the system");
                    }
                    } catch(NumberFormatException num){
                            amount = 100000;
                            tranfer.showPopUp("Sorry, we limit 100000 Baht per one transfer");
                            tranfer.setAmount(amount+"");
                      }
            }
        }
}
