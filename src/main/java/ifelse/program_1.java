package ifelse;

import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        System.out.println("Please input a number to check if it is positive or negative:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number>=0){
            System.out.println("This is positive");
        }
        else if(number<0){
            System.out.println("This is negative");
        }

    }
}
