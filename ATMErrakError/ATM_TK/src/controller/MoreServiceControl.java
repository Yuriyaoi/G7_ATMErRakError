package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MoreService;


public class MoreServiceControl {
    private MoreService moreService;
    private LoginControl loginControl;
    private BillPaymentControl billPaymentControl;
    private MenuControl menuControl;
    private TranferControl tranferControl;
    private StatementControl statementControl;
    
    public MoreServiceControl()
    {
        moreService = new MoreService();
        moreService.setActionBack(new backButtonAction());
        moreService.setActionLogout(new logoutButtonAction());
        moreService.setActionBillPayment(new billPaymentButtonAction());
        moreService.setActionTranfer(new tranferButtonAction());
        moreService.setActionStatement(new statementButtonAction());
        moreService.setVisible(true); moreService.setActionBillPayment(new billPaymentButtonAction());
    }    
    
    public static void main(String[] args) 
    {
            new MoreServiceControl();
    }
    private class tranferButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            tranferControl = new TranferControl();
            moreService.dispose();
        }
    }
    private class backButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            menuControl = new MenuControl();
            moreService.dispose();
        }
    }
    private class billPaymentButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            billPaymentControl = new BillPaymentControl();
            moreService.dispose();
        }
    }
    private class logoutButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            loginControl = new LoginControl();
            moreService.dispose();
        }
    }
    private class statementButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)              
        {
            statementControl = new StatementControl();
            moreService.dispose();
        }
    }
}
