package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point6NestedForLoops;

public class DiamondPattern {
    public static void main(String[] args) {

    }

    public static void printDiamond(int n, char symbol) {
        if (n < 1 || n > 50 || n % 2 == 0) {
            System.out.println("Invalid input! n must be a positive odd integer less than 50.");
            return;
        }

        int spaces = n / 2;
        int stars = 1;

        // Upper half of the diamond
        for (int i = 0; i <= n/2; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print(symbol);
            }

            System.out.println();

            spaces--;
            stars += 2;
        }

        // Lower half of the diamond
        spaces = 1;
        stars = n - 2;

        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print(symbol);
            }

            System.out.println();

            spaces++;
            stars -= 2;
        }
    }
}

/*
) There is an issue with your input validation, your statement allows for even numbers and doesn't allow 1 to pass.
 Also, you need to add a return to finish executing the method right after the statement, but since our method is void return will be empty:
if (n <= 1 || n > 50 || n % 2 == 0) {
            System.out.println("Invalid input! n must be a positive odd integer less than 50.");
            return;
        }
2)You need to update the loop conditions to ensure the correct number of rows are printed.
- In the upper half of the diamond, the loop condition was changed from 'i <=n' to 'i <= n/2' to print the correct number of rows.
- In the lower half of the diamond, the loop condition was changed from 'i >= 1' to 'i < n/2' to mirror the upper half.
3)You should adjust the calculation of the number of spaces and stars for each row to ensure the correct pattern is printed.
- In the upper half, the number of spaces is initialized to n/2 and decreases by 1 in each iteration, while the number of stars
is initialized to 1 and increases by 2 in each iteration.
- In the lower half, the number of spaces is initialized to 1 and increases by 1 in each iteration, while the number of stars is
 initialized to n - 2(the maximum number of stars in the upper half) and decreases by 2 in each iteration.
Overall this how your code should look like:

 */
