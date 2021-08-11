package ifelse;

import java.util.Scanner;

public class program_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input an amount that is divisible by 500: ");
        int amount= scanner.nextInt();
        if(amount%500==0){
            System.out.println("Amount is valid");
        }
        else{
            System.out.println("Amount is invalid");
        }
    }
}
