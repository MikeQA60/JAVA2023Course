package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point7ToStringMethodInJava;

public class MobilePhonePt1 {
    public static void main(String[] args) {

    }
}
// Defining the class "MobilePhone"
class MobilePhone {
    // Static variable shared across all instances, initialized to 1
    public static int lastId = 1; // Initialize to 1

    // Instance variables for the MobilePhone class
    public int id;          // Unique identifier for each phone
    public String brand;    // Brand name of the phone
    public String model;    // Model name of the phone
    public double price;    // Price of the phone
    public int year;        // Year the phone was released

    // Constructor for initializing MobilePhone objects
    public MobilePhone(String brand, String model, double price, int year) {
        this.id = lastId; // Assign the current lastId to the id
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        lastId++; // Increment lastId for the next object
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "MobilePhone: {brand=" + brand + ", model=" + model +
                ", price=" + price + "$, year=" + year + "}";
    }
}
