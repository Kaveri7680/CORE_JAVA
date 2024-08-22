import java.util.Scanner;

public class AddFn {

    public void add(int num1,int num2){
        System.out.println("Addition is:"+(num1+num2));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        AddFn obj=new AddFn();

        obj.add(n1,n2);
    }
}