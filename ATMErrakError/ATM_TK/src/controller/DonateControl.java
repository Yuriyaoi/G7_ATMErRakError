package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.AssignData;
import model.DonateTransaction;
import model.GetData;
import view.Donate;
public class DonateControl 
{
    private Donate donate;
    private DonateTransaction donateTransaction;
    private MoreServiceControl moreServiceControl;
    private GetData getData;
    private AssignData assignData;    
        public DonateControl(){
           donate = new Donate();
           getData = new GetData();
           assignData = new AssignData();
           donateTransaction = new DonateTransaction();
           donate.setActionBack(new backButtonAction());
           donate.setActionSubmit(new submitButtonAction());
           donate.setActionOrg1(new org1ButtonAction());
           donate.setActionOrg2(new org2ButtonAction());
           donate.setActionOrg3(new org3ButtonAction());
           donate.setActionOrg4(new org4ButtonAction());
           donate.setVisible(true);
        } 
        public static void main(String[] args) {
            new DonateControl();
        }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                moreServiceControl = new MoreServiceControl();
                donate.dispose();
            }
        }
        private class submitButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destID;
                double amount;
                try{
                    destID = donate.getDestinationID();                    
                    amount = Double.parseDouble(donate.getAmount());
                    ArrayList<HashMap> list = getData.getOrganization(destID);
                    if(donateTransaction.checkValidDestination(list)){
                        assignData.assignDestinationInfo(list);
                        if(donateTransaction.checkLimit(amount)){
                            donateTransaction.doTransaction(amount);
                            donateTransaction.updateStatement(getData.getLastestStateNo(), "Donate", amount);
                            donateTransaction.updateDestinationStatement(getData.getLastestStateNo(), "Receive Donation", amount);
                            donate.showPopUp("Donate successfully");
                            donate.setAmount("");
                            if (donate.askConfirm("Do you want to donate more?", "") == JOptionPane.NO_OPTION){
                                moreServiceControl = new MoreServiceControl();
                            }
                        } else{
                                donate.showPopUp("More than your current balance");
                            }
                    }else{
                        donate.showPopUp("Sorry, there is no this account in the system");
                    }
                    } catch(NumberFormatException num){
                            donate.showPopUp("Invalid Input");
                            donate.setAmount("");
                      }
            }
        }
        private class org1ButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destination = donate.getOrg1().getText();
                donate.setDestinationID(destination);
            }
        }
        
        private class org2ButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destination = donate.getOrg2().getText();
                donate.setDestinationID(destination);
            }
        }
        private class org3ButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destination = donate.getOrg3().getText();
                donate.setDestinationID(destination);
            }
        }
         private class org4ButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destination = donate.getOrg4().getText();
                donate.setDestinationID(destination);
            }
        }
}
