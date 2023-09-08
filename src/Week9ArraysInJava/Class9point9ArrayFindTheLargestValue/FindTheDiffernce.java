package Week9ArraysInJava.Class9point9ArrayFindTheLargestValue;

public class FindTheDiffernce {

    public static void main(String[] args) {

    }

    public static double findAndCalculate(int[] arr, double [] array){
        if(arr.length == 0 || array.length == 0){
            return -1.0;
        }
        int largest = arr[0];
        double smallest = array[0];

        for (int i =1; i < arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];

            }
        }
        for (int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];

                smallest = array[i];
            }
        }
        return largest - smallest;
    }
}
