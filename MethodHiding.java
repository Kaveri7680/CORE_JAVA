public class MethodHiding {

    public void m1(){
        System.out.println("In parent m1");
    }

    static void m2(){
        System.out.println("In  parent m2");
    }
}


class Childd extends MethodHiding{

    @Override
    public void m1() {
        System.out.println("In child m1");
    }

    static void m2(){
        System.out.println("In child m2");
    }
}

class Method{
    public static void main(String[] args) {

        MethodHiding obj=new Childd();

        obj.m1();
        obj.m2();
    }
}