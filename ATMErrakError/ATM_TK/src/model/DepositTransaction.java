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
public class DepositTransaction extends Transaction{
    
    public DepositTransaction(){
       
    }
    
    public boolean checkAmount(double input){
        //no more than 100000 baht
        return input <= 100000.00;
    }
    
    public void doTransaction(double input){
        double remain = balance + input;
        dataStore.setCurrentBalance(remain+"");
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+dataStore.balance+"'"
                + " WHERE Customer_ID = '"+dataStore.id+"'";
        db.update(sql_up);
    }
}
