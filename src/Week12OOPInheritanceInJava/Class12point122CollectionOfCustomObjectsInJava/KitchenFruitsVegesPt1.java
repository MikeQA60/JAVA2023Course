package Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava;

import java.util.HashMap;
import java.util.Map;

public class KitchenFruitsVegesPt1 {
    public static void main(String[] args) {

    }
}
class Kitchen {
    private Map<Veges, Double> vegesInventory; // A map to store vegetable inventory (Veges as keys, weights as values)
    private Map<Fruits, Double> fruitsInventory; // A map to store fruit inventory (Fruits as keys, weights as values)

    public Kitchen() {
        // Constructor for the Kitchen class
        vegesInventory = new HashMap<>(); // Initialize the vegetable inventory map
        fruitsInventory = new HashMap<>(); // Initialize the fruit inventory map
    }

    public void addVegetable(Veges vege, double weight) {
        // Method to add a vegetable to the inventory
        vegesInventory.put(vege, weight);
    }

    public void addFruit(Fruits fruit, double weight) {
        // Method to add a fruit to the inventory
        fruitsInventory.put(fruit, weight);
    }

    public void removeVegetable(Veges vege) {
        // Method to remove a vegetable from the inventory
        vegesInventory.remove(vege);
    }

    public void removeFruit(Fruits fruit) {
        // Method to remove a fruit from the inventory
        fruitsInventory.remove(fruit);
    }

    public Map<Veges, Double> getVegeInventory() {
        // Method to get the vegetable inventory map
        return vegesInventory;
    }

    public Map<Fruits, Double> getFruitInventory() {
        // Method to get the fruit inventory map
        return fruitsInventory;
    }
}

class Veges {
    private String name;
    private final String arrivalTime;
    private final String expireDate;

    public Veges(String name, String arrivalTime, String expireDate) {
        // Constructor for the Veges class
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getExpireDate() {
        return expireDate;
    }
}

class Fruits {
    private String name;
    private final String arrivalTime;
    private final String expireDate;

    public Fruits(String name, String arrivalTime, String expireDate) {
        // Constructor for the Fruits class
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getExpireDate() {
        return expireDate;
    }
}
