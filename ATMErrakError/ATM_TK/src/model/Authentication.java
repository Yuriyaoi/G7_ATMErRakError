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
    private SQL_Connection db;
    public Authentication(){
        db = new SQL_Connection();
    }
    public boolean loginSuccess(String username , String password){
        boolean success;
        String sql = "SELECT * FROM `ATM_Customer` WHERE Customer_ID LIKE '"+username+"' AND Customer_Pass LIKE '"+password+"'";
        //String sql = "SELECT * FROM `ATM_Customer` WHERE Customer_ID LIKE '57130500218' AND Customer_Pass LIKE '2244'";
        ArrayList<HashMap> list = db.select(sql);

        if(!list.isEmpty()){
            success = true;
            //System.out.println("hhhh");
        } else{
            success = false;
        }

        return success;
    }
}
    
