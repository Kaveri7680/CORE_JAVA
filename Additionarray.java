//Addtion of array element

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Additionarray{
    public static void main(String[] args){


        System.out.println("Enter array size");

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] arr=new int[size];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter array element:");
            int num=sc.nextInt();
            arr[i]=num;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of array element:"+sum);
    }
}