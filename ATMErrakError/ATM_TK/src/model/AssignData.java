/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import edu.sit.cs.db.CSDbDelegate;
/**
 *
 * @author Yuri
 */

public class AssignData {
    SQL_Connection db;
    //get an arraylist from selected statements then convert to String
    //assign String to dataStore class
    public ArrayList<HashMap> getUserPass(){
        String sql = "SELECT 'Customer_ID' FROM `ATM_Customer` WHERE ";
        ArrayList<HashMap> list = db.queryRows(sql);
        for(HashMap l : list){
            
        }
    }
}
