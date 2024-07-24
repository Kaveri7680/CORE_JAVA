//Count digit in given number.
public class CountDigit{
    public static void main(String[] args){
        int a=2345;
        int count=0;
        for(a=2345; a!=0 ;a=a/10){
            count++;
        }
        System.out.println(count);
    }
}