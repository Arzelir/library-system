import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;


class library_home{

    static boolean signInValue;
    void homePage(boolean signinCheck){
        signInValue = signinCheck;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton signinButton = new JButton();
        signinButton.setText("Enter");
        signinButton.setBounds(200, 80, 50, 20);
        JTextField signinField = new JTextField(20);
        signinField.setBounds(200, 50, 50, 20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("Home Page");
        frame.setVisible(true);
        frame.add(panel);
        panel.add(signinField);
        panel.add(signinButton);

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

    obj.close();
    }
}