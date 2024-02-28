import java.util.Scanner;

class library_home{

    static boolean signInValue;
    void homePage(boolean signinCheck){
        signInValue = signinCheck;
    }


    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void main(String[] args) {

        //imported classes objects
        Scanner obj = new Scanner(System.in);
        visitor visit = new visitor();
        signin sign = new signin();
        admin administrator = new admin();

        String username, password;

        //Sign in pages
        clearScreen();
        System.out.println("Welcome to the Public Library! \nAdmin or Visitor? \n");
        String response = obj.next();
        if(response.toLowerCase().equals("admin")){
            clearScreen();
            System.out.println("Please enter username and password");
            System.out.print("Username:  ");
            username = obj.next();
            System.out.print("\nPassword:  ");
            password = obj.next();
            sign.logIn(username, password);
            clearScreen();
        }

        //created options setting for administrators
        if(signInValue = true){
            administrator.adminOptions();
        }

        else{
        visit.options();
    }

    obj.close();
    }
}