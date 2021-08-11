package ifelse;

import java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {
        String _username="salman";
        String _password="1234";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username= scanner.next();
        System.out.println("Please enter your password: ");
        String password= scanner.next();
        if((username.equals(_username)) &&(password.equals(_password))){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed");
        }
    }
}
