package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point9IntroToAbstraction;

public class DrinkPt1 {
    public static void main(String[] args) {

    }
}
// Define an abstract class called "Drink"
abstract class Drink {
    String name;
    double price;

    // Constructor to initialize name and price
    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method that represents serving the drink
    public abstract void serve();
}

// Define a class called "Coffee" that extends "Drink"
class Coffee extends Drink {
    String strength; // Additional instance variable for Coffee

    // Constructor to initialize name, price, and strength
    public Coffee(String name, double price, String strength) {
        super(name, price); // Call the parent class constructor
        this.strength = strength;
    }

    // Implement the abstract method "serve" for Coffee
    @Override
    public void serve() {
        System.out.println("Serving a cup of coffee");
    }
}

// Define a class called "Juice" that extends "Drink"
class Juice extends Drink {
    String flavor; // Additional instance variable for Juice

    // Constructor to initialize name, price, and flavor
    public Juice(String name, double price, String flavor) {
        super(name, price); // Call the parent class constructor
        this.flavor = flavor;
    }

    // Implement the abstract method "serve" for Juice
    @Override
    public void serve() {
        System.out.println("Serving a glass of juice");
    }
}
 //   This code defines an abstract class Drink and two concrete classes Coffee and Juice that inherit from Drink.
//   The abstract class Drink defines a common structure for drinks, while the concrete subclasses provide specific
//   implementations for serving coffee and juice. The code demonstrates the concept of inheritance and abstraction in object-oriented programming.
