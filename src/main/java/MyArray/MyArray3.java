package MyArray;

import java.util.Arrays;

public class MyArray3 {
    public static void main(String[] args) {
        int[] num={21,20,10,41,50};
//        int sum=0;
//        for(int i=0;i<num.length;i++){
//            if(num[i]%2==0){
//                sum+=num[i];
//            }
//        }
//        System.out.println(sum);
         doSort(num);
    }
    public static void doSort(int[] num){
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
