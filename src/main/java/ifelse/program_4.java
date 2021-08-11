package ifelse;

import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {
        System.out.println("Please input a character");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if((ch>='A') && (ch<='Z')){
            System.out.println("This is capital letter");
        }
        else if((ch>='a') && (ch<='z')){
            System.out.println("This is small letter");
        }
        else{
            System.out.println("This is number or special character");
        }
    }
}
