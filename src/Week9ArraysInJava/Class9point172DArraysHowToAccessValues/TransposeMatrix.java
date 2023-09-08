package Week9ArraysInJava.Class9point172DArraysHowToAccessValues;

/*
Description: Write a method called transposeMatrix() that takes a 2D array of integers as input.
The method should transpose the matrix, i.e. swap the rows and columns, and return the transposed matrix.

Params: A 2D array of integers.

Return: A 2D array of integers representing the transposed matrix.

Example:

int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

transposeMatrix(matrix); // Returns {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}

Explanation: The input matrix has 3 rows and 3 columns. The transpose of the matrix swaps the rows and columns,
 resulting in a new matrix with 3 columns and 3 rows.

Note: If the input matrix is empty or not square (i.e. has different number of rows and columns), return an empty 2D array.
 */
public class TransposeMatrix {

    public static void main(String[] args) {

    }

    // In summary, this code defines a method transposeMatrix that takes a 2D integer array as input and
    // returns its transposed version. The method checks if the input array is square (number of rows equals number of columns)
    // and then performs the transposition.
    // If the input array is not square or if it's empty, the method returns an empty array.
    public static int[][] transposeMatrix(int[][] multiArray) {
        // Define a method that takes a 2D integer array as input and returns a transposed 2D integer array.

        int[][] emptyArray = {};
        // Create an empty 2D integer array. This will be returned if the input array is empty.

        int row = multiArray.length;
        // Get the number of rows in the input 2D array.

        if (row == 0) {
            return emptyArray;
            // If the input array has 0 rows, return the empty array.
        } else {
            int[][] transpose = new int[row][row];
            // Create a new 2D integer array to store the transposed matrix.

            for (int i = 0; i < row; i++) {
                // Loop through the rows of the input array.

                if (multiArray[i].length != row) {
                    // Check if the current row's length is not equal to the number of rows.
                    // This indicates the input array is not a square matrix.

                    return emptyArray;
                    // If the input array is not a square matrix, return the empty array.
                } else {
                    // If the current row's length matches the number of rows...

                    for (int j = 0; j < row; j++) {
                        // Loop through the columns of the input array.

                        transpose[j][i] = multiArray[i][j];
                        // Assign the value at (i, j) in the input array to (j, i) in the transposed array.
                    }
                }
            }
            return transpose;
            // Return the transposed array.
        }
    }





}
