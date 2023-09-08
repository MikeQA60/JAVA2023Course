package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point6NestedForLoops;

public class SumTable {
    public static void main(String[] args) {

    }
    public static void printSumTable(int n) {

        // Outer loop: Iterates over the rows from 1 to 'n'
        for (int i = 1; i <= n; i++) {
            // Inner loop: Iterates over the columns from 1 to 'n'
            // Calculate the sum based on the row index 'i' and column index 'j'
            // We subtract 1 from the sum to make the table start with 1 instead of 2
            for (int j = 1; j <= n; j++) {


                int sum = i + j - 1; // Calculate the sum based on the row and column indices

                // Print the calculated 'sum' followed by a tab character ('\t')
                System.out.print(sum + "\t"); // Print the sum followed by a tab character
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
