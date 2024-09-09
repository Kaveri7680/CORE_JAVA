import java.util.Scanner;

public class Arrayadd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size:");

        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter array element");
        for (int i=0;i<size;i++){
            int num= sc.nextInt();
            arr[i]=num;
        }

        for (int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        int add=0;
        for (int i=0;i<size;i++){
             add=add+arr[i];
             arr[i]++;



        }
        System.out.println(add);
    }
}