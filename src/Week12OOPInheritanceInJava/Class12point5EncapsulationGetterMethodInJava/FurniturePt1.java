package Week12OOPInheritanceInJava.Class12point5EncapsulationGetterMethodInJava;

public class FurniturePt1 {
    // Define a class named "Furniture"

        public static void main(String[] args) {
            // Create an instance of Furniture
//            Furniture chair = new Furniture("Chair", 59.99, "Wood", "ABC Furniture");
//
//            // Access instance variables and getter methods
//            System.out.println(chair.type);        // Output: Chair
//            System.out.println(chair.price);       // Output: 59.99
//            System.out.println(chair.getMaterial()); // Output: Wood
//            System.out.println(chair.getBrand());    // Output: ABC Furniture
        }


    class Furniture {
        // Public instance variables
        public String type;  // Represents the type of furniture
        public double price; // Represents the price of the furniture

        // Private instance variables
        private String material; // Represents the material used
        private String brand;    // Represents the brand of the furniture

        // Constructor to initialize all instance variables
        public Furniture(String type, double price, String material, String brand) {
            this.type = type;
            this.price = price;
            this.material = material;
            this.brand = brand;
        }

        // Getter method to access the "material" instance variable
        public String getMaterial() {
            return material;
        }

        // Getter method to access the "brand" instance variable
        public String getBrand() {
            return brand;
        }
    }
}
//    In this code, the Furniture class is defined with two public instance variables (type and price) and
//    two private instance variables (material and brand). The constructor initializes all these variables.
//    Getter methods are provided for the private variables to allow controlled access to their values. The example usage in the main method demonstrates how to create an instance of Furniture and access its attributes using both direct access and getter methods.
//}
