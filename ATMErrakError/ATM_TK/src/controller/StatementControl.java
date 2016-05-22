package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import view.Statement;
public class StatementControl 
{
    private Statement statement;
    private MoreServiceControl moreService;
        
        public StatementControl()
        {
           statement = new Statement();
           statement.setActionBack(new backButtonAction());
           statement.setVisible(true);
        } 
        
        public static void main(String[] args) 
        {
            new StatementControl();
        }

        private class backButtonAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e) {
                moreService = new MoreServiceControl();
                statement.dispose();
            }
        }
        
        private void showTable(){

        }
}
