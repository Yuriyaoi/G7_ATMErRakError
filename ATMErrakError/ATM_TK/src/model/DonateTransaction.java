/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Yuri
 */
public class DonateTransaction extends Transaction{
    private double balanceDes;
    public DonateTransaction(){
        
    }
    public boolean checkAmount(double input){
        //no amount limit for donation
        return true;
    }
    public void doTransaction(double input){
        deductBalance(input);
        increaseBalance(input);
    }
    
    public void deductBalance(double input){
        double remain = balance - input;
        dataStore.setCurrentBalance(remain+"");
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+dataStore.balance+"'"
                + " WHERE Customer_ID = '"+dataStore.id+"'";
        db.update(sql_up);
        String sql_up2 = "UPDATE `Bank_Customer` "
                + "SET Customer_Balance= '"+dataStore.balance+"'"
                + " WHERE Customer_ID = '"+dataStore.id+"'";
        db.update(sql_up2);
    }
    public void increaseBalance(double input){
        balanceDes = Double.parseDouble(dataStore.getDestinationBalance());
        double remain = balanceDes + input;
        dataStore.setDestinationBalance(remain+"");
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+dataStore.balanceDes+"'"
                + " WHERE Customer_ID = '"+dataStore.idDes+"'";
        db.update(sql_up);
        String sql_up2 = "UPDATE `Bank_Customer` "
                + "SET Customer_Balance= '"+dataStore.balanceDes+"'"
                + " WHERE Customer_ID = '"+dataStore.idDes+"'";
        db.update(sql_up2);
    }
    
}
