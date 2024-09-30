import java.util.Scanner;

public class ArrayofObject {
          String name;
          int id;
          double salary;



          public void display(){
              System.out.println("Name:"+name+",ID"+id+",salary"+salary);
          }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayofObject[] obj=new ArrayofObject[5];

        for (int i=0;i<obj.length;i++) {
            obj[i]=new ArrayofObject();
            System.out.println(" Enter Name:"+i);
            obj[i].name=sc.next();


            System.out.println(" Enter ID"+i);
            obj[i].id=sc.nextInt();

            System.out.println(" Enter Salary"+i);
            obj[i].salary=sc.nextInt();

        }

        for (int i=0;i<obj.length;i++){
        obj[i].display();
        }
    }


}