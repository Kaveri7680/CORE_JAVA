// find  target element


public class Array{
    public static void main(String[] args){

        int[] arr={10,12,9,15,12,10};
        int target=12;

        for (int i=0;i< arr.length;i++){
            if(arr[i]==target) {
                    System.out.println("return element:  " + arr[i]);
                    break;

            }
        }

    }
}