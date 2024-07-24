//Addition of  Even digit
class AdditionOfDigit{
    public static void main(String[] args){
        System.out.println("Addition of Number:");

        int num1=5286;
        int add=0;
        for(num1=5286; num1 !=0 ;num1=num1/10){
            int rem=num1%10;
            if(rem%2==0){
                add=add+rem;
            }
            System.out.println(add);
        }
    }
}