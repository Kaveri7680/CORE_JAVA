//Name in Pattern
//K
//KA
//KAV
//KAVE
//KAVER
//KAVERI


public class  NameinPattern{
    public static void main(String[] args){

        String name="KAVERI";
        int length=name.length();

        for(int i=1;i<=length;i++){
            for(int j=0; j<i;j++){
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }

    }
}