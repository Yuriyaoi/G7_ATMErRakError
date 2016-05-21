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

    private DataStore dataStore;
    
    public void assignInfo(ArrayList<HashMap> list){
        for(HashMap l : list){
            dataStore.setInfo((""+l.get("Customer_ID")), (""+l.get("Customer_Pass"))
                                  ,(""+l.get("Customer_Name")), (""+l.get("Customer_Balance")));
        }
    }
}
