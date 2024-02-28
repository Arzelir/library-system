import java.util.HashMap;

public class account_center {

    HashMap<String, String> accountNames = new HashMap<String, String>();

    signin checkAccount = new signin();

    checkAccount.setAccountNames();
    
    void createAccount(String username, String password){
        accountNames.put("yaseen", "qazi");
        System.out.println(username + password);
    }

}
