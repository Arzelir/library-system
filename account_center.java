import java.util.HashMap;

public class account_center {

    // declaring hashmap to store usernames and passwords
    HashMap<String, String> accountNames = new HashMap<String, String>();
    admin administrator = new admin();

    // creating username and password variables
    String username, password;

    // creating setter method
    public void setAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // creating getter method
    public void getAccount() {
        if(this.accountNames.containsKey(this.username)){
            if (this.accountNames.get(this.username) == this.password) {
                administrator.adminOptions();
            }
            }
    }

    public void addAccounts(){
        System.out.println(this.username + " " + this.password);
    }

}
