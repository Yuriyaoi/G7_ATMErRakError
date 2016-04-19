package atm_tk;

// class เอามาเพื่อเก็บข้อมูล
public class storeData {
    static String user, password, name, balance;
    public static void info(String user, String password,String name, String balance){
        storeData.user = user;
        storeData.password = password;
        storeData.name = name;
        storeData.balance = balance;
    }
    static String no;
    public static void stateMe(String no) {
        storeData.no = no;   
    }
    static String no_each;
    public static void stateMe_Each(String no_each) {
        storeData.no_each = no_each;   
    }
    static int cnt = 1;
    static String mode, amount;
    public static void moAndMou(String mode, String amount) {
        storeData.mode = mode;
        storeData.amount = amount;   
    }
}
