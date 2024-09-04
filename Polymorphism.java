// Runtime polymorphism


public class Polymorphism {
    //above Polymorphism is parent class
    int a=100;

    Polymorphism(){
        System.out.println("In Parent Constructor");
    }

    public void m1(){
        System.out.println("In Parent m1");
    }
}


 class Child extends Polymorphism{
    int a=200;

  Child(){
      System.out.println("In child Constructor ");
  }
//    public void m1(){
//        System.out.println("In Child m1");
//    }
 }


 class Runtime{
     public static void main(String[] args) {

         //Runtime polymorphism
        Polymorphism p=new Child();
        p.m1();
     }
 }