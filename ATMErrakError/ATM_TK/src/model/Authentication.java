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
    
    public boolean loginSuccess(ArrayList<HashMap> list){
        return !list.isEmpty();
    }
    
    public boolean validUserID(ArrayList<HashMap> list){
        return !list.isEmpty();
    }
}
    
