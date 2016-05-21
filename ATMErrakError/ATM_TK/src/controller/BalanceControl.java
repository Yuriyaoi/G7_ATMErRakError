package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DataStore;
import view.Balance;
public class BalanceControl 
{
    private Balance balance;
    private MenuControl menuControl;
    private DataStore dataStore;
        
    public BalanceControl(){
        balance = new Balance();
        dataStore = new DataStore();
        balance.setActionBack(new backButtonAction());
        showAllInfo();
        balance.setVisible(true);
    } 
    public static void main(String[] args) {
        new BalanceControl();
    }

    private class backButtonAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            menuControl = new MenuControl();
            balance.dispose();
        }
    }
    
    private void showAllInfo(){
        balance.setIDLabel(dataStore.getCustomerID());
        balance.setNameLabel(dataStore.getName());
        balance.setBalanceLabel(dataStore.getCurrentBalance());
    }

}

