public class Exception {
    public static void main(String[] args) {
        try{
            int num=1;
            int ans=num/0;
        }catch (java.lang.Exception ex){
            ex.printStackTrace();
            System.out.println("Handle Exception");
        }
    }
}