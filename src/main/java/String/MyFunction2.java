package String;

public class MyFunction2 {
    public static void main(String[] args) {
        String check= checkPositiveOrNegative(-1);
        System.out.println(check);
    }
    public static String checkPositiveOrNegative(int num){
        if(num>0){
            return "Positive";
        }
        return "Negative";
    }
}
