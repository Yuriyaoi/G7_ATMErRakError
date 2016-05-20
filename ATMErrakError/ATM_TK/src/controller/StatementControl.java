package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Login;
import view.Withdraw;
import view.Statement;
public class StatementControl 
{
    private Statement statement;
    private MenuControl menu;
        
        public StatementControl(){
           statement = new Statement();
           statement.setActionBack(new backButtonAction());
           statement.setVisible(true);
        } 
        public static void main(String[] args) {
            new StatementControl();
        }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menu = new MenuControl();
                //menu.setVisible(true);
                statement.dispose();
            }
        }
}
