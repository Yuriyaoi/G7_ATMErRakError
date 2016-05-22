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
public class StatementShow {
    
    public StatementShow(){
        
    }
    
    public boolean isDataToShow(ArrayList<HashMap> list){
        return !list.isEmpty();
    }
}

