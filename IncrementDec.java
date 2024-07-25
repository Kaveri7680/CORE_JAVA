
//Increment Decrement operator
public class IncrementDec{
    public static void main(String[] args) {

        int m = 10;
        int n = 99;

        int s=9;
        int p=20;

        int ans = n++ + ++n + m++ + ++m;
         int  check= --s + p-- + s-- +--p;
        System.out.println(ans);
        System.out.println(check);
;    }
}