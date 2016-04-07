package atm_tk;

import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;

public class getDB {
    static CSDbDelegate db;
    static storeData storedata;
    public getDB() {
        db = new CSDbDelegate
                    ("csprog-in.sit.kmutt.ac.th","3306","CSC105_G4","csc105_2014","csc105");
        db.connect();
        System.out.println(db.connect());
    }
    public String checkPassword(String user , String password){
        String output = "";
        String sql = "SELECT * FROM `ATM_Customer` ";
        ArrayList<HashMap> list = db.queryRows(sql);
        for(HashMap l : list){
            if(l.get("Customer_ID").equals(user)){
                if(l.get("Customer_Pass").equals(password)){
                    output = "Correct password";
                    storeData.info((""+l.get("Customer_ID")) , (""+l.get("Customer_Pass"))
                                  ,(""+l.get("Customer_Name")), (""+l.get("Customer_Balance")));
                    break;
                }
                else{
                    output = "Wrong password";
                    break;
                }
            }
            else{
                output = "Wrong User";
            }
        }
        return output;
    }
    public static void statementStoreNo() {
        String sql_stat = "SELECT * FROM `ATM_Statement` ";
        ArrayList<HashMap> list = db.queryRows(sql_stat);
        for(HashMap l : list) {
            storeData.stateMe(""+l.get("Statement_No")); 
        }
    }
    // ยังค้างส่วนนี้
    public static void statementStoreNo_Each() {
        String sql_stat = "SELECT * FROM `ATM_Statement` ";
        ArrayList<HashMap> list = db.queryRows(sql_stat);
        if(storeData.no_each == "0") {
          storeData.no_each = "0";
        }   
        int tmp = Integer.parseInt(storeData.no_each);
        for(HashMap l : list) {
            if(l.get("Customer_ID").equals(storeData.user)) {
               if( tmp < Integer.parseInt((String) l.get("Statement_No"))) {
                  storeData.stateMe_Each(""+l.get("Statement_No"));
                  storeData.moAndMou(""+l.get("Mode"),""+l.get("Money"));
                  storeData.cnt++;
                  break;
               } else if (tmp == Integer.parseInt((String) l.get("Statement_No"))) {
                  continue;
               }
            }
        }
    }
    public static void updateDB() {
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+storeData.balance+"'"
                + "WHERE Customer_ID = '"+storeData.user+"'";
        db.executeQuery(sql_up);
    }
    public static void updateStatement_De(String de) {
        statementStoreNo();
        String sql_De = null;
        int cnt = 0;
        if(storeData.no==null) {
           cnt = 0;
        } else if(storeData.no.length()>=1) {
           cnt = Integer.parseInt(storeData.no);
        }
        if(cnt>=0){
            cnt++;
            sql_De = "INSERT INTO `ATM_Statement`"
                + " (`Statement_No`, `Customer_ID`, `Mode`, `Money`) "
                + " VALUES ('"+cnt+"','"+storeData.user+"','Deposit','"+de+"')";
        }
        db.executeQuery(sql_De);
    }
    public static void updateStatement_With(String wi) {
        statementStoreNo();
        String sql_Wi = null;
        int cnt = 0;
        if(storeData.no==null) {
           cnt = 0;
        } else if(storeData.no.length()>=1) {
           cnt = Integer.parseInt(storeData.no);
        }
        if(cnt>=0){
            cnt++;
            sql_Wi = "INSERT INTO `ATM_Statement`"
                + " (`Statement_No`, `Customer_ID`, `Mode`, `Money`) "
                + " VALUES ('"+cnt+"','"+storeData.user+"','Withdraw','"+wi+"')";
        }
        db.executeQuery(sql_Wi);
    }
}
