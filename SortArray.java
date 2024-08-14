//sort  array in java using bubble sort


public class SortArray {

    public static void printarr(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int[] arr={10,22,26,24,34,54,18};

        int temp;
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        printarr(arr);
    }
}