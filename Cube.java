//While loop
//5*4*3*2*1=120
//5 cube =125 then 125-120=5 print this.


public class Cube{
    public static void main(String[] args){
        int a=5;
        int result=1;
        int cube=a*a*a;    // 5 cube=125
        int temp=0;

        while(a!=0){
            result=result*a;
            a--;
        }
        System.out.println(" 5*4*3*2*1="+result);   // result 120


        temp=cube-result;         //temp=125-120
        System.out.println(temp); //temp=5

    }
}