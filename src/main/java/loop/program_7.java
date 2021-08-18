package loop;

import java.util.Scanner;

public class program_7 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Input a number: ");
        Scanner input=new Scanner(System.in);
        char ch;
        do{
            sum+=input.nextInt();
            System.out.println(sum);
            System.out.println("Do you want to continue?");
            ch=input.next().charAt(0);
            System.out.println("Input a number: ");
        }
        while (ch!='q');
    }
}
