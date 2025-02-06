public class Largest {
    public static int getLargest (int numbers[]){
        int largset = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;//+infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largset < numbers[i]){
                largset = numbers[i];
            }
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in array is: " + smallest);
        return largset;
    }
    public static void main (String[]args){
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest number in array is: " + getLargest(numbers));
    }
}
