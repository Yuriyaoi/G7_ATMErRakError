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
public class dataStore {
    static String user, password, name, balance;
    static String no;
    static String no_each;
    static int cnt = 1;
    static String mode, amount;
    
    //Collect Data for get and set

    public static void setInfo(String user, String password, String name, String balance){
        dataStore.user = user;
        dataStore.password = password;
        dataStore.name = name;
        dataStore.balance = balance;
    }
    
    public static void setStateMe(String no) {
        dataStore.no = no;   
    }

    public static void setStateMe_Each(String no_each) {
        dataStore.no_each = no_each;   
    }
    
    public static void setModeAmount(String mode, String amount) {
        dataStore.mode = mode;
        dataStore.amount = amount;   
    }
}
