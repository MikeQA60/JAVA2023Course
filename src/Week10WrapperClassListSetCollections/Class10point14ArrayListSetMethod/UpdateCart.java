package Week10WrapperClassListSetCollections.Class10point14ArrayListSetMethod;

/*
Description: Write a method called updateCart() that takes an ArrayList of strings, a target element,
and a replacement element as input. The method should replace all occurrences of the target element in the ArrayList
 with the replacement element regardless of the case.

Params: An ArrayList of strings, a target element (string), and a replacement element (string).

Return: Updated List of Strings.

Note: If ArrayList is empty, return the empty List.
 */
import java.util.ArrayList;
import java.util.List;

public class UpdateCart {
    public static void main(String[] args) {

    }
    public static List<String> updateCart(List<String> cart, String target, String replacement) {
        // Define a method called updateCart that takes a List of strings (cart), a target string, and a replacement string as input.
        // The method returns a new List of strings with occurrences of the target string replaced by the replacement string.

        List<String> updatedCart = new ArrayList<>();
        // Create a new List of strings named 'updatedCart' to store the updated items.

        for (String item : cart) {
            // Start a loop that iterates through each element (item) in the input cart.

            if (item.equalsIgnoreCase(target)) {
                // Check if the current item (case-insensitive) matches the target string.

                updatedCart.add(replacement);
                // If the item matches the target, add the replacement string to the 'updatedCart'.
            } else {
                updatedCart.add(item);
                // If the item doesn't match the target, add the original item to the 'updatedCart'.
            }
        }

        return updatedCart;
        // Return the 'updatedCart' containing items with occurrences of the target string replaced by the replacement string.
    }
  //  In summary, this code defines a method named updateCart that takes a List of strings (cart),
    //  a target string, and a replacement string as input. It goes through each item in the cart,
    //  checks if the item matches the target string (case-insensitive), and adds either the replacement string or
    //  the original item to the updated list (updatedCart). The result is a new list with occurrences of the target string
    //  replaced by the replacement string.
}
