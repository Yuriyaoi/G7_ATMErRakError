package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Menu;


public class MenuControl {
    private Menu menu;
    private WithdrawControl withdrawControl;
    private DepositControl depositControl;
    private BalanceControl balanceControl;
    //private DonateControl donateControl;
    private TranferControl tranferControl;
    private LoginControl loginControl;
    private BillPaymentControl billPaymentControl;
    private MoreServiceControl moreServiceControl;
    public MenuControl(){
        menu = new Menu();
        menu.setActionWithdraw(new withdrawButtonAction());
        menu.setActionDeposit(new depositButtonAction());
        menu.setActionBalance(new balanceButtonAction());
        menu.setActionLogout(new logoutButtonAction());
        menu.setActionMoreService(new moreServiceButtonAction());
        menu.setActionTranfer(new tranferButtonAction());
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
    private class moreServiceButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            moreServiceControl = new MoreServiceControl();
            menu.dispose();
        }
    }
    private class tranferButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            tranferControl = new TranferControl();
            menu.dispose();
        }
    }
}
