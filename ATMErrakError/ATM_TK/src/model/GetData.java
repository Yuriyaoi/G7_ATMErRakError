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
public class GetData {
    private SQL_Connection db;
    
    //get an arraylist or valuse by selected statements from database using access of SQL_Connection class
    public GetData(){
        db = new SQL_Connection();
    }
    
    public ArrayList<HashMap> getUserInfo(String username , String password){
        String sql = "SELECT * FROM `ATM_Customer` WHERE Customer_ID LIKE '"+username+"' AND Customer_Pass LIKE '"+password+"'";
        ArrayList<HashMap> list = db.select(sql);
        return list;
    }
    public int getLastestStateNo(){
        int lastestStateNo = 0;
        String sql = "SELECT * FROM `ATM_Statement`";
        ArrayList<HashMap> list = db.select(sql);
        for(HashMap l : list){
            lastestStateNo = Integer.parseInt("" + l.get("Statement_No"));
        }
        System.out.println(lastestStateNo);
        return lastestStateNo;
    }
    public ArrayList<HashMap> getUser(String username){
        String sql = "SELECT * FROM `ATM_Customer` WHERE Customer_ID LIKE '"+username+"'";
        ArrayList<HashMap> list = db.select(sql);
        return list;
    }
}
