//frequency of digits in given number
import java.util.*;


public class Frequency {
    public static void main(String[] args){

        Scanner Sc=new Scanner(System.in);

        System.out.println(" Enter a number :");
        long number=Sc.nextLong();

        long[] arr={0,0,0,0,0,0,0,0,0,0};

        for(long l=number;l!=0;l=l/10){
            long rem=l%10;
            arr[(int)rem]++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println("Frequency of "+i+"="+arr[i]);
            }
        }




    }
}