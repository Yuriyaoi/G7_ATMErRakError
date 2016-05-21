/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Yuri
 */
public class SQL_Connection implements DB_Connection{
    static CSDbDelegate db;
    public SQL_Connection(){
        db = new CSDbDelegate
                    ("csprog-in.sit.kmutt.ac.th","3306","CSC105_G4","csc105_2014","csc105");
    }
    public void connection(){
        db.connect();
        System.out.println(db.connect());
    }
    public void disconnection(){
        db.disconnect();
        System.out.println(db.disconnect());
    }

    @Override
    public void insert(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    // pass String as a parameter and return as an arraylist to class AssignData
    public ArrayList<HashMap> select(String sql){
        connection();
        System.out.println(sql);
        ArrayList<HashMap> list = db.queryRows(sql);
        System.out.println(list.size());
        disconnection();
        return list;
    }
    
}
