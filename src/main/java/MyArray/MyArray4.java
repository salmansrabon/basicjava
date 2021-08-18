package MyArray;

public class MyArray4 {
    public static void main(String[] args) {
        int size=5;
        int[] num=new int[size];
        num[0]=10;
        num[1]=30;
        num[2]=20;
        num[3]=50;
        num[4]=40;
        int max= findMax(num);
        int min= findMin(num);
        System.out.println(max);
        System.out.println(min);
    }
    public static int findMax(int[] num){
        int max=num[0]; //10
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static int findMin(int[] num){
        int min=num[0]; //10
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;
    }
}
