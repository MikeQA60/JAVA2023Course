package Week9ArraysInJava.Class9point8ArrayDataAnalysisPracitce;

public class TotalofGroceriesWithCondition {
    public static void main(String[] args) {

    }
    // Define a method named calculateTotalCost, which takes three arrays as input:
// - quantities (integers representing item quantities)
// - itemNames (strings representing item names)
// - itemCosts (doubles representing item costs)
    public static double calculateTotalCost(int[] quantities, String[] itemNames, double[] itemCosts) {
        // Check if arrays are of equal size
        if (quantities.length != itemNames.length || quantities.length != itemCosts.length) {
            return -1.0; // Return -1.0 if arrays are not of equal size
        }

        double totalCost = 0.0; // Initialize the total cost as 0.0

        // Iterate through each item
        for (int i = 0; i < quantities.length; i++) {
            // Check for negative quantity or cost
            if (quantities[i] < 0 || itemCosts[i] < 0) {
                return 0.0; // Return 0.0 if quantity or cost is negative
            }

            // Check if the length of the item name is even
            if (itemNames[i].length() % 2 == 0) {
                totalCost += quantities[i] * itemCosts[i]; // Add cost of item to totalCost
            }
        }

        return totalCost; // Return the calculated total cost
    }

}
