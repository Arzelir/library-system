import java.util.Scanner;

class library_home {

    static boolean signInValue = false;

    // clear screen method
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        // imported classes objects
        Scanner obj = new Scanner(System.in);
        visitor visit = new visitor();
        account_center accounts = new account_center();
        signin sign = new signin();

        // make this private somehow
        accounts.addAccount("yaseen", "qazi");

        // Sign in pages
        System.out.println("Welcome to the Public Library! \nAdmin or Visitor? \n");
        String response = obj.next();

        switch (response.toLowerCase()) {
            case "admin":
                sign.logIn();
                break;
            case "visitor":
                visit.options();
                break;
            default:
                System.out.println("Please Enter Valid Response");
                break;
        }
        obj.close();
    }
}