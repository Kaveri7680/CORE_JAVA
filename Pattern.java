//print a pattern
// 1 2 3 4
// 4 3 2 1
// 1 2 3 4
// 4 3 2 1


public class Pattern{
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            if(i%2==0) {
                for (int j = 4; j >= 1; j--) {
                    System.out.print(j+" ");
                }
            } else{
                     for(int j=1;j<=4;j++) {
                         System.out.print(j+" ");
                         }
                     }
            System.out.println();
        }
    }
}