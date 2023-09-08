package Week12OOPInheritanceInJava.Class12point22InstanceVariablesAndMethodsThatAreSpecificToAChildClass;

public class Shapept1 {
    public static void main(String[] args) {

    }
}
// Defining the base class "Shape"
class Shape {
    // Protected instance variables accessible to subclasses
    protected String name;
    protected double area;

    // Constructor to initialize the name
    public Shape(String name) {
        this.name = name;
    }

    // Method to print the area of the shape
    public void printArea() {
        System.out.println("The area of the " + name + " is: " + area);
    }
}

// Defining a subclass "Circle" that inherits from "Shape"
class Circle extends Shape {
    private double radius;

    // Constructor for the Circle class
    public Circle(double radius) {
        // Calling the superclass constructor and setting the shape name
        super("Circle");
        this.radius = radius;
    }

    // Method to calculate and print the area of the circle
    public void printAreaCircle() {
        // Calculating the area of the circle
        super.area = 3.14 * radius * radius;
        // Calling the printArea method from the superclass
        super.printArea();
    }
}

// Defining another subclass "Rectangle" that inherits from "Shape"
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for the Rectangle class
    public Rectangle(double length, double width) {
        // Calling the superclass constructor and setting the shape name
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Method to calculate and print the area of the rectangle
    public void printAreaRectangle() {
        // Calculating the area of the rectangle
        super.area = length * width;
        // Calling the printArea method from the superclass
        super.printArea();
    }
}
   // This code defines a class hierarchy for shapes, where the Shape class is the base class and the Circle and Rectangle
// classes are subclasses. The subclasses inherit properties and methods from the base class.
// They also introduce specific methods for calculating and printing the areas of circles and rectangles, respectively.
// The code showcases the concept of inheritance and demonstrates how the subclass methods can utilize and extend
// the functionality provided by the base class.






