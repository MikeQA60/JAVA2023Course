package Week12OOPInheritanceInJava.Class12point19SuperKeyWordINJavaInheritance;

public class Devicept1 {
    public static void main(String[] args) {

    }
}

// Defining the base class "Device"
class Device {
    // Private instance variables for brand, model, and price
    private String brand;
    private String model;
    private double price;

    // Constructor for Device class with brand, model, and price parameters
    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Overloaded constructor for Device class with brand and model parameters
    public Device(String brand, String model) {
        // Calling the parameterized constructor with default price of 0.0
        this(brand, model, 0.0);
    }

    // Getter method for retrieving the brand of the device
    public String getBrand() {
        return brand;
    }

    // Getter method for retrieving the model of the device
    public String getModel() {
        return model;
    }

    // Getter method for retrieving the price of the device
    public double getPrice() {
        return price;
    }
}

// Defining a subclass "Laptop" that inherits from "Device"
class Laptop extends Device {
    // Private instance variable for screenSize
    private double screenSize;

    // Constructor for Laptop class with brand, model, price, and screenSize parameters
    public Laptop(String brand, String model, double price, double screenSize) {
        // Calling the superclass constructor with brand, model, and price
        super(brand, model, price);
        this.screenSize = screenSize;
    }

    // Overloaded constructor for Laptop class with brand, model, and screenSize parameters
    public Laptop(String brand, String model, double screenSize) {
        // Calling the superclass constructor with brand, model, and default price
        this(brand, model, 0.0, screenSize);
    }

    // Getter method for retrieving the screen size of the laptop
    public double getScreenSize() {
        return screenSize;
    }
}

// Defining another subclass "Smartphone" that inherits from "Device"
class Smartphone extends Device {
    // Private instance variable for operatingSystem
    private String operatingSystem;

    // Constructor for Smartphone class with brand, model, price, and operatingSystem parameters
    public Smartphone(String brand, String model, double price, String operatingSystem) {
        // Calling the superclass constructor with brand, model, and price
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    // Overloaded constructor for Smartphone class with brand, model, and operatingSystem parameters
    public Smartphone(String brand, String model, String operatingSystem) {
        // Calling the superclass constructor with brand, model, and default price
        this(brand, model, 0.0, operatingSystem);
    }

    // Getter method for retrieving the operating system of the smartphone
    public String getOperatingSystem() {
        return operatingSystem;
    }
}

  //  This code defines a class hierarchy for electronic devices, where the Device class is the base class,
//  and the Laptop and Smartphone classes are subclasses. The subclasses inherit properties and methods from the base class.
//  The code showcases the concept of inheritance and demonstrates how the subclass constructors can call the superclass constructor
//  to initialize common properties. Each subclass introduces additional instance variables
//  and methods that are specific to laptops and smartphones, respectively.