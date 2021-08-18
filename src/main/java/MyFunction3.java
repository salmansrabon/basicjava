public class MyFunction3 {
    public static void main(String[] args) {
        MyFunction3 obj=new MyFunction3();
        int sum=obj.doSum(10,20);
        double mul=obj.doMultiply(10.5,5);
        System.out.println(sum);
        System.out.println(mul);
    }
    public int doSum(int num1,int num2){
        return num1+num2;
    }
    public double doMultiply(double num1,int num2){
        return num1*num2;
    }
}
