import java.util.Scanner;

public class admin {

    Scanner obj = new Scanner(System.in);

    String options, username, password;

    account_center accountInfo = new account_center();

    protected void adminOptions(){
        System.out.println("What would you like to do? \n 1) Create/Remove account \n 2) Add/Remove books \n 3) Check book information");

        options = obj.nextLine();

        switch (options.toLowerCase()){
            case "create account":
                System.out.println("Please enter account information");
                username = obj.next();
                password = obj.next();

                accountInfo.createAccount(username, password);

            break;
            case "remove account":
                System.out.println("Which account would you like to remove?");
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