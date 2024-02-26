import java.util.Scanner;

class library_home{
    public static void main(String[] args) {

        //imported classes objects
        Scanner obj = new Scanner(System.in);
        admin admins = new admin();
        visitor visit = new visitor();

        //Sign in pages
        System.out.println("Admin or Visitor? \n");
        String response = obj.next();
        if(response.toLowerCase().equals("admin")){
            admins.sign_in();
        }
        else{
        visit.options();
    }
    }
}