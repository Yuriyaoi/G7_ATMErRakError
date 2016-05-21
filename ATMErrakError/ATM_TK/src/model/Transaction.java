/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yuri
 */
public abstract class Transaction {
    public DataStore dataStore;
    public SQL_Connection db;
    public double balance;
    
    public Transaction(){
        dataStore = new DataStore();
        db = new SQL_Connection();
        balance = Double.parseDouble(dataStore.getBalance());
    }
    public abstract boolean checkAmount(double input);
    public abstract void doTransaction(double input);
    
    public boolean checkBankNote(double input){
        return input % 100 == 0;
    }
    
    public void updateStatement(int lastestStateNo, String mode, double input){
        int nextStateNo = ++lastestStateNo;
        String sql_insert = "INSERT INTO `ATM_Statement`"
                + " (`Statement_No`, `Customer_ID`, `Mode`, `Money`) "
                + "VALUES ('"+nextStateNo+"','"+dataStore.id+"','"+mode+"','"+input+"')";
        db.insert(sql_insert);
    }
}
