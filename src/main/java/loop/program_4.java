package loop;

//check if a number is prime or not
public class program_4 {
    public static void main(String[] args) {
        int number=61;
        boolean flag=true;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                flag=false;
                System.out.println("This is not prime");
                break;
            }
        }

        if(flag==true){
            System.out.println("This is prime");
        }

    }
}
