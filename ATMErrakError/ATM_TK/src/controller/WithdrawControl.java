package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Login;
import view.Withdraw;
public class WithdrawControl 
{
    private Withdraw withdraw;
        private MenuControl menu;
        
        public WithdrawControl(){
           withdraw = new Withdraw();
           withdraw.setActionBack(new backButtonAction());
           withdraw.setVisible(true);
        } 
        public static void main(String[] args) {
            new WithdrawControl();
        }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menu = new MenuControl();
                //menu.setVisible(true);
                withdraw.dispose();
            }
        }
        private class numberButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
//                menu = new MenuControl();
//                //menu.setVisible(true);
//                withdraw.dispose();
                  withdraw.
            }
        }
