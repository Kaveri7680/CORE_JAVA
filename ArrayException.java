import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        String[] array=new String[10];
        for (int i=0;i<10;i++){
            System.out.println("Enter element");
            String number=sc.next();
            try{
                int num=Integer.parseInt(number);
                arr[i]=num;
            }catch (Exception ex){
                array[i]=number;
            }
        }
        for (int i=0;i<10;i++) {
            System.out.println("Integer array:" + arr[i]);
        }
        for (int i=0;i <10;i++){
            System.out.println("Chat array:  "+array[i]);
        }
    }
}