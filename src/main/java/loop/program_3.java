package loop;

import java.util.Scanner;

// find factorial of a number
public class program_3 {
    public static void main(String[] args) {
        System.out.println("Input a number to find factorial: ");
        Scanner scanner=new Scanner(System.in);
        double num=scanner.nextDouble();
        double fact=1;

        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
