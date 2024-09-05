public class Mathopration {

    int a=10;
    int b=20;
    private void m1(){
        System.out.println("Parent Addition:"+(a+b));
    }
}

class addition extends Mathopration{
    int a=30;
    int b=40;

    public void   m1(){
        System.out.println("Child Addition:"+(a+b));
    }
}

class Opration{
    public static void main(String[] args) {
        //overriding
        addition math=new addition();

        math.m1();

//        math.m2();
//
        //runtime polymorphism
//        Mathopration math=new addition();
//        math.m1();
    }
}