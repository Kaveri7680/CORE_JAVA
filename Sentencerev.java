
public class Sentencerev {
    public static void main(String[] args) {

        String str="My name is kaveri";
        String  rev=" ";

        String[] s=str.split(" "); // str.split(" ") gives {'My','name','is','kaveri'}

        for (int i=0;i< s.length;i++){
             rev=s[i]+" "+rev;
        }
        System.out.println(rev);
    }
}