import java.util.Scanner;

public class visitor {

    //Define Scanner Object
    Scanner obj = new Scanner(System.in);

    void options(){
        System.out.println("What would you like to do? \n a) Search \n b) Sign out a book \n c) Leave");
        String response = obj.nextLine();
        response = response.toLowerCase();
        switch (response) {
            case "search":
                System.out.println("Enter Search");
                String search = obj.next();
                break;
            case "sign out a book":
                System.out.println("Please enter barcode number");
                System.out.println("");
                break;
            case "leave":
                System.out.println("Thank you, have a nice day");
        }       
    }    
}