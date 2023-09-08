package Week9ArraysInJava.Class9point5DifferentDataTypesofArrays;

public class CheckMiddleBoolean {
    public static void main(String[] args) {

    }
    public static int checkMiddle(boolean [] arr){

        // Get the length of the array
        int length = arr.length;
        // Check if the array is empty
        if(length ==0){

            // Return -1 if the array is empty
            return -1;
        }

        // Check if the length of the array is odd
        if(length%2 ==1) {
            // Calculate the index of the middle element
            int middleIndex = length / 2;

            // Return 1 if the middle element is true, else return -1
            return arr[middleIndex] ? 1 : -1;

        }else {

            // Calculate the indices of the two middle elements for even length array
            int middleIndex1 = length / 2 - 1;
            int middleIndex2 = length / 2;

            // Return 1 if both middle elements are true, else return -1
            return arr[middleIndex1] && arr[middleIndex2] ? 1: 1;
        }
    }
}
