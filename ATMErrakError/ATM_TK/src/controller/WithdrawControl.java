package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.GetData;
import model.Transaction;
import view.Login;
import view.Withdraw;
public class WithdrawControl 
{
    private Withdraw withdraw;
        private MenuControl menu;
        private Transaction transaction;
        private GetData getData;
        public WithdrawControl(){
           withdraw = new Withdraw();
           transaction = new Transaction();
           getData = new GetData();
           withdraw.setActionBack(new backButtonAction());
           withdraw.setActionNo1(new no1ButtonAction());
           withdraw.setActionNo2(new no2ButtonAction());
           withdraw.setActionNo3(new no3ButtonAction());
           withdraw.setActionNo4(new no4ButtonAction());
           withdraw.setActionNo5(new no5ButtonAction());
           withdraw.setActionNo6(new no6ButtonAction());
           withdraw.setActionNo7(new no7ButtonAction());
           withdraw.setActionNo8(new no8ButtonAction());
           withdraw.setActionNo9(new no9ButtonAction());
           withdraw.setActionNo0(new no0ButtonAction());
           withdraw.setActionReset(new resetButtonAction());
           withdraw.setActionDelete(new deleteButtonAction());
           withdraw.setActionEnter(new enterButtonAction());
           
           withdraw.setVisible(true);
        } 
        public static void main(String[] args) {
            new WithdrawControl();
        }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menu = new MenuControl();
                withdraw.dispose();
            }
        }
        private class no1ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 1); 
            }
        }
        private class no2ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 2); 
            }
        }
        private class no3ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 3); 
            }
        }
        private class no4ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 4); 
            }
        }
        private class no5ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 5); 
            }
        }
        private class no6ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 6); 
            }
        }
        private class no7ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 7); 
            }
        }
        private class no8ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 8); 
            }
        }
        private class no9ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 9); 
            }
        }
        private class no0ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                withdraw.setAmount(amount + 0); 
            }
        }
        private class resetButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                //String amount = withdraw.getAmount();
                withdraw.setAmount(""); 
            }
        }
        private class deleteButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = withdraw.getAmount();
                if(amount.length() >= 1)
                {
                     withdraw.setAmount(amount.substring(0,amount.length()-1));
                }
            }
        }
        
        private class enterButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                //withdraw money not more than 100,000 and your must be banknote
                int amount;
                try{
                    amount = Integer.parseInt(withdraw.getAmount());
                    if(transaction.checkAmount(amount)){
                        if(transaction.checkBankNote(amount)){
                            if(transaction.checkLimit(amount)){
                                transaction.withdraw(amount);
                                transaction.updateStatement(getData.getLastestStateNo(), "Withdraw", amount);
                                withdraw.showPopUp("Withdraw successfully");
                                withdraw.setAmount("");
                                if (withdraw.askConfirm("Do you want to withdraw more?", "") == JOptionPane.NO_OPTION){
                                    menu = new MenuControl();
                                }
                            } else{
                                withdraw.showPopUp("More than your current balance");
                            }
                        } else{
                            withdraw.showPopUp("Cannot be given as a banknote");
                        }
                    } else{
                        withdraw.showPopUp("Sorry, we limit 20000 Baht per one withdraw");
                        withdraw.setAmount("20000");
                    }
                } catch(NumberFormatException num){
                        amount = 20000;
                        withdraw.showPopUp("Sorry, we limit 20000 Baht per one withdraw");
                        withdraw.setAmount(amount+"");
                  }
            }
        }
}

