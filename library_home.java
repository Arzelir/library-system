import java.util.Scanner;

class library_home{

    static boolean signInValue;
    void homePage(boolean signinCheck){
        signInValue = signinCheck;
    }
    public static void main(String[] args) {

        //imported classes objects
        Scanner obj = new Scanner(System.in);
        visitor visit = new visitor();
        signin sign = new signin();
        admin administrator = new admin();

        String username, password;

        //Sign in pages
        System.out.println("Admin or Visitor? \n");
        String response = obj.next();
        if(response.toLowerCase().equals("admin")){
            System.out.println("Please enter username and password");
            username = obj.next();
            password = obj.next();
            sign.logIn(username, password);
        }

        //created options setting for administrators
        if(signInValue = true){
            administrator.adminOptions();
        }

        else{
        visit.options();
    }
    }
}