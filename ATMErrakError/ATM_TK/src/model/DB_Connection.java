/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yuri
 */
public interface DB_Connection{
    public void connection();
    public void disconnection();
    public void insert();
    public void update();
    public void delete();
    public void select();
}
