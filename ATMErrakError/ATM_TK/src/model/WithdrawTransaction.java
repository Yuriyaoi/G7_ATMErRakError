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
public class WithdrawTransaction extends Transaction{
    
    public WithdrawTransaction(){
        
    }
    public boolean checkAmount(double input){
        return input <= 20000;
    }

    public boolean checkLimit(double input){
        return input <= balance;
    }

    public void doTransaction(double input){
        double remain = balance - input;
        dataStore.setCurrentBalance(remain+"");
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+dataStore.balance+"'"
                + " WHERE Customer_ID = '"+dataStore.id+"'";
        db.update(sql_up);
    }
}
