package problems;//Take 2 number from user and do Addition,Subtraction,Division,Multiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Mdsa{
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter 2 number");
        int num1=Integer.parseInt(br.readLine());
        int num2=Integer.parseInt(br.readLine());

        System.out.println("Addtion of "+num1+ " and " +num2+ ": "+(num1+num2));
        System.out.println("Subtraction of "+num1+ " and " +num2+ ": "+(num1-num2));
        System.out.println("Multiplication of "+num1+ " and " +num2+ ": "+(num1*num2));
        System.out.println("Division of "+num1+ " and " +num2+ ": "+(num1/num2));


    }
}