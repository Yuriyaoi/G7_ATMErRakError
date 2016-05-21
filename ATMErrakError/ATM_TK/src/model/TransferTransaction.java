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
public class TransferTransaction extends Transaction{
    private double balanceDes;
    
    public TransferTransaction(){
        
    }
    public boolean checkValidDestination(ArrayList<HashMap> list){
        return !list.isEmpty();
    }
    public boolean checkAmount(double input){
        return input <= 100000;
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
    }
    public void increaseBalance(double input){
        balanceDes = Double.parseDouble(dataStore.getDestinationBalance());
        double remain = balanceDes + input;
        dataStore.setDestinationBalance(remain+"");
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+dataStore.balanceDes+"'"
                + " WHERE Customer_ID = '"+dataStore.idDes+"'";
        db.update(sql_up);
    }
    public void insertDestination(){
        
    }
    public void updateDestinationStatement(int lastestStateNo, String mode, double input){
        int nextStateNo = ++lastestStateNo;
        String sql_insert = "INSERT INTO `ATM_Statement`"
                + " (`Statement_No`, `Customer_ID`, `Mode`, `Money`) "
                + "VALUES ('"+nextStateNo+"','"+dataStore.idDes+"','"+mode+"','"+input+"')";
        db.insert(sql_insert);
    }
    
}
