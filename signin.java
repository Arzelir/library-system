import java.util.Scanner;

class signin {
    
//creating objects
Scanner obj = new Scanner(System.in);
library_home home = new library_home();

//created private variables
private String usernameCheck = "yaseen", passwordCheck = "qazi";

//protected method to check if value entered by user is correct information
protected void logIn(String username, String password){
    if(username.equals(usernameCheck) && password.equals(passwordCheck)){
        System.out.println("Sign in was successful.");
        home.homePage(true);
    }
}

}
