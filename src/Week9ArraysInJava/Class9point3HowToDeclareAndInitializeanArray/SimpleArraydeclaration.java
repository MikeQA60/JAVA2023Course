package Week9ArraysInJava.Class9point3HowToDeclareAndInitializeanArray;

public class SimpleArraydeclaration {

    public static void main(String[] args) {

    }
    // This line defines a public static method named createArray that takes an integer parameter named size.
    // The method returns an array of Integer objects.

    public static Integer[]
    createArray(int size){

        // Check if the given size is less than or equal to 0
        if(size <= 0){
            // If the size is not valid, set it to 1 (minimum valid size)
            size = 1;
        }
        // Create a new array of Integers with the specified size
        return new Integer[size];
    }
}
