//Count Even digit in given number.
public class CountEvenDigit{
    public static void main(String[] args){
        int a=2637;
        int count=0;
        for(a=2637; a!=0 ;a=a/10){
            if(a%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}