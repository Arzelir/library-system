import java.util.Scanner;

public class admin {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // creating necessary objects
    Scanner obj = new Scanner(System.in);
    account_center accountInfo = new account_center();

    // creating necessary variables
    String options, username, password;

    protected void adminOptions() {

        // printing out options list
        System.out.println("What would you like to do? \n 1) Create/Remove account \n 2) Add/Remove books \n 3) Check book information");
        // getting user input
        options = obj.nextLine();

        // changing output based on user input
        switch (options.toLowerCase()) {

            // creating new admin account based on user input
            case "create account":
                clearScreen();

                // getting user input for new account
                System.out.println("Please enter account information");
                System.out.print("Username:  ");
                username = obj.next();
                System.out.print("\nPassword:  ");
                password = obj.next();

                // sending information to setter method
                accountInfo.setAccount(username, password);

                // adding accounts
                accountInfo.addAccounts();
                break;

            // case "remove account":
            //     clearScreen();
            //     System.out.println("Please enter account information");
            //     System.out.print("Username:  ");
            //     username = obj.next();
            //     System.out.print("\nPassword:  ");
            //     password = obj.next();
            //     // accountInfo.removeAccounts(username, password);
            //     break;

            // case "add books":
            //     System.out.println("Please enter book title");
            //     break;
            // case "remove books":
            //     System.out.println("Please enter book title");
            //     break;
            // case "check book information":
            //     System.out.println("Please enter book title");
            //     break;
            default:
                System.out.println("Please Choose Valid Option");
                break;
        }
    }

}