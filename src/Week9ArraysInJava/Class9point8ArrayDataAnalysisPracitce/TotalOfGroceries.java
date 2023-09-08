package Week9ArraysInJava.Class9point8ArrayDataAnalysisPracitce;

public class TotalOfGroceries {

    public static void main(String[] args) {

    }

    // Define a method named calculateTotalCost which takes three arrays as input
// The arrays represent quantities, item names, and item costs respectively
    // Define a method named calculateTotalCost, which takes three arrays as input:
// - quantities (integers representing item quantities)
// - itemNames (strings representing item names)
// - itemCosts (doubles representing item costs)
    public static double calculateTotalCost(int[] quantities, String[] itemNames, double[] itemCosts) {

        // Check if the lengths of the three arrays are not equal
        // If they are not equal, return -1.0
        if (quantities.length != itemNames.length || quantities.length != itemCosts.length) {
            // If they are not equal, return -1.0
            return -1.0;
        }

        // Initialize a variable to keep track of the total cost
        double totalCost = 0.0;

        // Iterate through the arrays using a loop variable 'i'
        for (int i = 0; i < quantities.length; i++) {

            // Check if the quantity or item cost is negative
            if (quantities[i] < 0 || itemCosts[i] < 0) {
                return 0.0; // If negative, return 0.0
            }



                // Calculate the cost for the current item and add it to the total cost
            totalCost += quantities[i] * itemCosts[i];
        }

        // After iterating through all items, return the total cost
        return totalCost;
        }
    }
