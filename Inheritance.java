public class Inheritance {

    int farm = 10;
    int noofvehical = 5;

    public void m1() {
        System.out.println("In m1");
    }
}


class ChildDemo extends Inheritance {
    public void c1() {
        System.out.println("In child c1");
    }


    public static void main(String[] args) {
        ChildDemo obj=new ChildDemo();

        obj.m1();
        obj.c1();



    }
}