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
public class Authentication {
    public Authentication(){
        
    }
    private boolean logInSuccess(String user , String password){
        String output = "";
        String sql = "SELECT * FROM `ATM_Customer` ";
        ArrayList<HashMap> list = db.queryRows(sql);
        for(HashMap l : list){
            if(l.get("Customer_ID").equals(user)){
                if(l.get("Customer_Pass").equals(password)){
                    output = "Correct password";
                    storeData.info((""+l.get("Customer_ID")) , (""+l.get("Customer_Pass"))
                                  ,(""+l.get("Customer_Name")), (""+l.get("Customer_Balance")));
                    break;
                }
                else{
                    output = "Wrong password";
                    break;
                }
            }
            else{
                output = "Wrong User";
            }
        }
        return output;
    }
    
    public void checkUsername(String user){
        
    }
    
    public void checkPassword(String pass){
        
    }
}
