package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point8HashCodeAndEqaulsMethodsOverridingInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class IceCreamFavorPt1 {
    public static void main(String[] args) {

    }
}

// Define the class "IceCreamFlavor"
class IceCreamFlavor {
    // Static variable for generating unique IDs starting from 1000
    private static int lastId = 1000;

    // Instance variables for the IceCreamFlavor class
    private int id;                 // Unique identifier for the ice cream flavor
    private String name;            // Name of the ice cream flavor
    private String base;            // Base of the ice cream flavor (e.g., vanilla, chocolate)
    private List<String> ingredients;  // List of ingredients used in the ice cream flavor

    // Constructor for initializing IceCreamFlavor objects
    public IceCreamFlavor(String name, String base, List<String> ingredients) {
        // Assign a unique ID by incrementing lastId
        this.id = lastId++;
        this.name = name;
        this.base = base;
        // Create a new ArrayList with the same elements as ingredients
        this.ingredients = new ArrayList<>(ingredients);
        Collections.sort(this.ingredients); // Sort ingredients alphabetically
    }

    // Override the hashCode method for custom hashing
    @Override
    public int hashCode() {
        // Generate a hash code based on the lowercase name and base
        return Objects.hash(name.toLowerCase(), base.toLowerCase());
    }

    // Override the equals method for custom equality comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // Check if the provided object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Since the previous checks passed, we cast the object to an IceCreamFlavor type
        IceCreamFlavor otherFlavor = (IceCreamFlavor) obj;
        // Perform attribute-wise comparison using the equalsIgnoreCase method
        return name.equalsIgnoreCase(otherFlavor.name) &&
                base.equalsIgnoreCase(otherFlavor.base) &&
                ingredients.equals(otherFlavor.ingredients);
    }
}

