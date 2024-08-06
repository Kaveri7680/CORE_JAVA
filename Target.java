// Give target as sum and print the index of array  element
import java.util.*;

public class Target {
    public static void main(String[] args){

//        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40};
         int target=40;
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]+arr[j]==target){
                     System.out.println("index of number is  "+ i +"  and  "+ j);
                 }
             }
         }


        }
}