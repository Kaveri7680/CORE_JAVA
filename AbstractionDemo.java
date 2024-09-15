public abstract class AbstractionDemo{

    public abstract void  instruction();

    public void implement(){
        System.out.println("Distribute more vaccine");
    }
}

class India extends AbstractionDemo{

    public void instruction(){
        System.out.println("Stay Safe !!");
    }
}

class USA extends AbstractionDemo{
    public void instruction(){
        System.out.println("Stay Home!!");
    }
}


class Who{
    public static void main(String[] args) {
        India india=new India();
        india.instruction();
        india.implement();

        USA usa=new USA();
        usa.instruction();
        usa.implement();
    }
}