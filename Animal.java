// overriding

public class Animal {

    Animal(){
        System.out.println("In parent Class");
    }
   private void sound(){
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal{

    Dog(){
        System.out.println("In child class");
    }
    //Overriding
   public void sound(){
        System.out.println("Dog Bark");
    }
}

class Main{
    public static void main(String[] args) {
//        Animal animal=new Animal();
//         animal.sound();


         Dog d=new Dog();  //  call goes to Parent and child  constructor because of  inheritance
                              // here Dog has parent class so which is Animal there for  2 Constructor  print
         d.sound();

    }
}