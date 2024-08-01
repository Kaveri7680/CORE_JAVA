// Write a java program using if else,switch case,do while


package inputandoutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw{
    public static void main(String[] args)throws IOException {
        InputStreamReader dayno=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(dayno);

        System.out.println("Enter age:");
        int a =Integer.parseInt(br.readLine());

        if(a>=20&& a<=30) {
            switch (a) {

                case 20:
                    System.out.println("age is 20");
                    break;

                case 21:
                    System.out.println("age is 21");
                    break;

                case 22:
                    System.out.println("age is 22");
                    break;

                case 23:
                    System.out.println("age is 23");
                    break;

                case 24:
                    System.out.println("age is 24");
                    break;

                case 25:
                    System.out.println("age is 25");
                    break;

                case 26:
                    System.out.println("age is 26");
                    break;
                case 27:
                    System.out.println("age is 27");
                    break;
                case 28:
                    System.out.println("age is 28");
                    break;

                case 29:
                    System.out.println("age is 29");
                    break;
                case 30:
                    System.out.println("age is 30");
                    break;
                default:
                    System.out.println("Age is not valid");
            }
        }else{
            System.out.println("age in between 20 to 30");
        }

        do{
            System.out.println(a);
            a++;
        }while(a<=30);

    }
}