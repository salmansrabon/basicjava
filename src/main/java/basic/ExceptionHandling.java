package basic;

import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Input a number:");
//            int num1 = input.nextInt();
//            System.out.println(num1);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        } finally {
//            System.out.println("Completed");
//        }

        try {
            String a = "10";
            int b = 10;
//            int sum = Integer.parseInt(a)+Integer.parseInt(b);
//            System.out.println(sum);

            if(Integer.parseInt(a)==b){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }

        } catch (Exception e) {

        }


    }

}
