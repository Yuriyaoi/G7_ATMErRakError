package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Balance;
public class BalanceControl 
{
    private Balance balance;
    private MenuControl menuControl;
    private WithdrawControl withdrawControl;
    private DepositControl depositControl;
    private StatementControl statementControl;
        
    public BalanceControl(){
        balance = new Balance();
        balance.setActionBack(new backButtonAction());
//        balance.setActionWithdraw(new withdrawButtonAction());
//        balance.setActionDeposit(new depositButtonAction());
//        balance.setActionStatement(new statementButtonAction());
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
//    private class withdrawButtonAction implements ActionListener{
//        public void actionPerformed(ActionEvent e) {
//            withdrawControl = new WithdrawControl();
//            balance.dispose();
//        }
//    }
//    private class depositButtonAction implements ActionListener{
//        public void actionPerformed(ActionEvent e) {
//            depositControl = new DepositControl();
//            balance.dispose();
//        }
//    }
//    private class statementButtonAction implements ActionListener{
//        public void actionPerformed(ActionEvent e) {
//            statementControl = new StatementControl();
//            balance.dispose();
//        }
//    }
}

