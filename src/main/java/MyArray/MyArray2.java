package MyArray;

public class MyArray2 {
    public static void main(String[] args) {
//        String[] fruits={"Mango","Litchi","Apple","Jackfruit","Banana"};
//        for (String c:fruits) {
//            System.out.println("I like "+c);
//        }
        int[] num={10,5,2,3,2,7,7,15,10};
        //checkDuplicate(num);
        int pos= checkPosition(7,num);
        System.out.println(pos);
    }
    public static void checkDuplicate(int[] num)
    {
        for(int i=0;i<num.length;i++){
            for(int j=0;j<i;j++){
                if(num[i]==num[j]){
                    System.out.println(num[j]);
                }
            }
        }
    }
    public static int checkPosition(int num, int[] list){
        for(int i=0;i<list.length;i++){
            if(num==list[i]){
                return i;
            }
        }
        return -1;
    }
}
