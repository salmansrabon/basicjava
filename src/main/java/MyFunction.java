import java.util.Scanner;

public class MyFunction {
    public static void main(String[] args) {
        System.out.println("Input your age:");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        boolean check= isVoter(age);
        System.out.println(check);
        if(check==true){
            System.out.println("Give NID");
        }
        else{
            System.out.println("Don't give NID");
        }

    }
    public static boolean isVoter(int age){
        if(age>=18){
            return true;
        }
        else{
        }
            return false;
    }

}
