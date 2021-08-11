package ifelse;

import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int num1=scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int num2=scanner.nextInt();
        System.out.println("Input 3rd number: ");
        int num3=scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the max number");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2+" is the max number");
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3+" is the max number");
        }
        else{
            System.out.println("Please don't input the duplicate number");
        }

    }
}
