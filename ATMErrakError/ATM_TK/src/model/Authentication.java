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
    private AssignData data;
    public Authentication(){
        db = new SQL_Connection();
        data = new AssignData();
    }
    public boolean loginSuccess(ArrayList<HashMap> list){
        boolean success;
        if(!list.isEmpty()){
            success = true;
        } else{
            success = false;
        }
        return success;
    }
}
    
