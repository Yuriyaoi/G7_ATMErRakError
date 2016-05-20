package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LogIn_View;
import view.Login;
import view.Menu;
import view.Withdraw;
import view.Deposit;
import view.Balance;
import view.Login;
import view.Donate;
import view.BillPayment;

public class MenuControl {
    private Menu menu;
    private WithdrawControl withdrawControl;
    private DepositControl depositControl;
    private BalanceControl balanceControl;
//    private DonateControl donate;
    private LoginControl loginControl;
    private BillPaymentControl billPaymentControl;
    public MenuControl(){
        menu = new Menu();
        menu.setActionWithdraw(new withdrawButtonAction());
        menu.setActionDeposit(new depositButtonAction());
        menu.setActionBalance(new balanceButtonAction());
        menu.setActionLogout(new logoutButtonAction());
        menu.setActionBillPayment(new billPaymentButtonAction());
        //System.out.println("pp");
        menu.setVisible(true);
    }    
    public static void main(String[] args) {
            new MenuControl();
    }
    private class withdrawButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            withdrawControl = new WithdrawControl();
            menu.dispose();
        }
    }
    private class logoutButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            loginControl = new LoginControl();
            menu.dispose();
        }
    }
    private class depositButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            depositControl = new DepositControl();
            menu.dispose();
        }
    }
    private class balanceButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            balanceControl = new BalanceControl();
            menu.dispose();
        }
    }
    private class billPaymentButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            billPaymentControl = new BillPaymentControl();
            menu.dispose();
        }
    }
}
