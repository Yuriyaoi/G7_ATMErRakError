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
public interface DB_Connection{
    public void connection();
    public void disconnection();
    public void insert(String sql);
    public void update(String sql);
    public void delete(String sql);
    public ArrayList<HashMap> select(String sql);
}
