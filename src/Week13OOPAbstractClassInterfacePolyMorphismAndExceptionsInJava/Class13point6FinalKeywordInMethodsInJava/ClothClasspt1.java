package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point6FinalKeywordInMethodsInJava;

public class ClothClasspt1 {
    public static void main(String[] args) {

    }
}
// Define a class named Cloth.
class Cloth {
    // Private instance variables to store brand and price.
    private String brand;
    private double price;

    // Constructor to initialize brand and price when an object is created.
    public Cloth(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Getter method for brand.
    public String getBrand() {
        return brand;
    }

    // Getter method for price.
    public double getPrice() {
        return price;
    }

    // Method to display information about the cloth.
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }

    // Final method that provides washing instructions.
    public final void wash() {
        System.out.println("Washing instructions: Gentle cycle, cold water");
    }
}

// Define a subclass named TShirt that inherits from the Cloth class.
class TShirt extends Cloth {
    // Additional instance variable to store the size of the T-shirt.
    private String size;

    // Constructor to initialize brand, price, and size of the T-shirt.
    public TShirt(String brand, double price, String size) {
        // Call the constructor of the superclass (Cloth) to initialize brand and price.
        super(brand, price);
        // Initialize the size of the T-shirt.
        this.size = size;
    }

    // Override the displayInfo method from the parent class to include size information.
    @Override
    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
    }
}

//The Cloth class defines a blueprint for cloth objects with brand and price attributes, along with methods to retrieve these attributes (getBrand() and getPrice()), display cloth information (displayInfo()), and provide washing instructions (wash()).

//        The TShirt class is a subclass of Cloth and adds an extra attribute size. It also overrides the displayInfo() method to include size information. The constructor of TShirt uses super() to call the constructor of the parent class Cloth to initialize brand and price.

    //    The code demonstrates basic object-oriented programming concepts like class inheritance and method overriding. It models a simple representation of cloth and T-shirt objects.
