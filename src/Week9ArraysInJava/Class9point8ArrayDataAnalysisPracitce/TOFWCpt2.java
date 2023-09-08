package Week9ArraysInJava.Class9point8ArrayDataAnalysisPracitce;

/*
Description: Write a method called calculateTotalCost() that takes three arrays as input: an array of integers
representing the quantity of each item, an array of strings representing the name of each item, and an array of
 doubles representing the cost of each item. The method should calculate and return the total cost of all items whose
  name has an even length.

Params: Three arrays of equal size: an array of integers representing the quantity of each item,
an array of strings representing the name of each item, and an array of doubles representing the cost of each item.

Return: A double value representing the total cost of all items whose name has an even length.

Example:

calculateTotalCost([2, 3, 4], ["apple", "banana", "orange"], [0.5, 0.25, 0.75]);
 // Returns 3.75 (3 bananas at $0.25 each and 4 oranges at $0.75 each)

calculateTotalCost([1, 0, 2], ["coffee", "tea", "juice"], [10.0, 8.0, 2.0]);
 // Returns 10.0 (1 coffee at $10.0 each)

calculateTotalCost([1, 2, 3], ["pizza", "burger", "fries"], [20.0, 10.0, 30.0]);
3// Returns 20.0 (2 burgers at $10.0 each)

Note: return -1.0 if arrays are not of equal size, or if any quantity or cost is negative.
 */
public class TOFWCpt2 {
    public static void main(String[] args) {

    }

    // Define a method named calculateTotalCost, which takes three arrays as input:
// - quantities (integers representing item quantities)
// - itemNames (strings representing item names)
// - itemCosts (doubles representing item costs)
    public static double calculateTotalCost(int[] quantities, String[] itemNames, double[] itemCosts) {
        // Check if the lengths of the arrays are not equal
        if (quantities.length != itemNames.length || quantities.length != itemCosts.length) {
            return -1.0; // Return -1.0 if arrays are not of equal length
        }

        double totalCost = 0.0; // Initialize a variable to keep track of the total cost

        // Iterate through the arrays
        for (int i = 0; i < quantities.length; i++) {
            // Check if the length of the item name is even
            if (itemNames[i].length() % 2 == 0) {
                totalCost += quantities[i] * itemCosts[i]; // Add cost of item to totalCost
            } else if (quantities[i] < 0 || itemCosts[i] < 0) {
                return -1.0; // Return -1.0 if quantities or item costs are negative
            }
        }

        return totalCost; // Return the calculated total cost
    }
}
