/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import atm_tk.storeData;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Yuri
 */
public class Transaction {
    
    private DataStore dataStore;
    private SQL_Connection db;
    private int balance;
    public Transaction(){
        dataStore = new DataStore();
        db = new SQL_Connection();
        balance = Integer.parseInt(dataStore.getBalance());
    }
    public boolean checkAmount(int input){
        if(input > 100000){
            return false;
        } else{
            return true;
        }
    }
    public boolean checkLimit(int input){
        if(input > balance){
            return false;
        } else{
            return true;
        }
    }
    public boolean checkBankNote(int input){
        if(input % 100 == 0){
            return true; 
        } else{
            return false;
        }
    }
    
    public void withdraw(int input){
        int remain = balance - input;
        dataStore.setCurrentBalance(remain+"");
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+dataStore.balance+"'"
                + " WHERE Customer_ID = '"+dataStore.id+"'";
        db.update(sql_up);
    }
    public void updateStatement(int lastestStateNo, String mode, int input){
        int nextStateNo = ++lastestStateNo;
        String sql_insert = "INSERT INTO `ATM_Statement`"
                + " (`Statement_No`, `Customer_ID`, `Mode`, `Money`) "
                + "VALUES ('"+nextStateNo+"','"+dataStore.id+"','"+mode+"','"+input+"')";
        db.insert(sql_insert);
    }
}
