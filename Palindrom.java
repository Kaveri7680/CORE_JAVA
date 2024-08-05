//Take input from user;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Palindrom{
    public static void main(String[] args)throws IOException{

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);


        System.out.println("Enter a number");
        int number=Integer.parseInt(br.readLine());
        int temp=number;
        int revNum=0;


        for(number=temp;number!=0;number=number/10){
            int rem=number%10;
            revNum=revNum*10+rem;
        }System.out.println("Reverse number is :"+revNum);
        if(revNum==temp){
            System.out.println("The number is palindrom");
        }else{
            System.out.println("Not a palindrom number");
        }
    }
}