package Week12OOPInheritanceInJava.Class12point4ConstructorChainingInJava;

public class Fruitpt1 {
    public static void main(String[] args) {

    }
    // Define a class named Fruit
    class Fruit {
        // Declare instance variables
        public String name;          // The name of the fruit
        int quantity;                // The quantity of the fruit
        double pricePerFruit;        // The price per fruit
        boolean isOrganic;           // Indicates if the fruit is organic

        // Constructor with only the name parameter
        public Fruit(String name) {
            // Call the constructor with all parameters, passing default values for other parameters
            this(name, 0, 0.0, false);
        }

        // Constructor with the name and quantity parameters
        public Fruit(String name, int quantity) {
            // Call the constructor with all parameters, passing default values for other parameters
            this(name, quantity, 0.0, false);
        }

        // Constructor with the name, quantity, and pricePerFruit parameters
        public Fruit(String name, int quantity, double pricePerFruit) {
            // Call the constructor with all parameters, passing default values for other parameters
            this(name, quantity, pricePerFruit, false);
        }

        // Constructor with all parameters
        public Fruit(String name, int quantity, double pricePerFruit, boolean isOrganic) {
            // Initialize instance variables with provided values
            this.name = name;
            this.quantity = quantity;
            this.pricePerFruit = pricePerFruit;
            this.isOrganic = isOrganic;
        }
    }
   // In this code, the Fruit class is defined with four constructors, each offering different sets of parameters for initializing
    // the instance variables. The constructors are used to provide flexibility when creating instances of the Fruit class with
    // varying levels of initialization. The comments explain the purpose of each constructor and the role of the instance variables.
}
