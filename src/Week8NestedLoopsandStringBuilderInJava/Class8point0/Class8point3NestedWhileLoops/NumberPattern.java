package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point3NestedWhileLoops;

public class NumberPattern {
    public static void main(String[] args) {

    }
    public static void  printNumberTriangle(int n){

        // Initialize a variable i with the value 1, this will be used for the outer loop control.
        int i = 1;

        while (i <=n) {
            int j = 1;
            while (j <= i){

                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
/*
In summary, this method nestedWhileLoopPattern uses nested while loops to generate the pattern you provided.
 The outer while loop iterates from 1 to n, controlling the number of rows in the pattern.
 The inner while loop iterates from 1 to the current row number i, printing the value of i repeatedly to create the pattern.
 After printing the numbers for each row, a newline is added to move to the next line for the next row of the pattern.
 The loop continues until all rows are printed as per the input value n.
 */
}

