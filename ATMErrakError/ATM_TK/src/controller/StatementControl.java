package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.AssignData;
import model.DataStore;
import model.GetData;
import model.StatementShow;
import view.Statement;
public class StatementControl 
{
    private Statement statement;
    private MoreServiceControl moreService;
    private AssignData assignData;
    private GetData getData;
    private DataStore dataStore;
    private StatementShow statementShow;
        public StatementControl()
        {
           statement = new Statement();
           assignData = new AssignData();
           getData = new GetData();
           dataStore = new DataStore();
           statementShow = new StatementShow();
           showTable();
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
            JTable table;
            JScrollPane scroll;
            JPanel panel = new JPanel();
            String userID = dataStore.getCustomerID();
            ArrayList<HashMap> list = getData.getStatementList(userID);
            String[][] statementList;
            if(statementShow.isDataToShow(list)){
                statementList = new String[list.size()][4];

                for(int i = 0 ; i < statementList.length;i++){
                    int number = i + 1;
                    statementList[i][0] = "" + number;
                    statementList[i][1] = (String)list.get(i).get("Customer_ID");
                    statementList[i][2] = (String)list.get(i).get("Mode");
                    statementList[i][3] = (String)list.get(i).get("Money");
                }

                String[] name = {"Transaction NO", "Customer ID", "Mode", "Amount"};
                table = new JTable(statementList, name);
                table.setEnabled(false);
                table.setSize(550, 350);
                JScrollPane jScrollPane1 = new JScrollPane(table);
                panel.add(jScrollPane1);
                jScrollPane1.setSize(550,350);
                jScrollPane1.setLocation(0, 100);
                jScrollPane1.revalidate();
                panel.setVisible(true);
            } else{
                statement.showPopUp("Sorry, there is no any history transaction");
            }
        }
}

