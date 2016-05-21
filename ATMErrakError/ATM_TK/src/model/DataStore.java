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
public class DataStore {
    static String id, password, name, balance;
    static String no;
    static String no_each;
    static int cnt = 1;
    static String mode, amount;
    
    //Collect Data for get and set

    public static void setInfo(String id, String password, String name, String balance){
        DataStore.id = id;
        DataStore.password = password;
        DataStore.name = name;
        DataStore.balance = balance;
    }
    public static void setCurrentBalance(String balance){
        DataStore.balance = balance;
    }
    
    public static void setStateMe(String no) {
        DataStore.no = no;   
    }

    public static void setStateMe_Each(String no_each) {
        DataStore.no_each = no_each;   
    }
    
    public static void setModeAmount(String mode, String amount) {
        DataStore.mode = mode;
        DataStore.amount = amount;   
    }
    public static String getCustomerID(){
        return id;   
    }
    public static String getBalance(){
        return balance;   
    }
    public static String getName(){
        return name;   
    }

}
