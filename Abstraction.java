
//In abstraction class and method  should be abstract
public  abstract class Abstraction{

    public int a=10;

    public abstract void m1();   //abstract method does not have a body

    public void m2(){
        System.out.println("In m2");
    }

}


class Abc extends Abstraction{

    
    // Implement means override the abstract method

    public void m1() {
        System.out.println("In m1");
    }
}

class MainD{
    public static void main(String[] args) {
        Abc obj =new Abc();
        obj.m1();
        obj.m2();
        System.out.println(obj.a);
    }
}