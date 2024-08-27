public class SaticInstanceVariable {
    //instance variable
    int a=10;


    //static variable
    static int b=20;

    public static void main(String[] args) {
        SaticInstanceVariable obj=new SaticInstanceVariable();
        System.out.println(obj.a);

        System.out.println(b);
    }
}