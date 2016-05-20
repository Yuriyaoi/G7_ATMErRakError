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
}
