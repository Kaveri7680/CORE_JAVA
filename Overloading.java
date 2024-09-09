public class Overloading {

    //Constructor
    Overloading(){
        System.out.println("OverLoading Constructor");
    }

    //non Parameterised Constructor
    public void m1(){
        System.out.println("In m1");
    }

    //Parameterised
    public int m1(int a){
        System.out.println("print  a:");
        return 0;
    }

    public int m1(int a,int b){
        System.out.println("print a,b");
        return 0;
    }

    private double m1(double a){
        System.out.println("print double b");
        return 0;
    }

    public static void main(String[] args) {
        Overloading obj=new Overloading();//call goes to constructor because object is created

        obj.m1();// call goes to non parameterised Constructor
        obj.m1(10);//call goes to parameterised Constructor
        int ans= obj.m1(10,20);//call goes to parameterised Constructor which have 2 parameter and have integer data type
        System.out.println(ans);

        obj.m1(12.2);// call goes to parameterised Constructor which parameter have double data type.
    }
}

