package Week12OOPInheritanceInJava.Class12point19SuperKeyWordINJavaInheritance;

public class BuildingPt1 {
    public static void main(String[] args) {

    }
}
// Defining the base class "Building"
class Building {
    // Private instance variables for name and floors
    private String name;
    private int floors;

    // Constructor for Building class with name and floors parameters
    public Building(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    // Overloaded constructor for Building class with only name parameter
    public Building(String name) {
        // Calling the parameterized constructor with default value of 1 floor
        this(name, 1);
    }

    // Getter method for retrieving the name of the building
    public String getName() {
        return name;
    }

    // Getter method for retrieving the number of floors in the building
    public int getFloors() {
        return floors;
    }
}

// Defining a subclass "House" that inherits from "Building"
class House extends Building {
    // Private instance variable for bedrooms
    private int bedrooms;

    // Constructor for House class with name, floors, and bedrooms parameters
    public House(String name, int floors, int bedrooms) {
        // Calling the superclass constructor with name and floors
        super(name, floors);
        this.bedrooms = bedrooms;
    }

    // Getter method for retrieving the number of bedrooms in the house
    public int getBedrooms() {
        return bedrooms;
    }
}

// Defining another subclass "Skyscraper" that inherits from "Building"
class Skyscraper extends Building {
    // Private instance variable for elevators
    private int elevators;

    // Constructor for Skyscraper class with name, floors, and elevators parameters
    public Skyscraper(String name, int floors, int elevators) {
        // Calling the superclass constructor with name and floors
        super(name, floors);
        this.elevators = elevators;
    }

    // Getter method for retrieving the number of elevators in the skyscraper
    public int getElevators() {
        return elevators;
    }
}

//This code defines a class hierarchy for buildings, where the Building class is the base class,
// and the House and Skyscraper classes are subclasses. The subclasses inherit properties and methods from the base class.
// The code showcases the concept of inheritance and demonstrates how the subclass constructors can call the superclass constructor to initialize
// common properties. Each subclass introduces additional instance variables and methods that are specific to houses and skyscrapers, respectively.


