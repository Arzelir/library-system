import java.util.HashMap;

public class account_center {

    // declaring hashmap to store usernames and passwords
    HashMap<String, String> accountNames = new HashMap<String, String>();
    admin administrator = new admin();

    // creating username and password variables
    String username, password;

    public void addAccount(String username, String password){
        accountNames.put(username, password);
    }

    // creating setter method
    public void setAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // creating getter method
    public void getAccount() {
        System.out.println("This method works");
        System.out.println(accountNames.get("yaseen"));
    }
}
