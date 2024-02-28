import java.util.Scanner;

public class admin {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    Scanner obj = new Scanner(System.in);
    account_center accountInfo = new account_center();

    String options, username, password;

    protected void adminOptions() {

        System.out.println(
                "What would you like to do? \n 1) Create/Remove account \n 2) Add/Remove books \n 3) Check book information");

        options = obj.nextLine();

        switch (options.toLowerCase()) {
            case "create account":
                clearScreen();
                System.out.println("Please enter account information");
                System.out.print("Username:  ");
                username = obj.next();
                System.out.print("\nPassword:  ");
                password = obj.next();
                accountInfo.addAccounts(username, password);
                break;

            case "remove account":
                clearScreen();
                System.out.println("Please enter account information");
                System.out.print("Username:  ");
                username = obj.next();
                System.out.print("\nPassword:  ");
                password = obj.next();
                accountInfo.removeAccounts(username, password);
                break;

            case "add books":
                System.out.println("Please enter book title");
                break;
            case "remove books":
                System.out.println("Please enter book title");
                break;
            case "check book information":
                System.out.println("Please enter book title");
        }
    }

}