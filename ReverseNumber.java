//Reverse a number and check  the number is palindrome or not.
class ReverseNumber{
    public static void main(String[] args){


        int num2=628678;
        System.out.println("Reverse Number:"+num2);

        int temp=num2;
        int revNum=0;

        for(num2=628678;num2 !=0;num2=num2/10) {
            int rem = num2 % 10;
            revNum = revNum * 10 + rem;
        }
            System.out.println("Revers Number is:" + revNum);

        if(revNum == temp) {
            System.out.println("Palindrome  Number");
        }
            else{
                System.out.println(" Not Palindrome  Number");
            }


    }
}