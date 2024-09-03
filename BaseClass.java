public class BaseClass{

    BaseClass(){
        System.out.println("In BaseClass");
    }
    int a=100;

    public void m1(){
        System.out.println("In m1 BaseClass method ");
    }

    public void m2(){
        System.out.println("In m2 BaseClass mathod");
    }
}

class  DerivedClass extends BaseClass{

    DerivedClass(){
        System.out.println("In Derived class ");
    }
//    int a=200;

    public void m3(){
        System.out.println("In m3 derived class  method");
    }
}

class  school {
    int a = 1000;

    public static void main(String[] args) {
//        BaseClass baseClass=new BaseClass();
        DerivedClass derivedClass = new DerivedClass();

        System.out.println(derivedClass.a);


    }

}
