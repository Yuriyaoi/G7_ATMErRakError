package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Login;
import view.Deposit;
public class DepositControl 
{
    private Deposit deposit;
    private MenuControl menu;
    
    public DepositControl(){
        deposit = new Deposit();
        deposit.setActionbackButton(new backButtonAction());
        deposit.setActionNo1(new no1ButtonAction());
        deposit.setActionNo2(new no2ButtonAction());
        deposit.setActionNo3(new no3ButtonAction());
        deposit.setActionNo4(new no4ButtonAction());
        deposit.setActionNo5(new no5ButtonAction());
        deposit.setActionNo6(new no6ButtonAction());
        deposit.setActionNo7(new no7ButtonAction());
        deposit.setActionNo8(new no8ButtonAction());
        deposit.setActionNo9(new no9ButtonAction());
        deposit.setActionNo0(new no0ButtonAction());
        deposit.setActionReset(new resetButtonAction());
        deposit.setActionDelete(new deleteButtonAction());
        deposit.setActionEnter(new EnterButtonAction());
        
           deposit.setVisible(true);
    } 
    
    public static void main(String[] args) 
    {
        new DepositControl();
    }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menu = new MenuControl();
                //menu.setVisible(true);
                deposit.dispose();
            }
        }
        
        private class no1ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 1); 
            }
        }
        private class no2ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 2); 
            }
        }
        private class no3ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 3); 
            }
        }
        private class no4ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 4); 
            }
        }
        private class no5ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 5); 
            }
        }
        private class no6ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 6); 
            }
        }
        private class no7ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 7); 
            }
        }
        private class no8ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 8); 
            }
        }
        private class no9ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 9); 
            }
        }
        private class no0ButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                deposit.setAmount(amount + 0); 
            }
        }
        private class resetButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                //String amount = deposit.getAmount();
                deposit.setAmount(""); 
            }
        }
        private class deleteButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String amount = deposit.getAmount();
                if(amount.length() >= 1)
                {
                     deposit.setAmount(amount.substring(0,amount.length()-1));
                }
            }
        }
        private class EnterButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                //
            }
        }
}
