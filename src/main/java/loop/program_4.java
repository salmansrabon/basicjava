package loop;

//check if a number is prime or not
public class program_4 {
    public static void main(String[] args) {
        int number=17;
        boolean flag=true;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("This is prime");
        }
        else {
            System.out.println("This is not prime");
        }
    }
}
