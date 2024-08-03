import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchStatement{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter day:");
        int day=Integer.parseInt(br.readLine());
        if(day>=1 && day<=7){
            switch(day){
                case 1:
                  System.out.println("It is Monday");
                   break;
                case 2:
                    System.out.println("It is Tuesday");
                    break;
                case 3:
                    System.out.println("It is Wednesday");
                    break;
                case 4:
                    System.out.println("It is Thursday");
                    break;
                case 5:
                    System.out.println("It is Friday");
                    break;
                case 6:
                    System.out.println("It is Saturday");
                    break;
                case 7:
                    System.out.println("It is Sunday");
                    break;

                default:
                    System.out.println("please select proper day");
            }
        } else {
            System.out.println("Select day between 1 to 7");
        }
    }
}
