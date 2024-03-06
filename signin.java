import java.util.Scanner;

class signin {

    // creating objects
    account_center accounts = new account_center();
    Scanner obj = new Scanner(System.in);

    private String username, password;

    // protected method to check if value entered by user is correct information
    public void logIn() {

        // retrieving username and password from user
        System.out.println("Please enter username and password\nUsername:  ");
        username = obj.next();
        System.out.print("\nPassword:  \n");
        password = obj.next();

        // checking if account username and password is accurate
        accounts.setAccount(username, password);
        accounts.getAccount();
    }
}