public interface Interface {
    public void m1();
    public int  m1(int num);
}

class Demod implements Interface{
    @Override
    public void m1() {
        System.out.println("In m1");
    }

    @Override
    public int  m1(int num) {
        System.out.println("in m1(num)");
        return 0;
    }
}

class Kaveri{
    public static void main(String[] args) {
        Demod obj=new Demod();
        //or
       // Interface obj=new Demod() {


        obj.m1();
        obj.m1(10);
    }
}