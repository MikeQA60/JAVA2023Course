package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point9IntroToAbstraction;

public class InstrumentPt1 {
    public static void main(String[] args) {

    }
}
// Define an abstract class called "Instrument"
abstract class Instrument {
    // Abstract methods that must be implemented by subclasses
    public abstract void play();
    public abstract void displayInfo();

    // Method to display names of abstract methods in the current class
    // Define a public method named "displayAbstractMethods"
    public void displayAbstractMethods() {
        // Print a message indicating that we're listing abstract methods in the "Instrument" class
        System.out.println("Abstract Methods in Instrument:");

        // Use reflection to retrieve an array of all methods in the current class
        java.lang.reflect.Method[] methods = this.getClass().getMethods();

        // Iterate through the array of methods
        for (java.lang.reflect.Method method : methods) {
            // Check if the current method has the "abstract" modifier
            if (java.lang.reflect.Modifier.isAbstract(method.getModifiers())) {
                // If the method is abstract, print its name
                System.out.println(method.getName());
            }
        }
    }
}

// Define a class "Guitar" that inherits from "Instrument"
class Guitar extends Instrument {
    private int strings; // Instance variable for the number of strings

    // Constructor to initialize the number of strings
    public Guitar(int strings) {
        this.strings = strings;
    }

    // Implementation of the abstract "play" method
    @Override
    public void play() {
        System.out.println("The guitar melody");
    }

    // Method to display information specific to the guitar
    public void displayGuitarInfo() {
        System.out.println("This is a guitar with " + strings + " strings");
    }

    // Implementation of the abstract "displayInfo" method
    @Override
    public void displayInfo() {
        System.out.println("This is a guitar with " + strings + " strings");
    }
}

// Define a class "Piano" that inherits from "Instrument"
class Piano extends Instrument {
    private int keys; // Instance variable for the number of keys

    // Constructor to initialize the number of keys
    public Piano(int keys) {
        this.keys = keys;
    }

    // Implementation of the abstract "play" method
    @Override
    public void play() {
        System.out.println("The piano melody");
    }

    // Method to display information specific to the piano
    public void displayPianoInfo() {
        System.out.println("This is a piano with " + keys + " keys");
    }

    // Implementation of the abstract "displayInfo" method
    @Override
    public void displayInfo() {
        System.out.println("This is a piano with " + keys + " keys");
    }
}
 //   This code defines an abstract class Instrument and two concrete subclasses Guitar and Piano that inherit from it.
//   The Instrument class has abstract methods play and displayInfo, as well as a method displayAbstractMethods
//   that uses reflection to list the abstract methods present in the class. The subclasses Guitar and Piano implement
//   the abstract methods and provide additional methods to display information specific to the respective instruments.
