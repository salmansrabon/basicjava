package basic;

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        int a=10;
        int b=3;
        int min=100;
        int max=500;
        System.out.println(Math.min(a,b));
        System.out.println((int) Math.pow(a,b));
        System.out.println((int) Math.abs(-50));

        System.out.println((int) Math.floor(Math.random()*100));
        System.out.println((int)(Math.random()*(max-min)+min));
        System.out.println(Math.round(50.2));
        System.out.println(Math.ceil(50.6));

        Scanner input=new Scanner(System.in);
        System.out.println("input an integer number: ");
        int num1=input.nextInt();
        System.out.println("input a double number: ");
        double num2=input.nextDouble();
        System.out.println("input a name: ");
        String name=input.next();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(name);
    }
}
