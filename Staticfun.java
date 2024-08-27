import java.util.Scanner;

public class Staticfun {

    public static int  addition(int a,int b){ //static function
        System.out.println(a+b);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter two number:");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int add=Staticfun.addition(num1,num2); //call to function
        System.out.print(add);
    }
}