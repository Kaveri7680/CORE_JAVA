//Addition of two number


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input{
    public static void main(String[] args)throws IOException{
        InputStreamReader num= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(num);

        System.out.println("Enter  2 number");
        int num1=Integer.parseInt(br.readLine());
        int num2=Integer.parseInt(br.readLine());

        System.out.println("Addition of number:"+(num1+num2));



    }
}
