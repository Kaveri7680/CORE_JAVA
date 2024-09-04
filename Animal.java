// overriding

public class Animal {

    Animal(){
        System.out.println("In parent Class");
    }
    public void sound(){
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal{
    //Overriding
    public void sound(){
        System.out.println("Dog Bark");
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal=new Animal();
         animal.sound();


         Animal d=new Dog();
         d.sound();

    }
}