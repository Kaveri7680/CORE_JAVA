// Check Armstrong Number


public class ArmstrongNo{
    public static void main(String[] args){
        int  a=153;
        int temp=a;
        int ans=0;


        while(temp!= 0){
            int rem=temp%10;
            ans = ans+(rem*rem*rem);
            temp=temp/10;
        }

        if(ans==a){
            System.out.println(a+" is Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }


    }
}