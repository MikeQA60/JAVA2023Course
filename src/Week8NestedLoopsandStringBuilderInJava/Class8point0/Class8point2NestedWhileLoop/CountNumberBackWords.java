package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point2NestedWhileLoop;

public class CountNumberBackWords {
    public static void main(String[] args) {

    }

    public static void printBackwards(int input) {
        if (input <= 0) {
            System.out.println("Error! Number n can't be less than 1");
        }
        while (input >= 1) {
            int input2 = input;
            while (input2 >= 1) {
                System.out.print(input2 + " ");
                input2--;
            }
            System.out.println();
            input--;
        }
    }
}