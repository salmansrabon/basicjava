package ifelse;

import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {
        System.out.println("Please select 1, 2 or 3");
        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("You have selected option 1");
                break;
            case 2:
                System.out.println("You have selected option 2");
                break;
            case 3:
                System.out.println("You have selected option 3");
                break;
            default:
                System.out.println("Please select any of the given options");
                break;
        }

    }
}
