public class InserationSort {
    public static void inserationSort (int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct postion to insert
            while (prev >= 0 && arr[prev] > curr){
                arr [prev+1] = arr[prev];
                prev--;
            }
            //inseration
            arr[prev+1] = curr;

        }
    }
    public static void printArr (int arr[]){
        for (int i = 0; i< arr.length;i++){
            System.out.print (arr[i] + " ");

        }

    }
    public static void main (String[]args){
        int arr[] = {5,4,1,3,2};
        inserationSort(arr);
        printArr(arr);
    }
}
