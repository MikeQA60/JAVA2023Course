package Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava;

import java.util.List;

public class BarAndBeveragept1 {
    public static void main(String[] args) {

    }
}

class Bar {
    private String name;
    private List<Beverage> beverages;

    private static int totalBars = 0;
    private final static int MAX_CAPACITY = 100;

    public Bar(String name, List<Beverage> beverages) {
        // Constructor for the Bar class
        this.name = name;
        this.beverages = beverages;
        totalBars++; // Increment totalBars, keeping track of the total number of bars created
    }

    public void addBeverage(Beverage beverage) {
        // Method to add a Beverage object to the beverages list
        if (beverages.size() < MAX_CAPACITY) {
            beverages.add(beverage);
            System.out.println(beverage.getName() + " added to " + name);
        } else {
            System.out.println("The bar is already at maximum capacity.");
        }
    }

    public void serveBeverages() {
        // Method to display the available beverages at the bar
        System.out.println("Beverages available at " + name + ":");
        for (Beverage beverage : beverages) {
            System.out.println("- " + beverage.getName() + " ($" + beverage.getPrice()+")");
        }
    }

    public String getName() {
        return name;
    }

    public static int getTotalBars() {
        return totalBars;
    }
}

class Beverage {
    private String name;
    private double price;

    private static int totalBeverages = 0;
    private final static double MAX_PRICE = 100.0;

    public Beverage(String name, double price) {
        // Constructor for the Beverage class
        this.name = name;
        this.price = price;
        totalBeverages++; // Increment totalBeverages, keeping track of the total number of beverages created
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalBeverages() {
        return totalBeverages;
    }
}