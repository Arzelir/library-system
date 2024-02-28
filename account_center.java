import java.util.HashMap;

public class account_center {

    static HashMap<String, String> accountNames = new HashMap<String, String>();

    library_home home = new library_home();

    void checkAccountNames(String username) {
        accountNames.put("yaseen", "qazi");
        accountNames.get(username);
        home.homePage(true);
    }

    void addAccounts(String username, String password) {
        accountNames.put(username, password);
        System.out.println("Account Successfully Added");
    }

    void removeAccounts(String username, String password) {
        if (accountNames.containsKey(username)) {
            accountNames.remove(username, password);
            System.out.println("Account successfully Removed");
        } else {
            System.out.println("Account does not exist");
        }
    }
}
