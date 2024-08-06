//Missing element in 1 to 6 from array


public class MissingElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 4, 6};

        int sum1 = 0;
        for (int i = 1; i <= 6; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("Expected sum of all element from 1 to 6:   "+sum1);
        int sum2 = 0;

        for (int j = 0; j < arr.length; j++) {
            sum2 = sum2 + arr[j];
        }
        System.out.println("Expected sum of all element from 1 to 6 :   "+sum2);

       int misElement=sum1- sum2;
       System.out.println("The Missing element:  "+misElement);
    }
}



