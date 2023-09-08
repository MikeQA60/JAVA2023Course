package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point12MultiInheritanceWithInterfaces;

public class Parkpt1 {
    public static void main(String[] args) {

    }
}
// Define the PublicSpace interface with visit() and relax() methods
interface PublicSpace {
    void visit();
    void relax();
}

// Define the GreenSpace interface with plantTrees() and waterPlants() methods
interface GreenSpace {
    void plantTrees();
    void waterPlants();
}

// Implement the Park class that implements both PublicSpace and GreenSpace interfaces
class Park implements PublicSpace, GreenSpace {
    private String parkName;
    private int area;

    // Constructor to initialize park name and area
    public Park(String parkName, int area) {
        this.parkName = parkName;
        this.area = area;
    }

    // Override the visit() method from PublicSpace interface
    @Override
    public void visit() {
        System.out.println("Visiting " + parkName + " park");
    }

    // Override the relax() method from PublicSpace interface
    @Override
    public void relax() {
        System.out.println("Relaxing in " + parkName + " park");
    }

    // Override the plantTrees() method from GreenSpace interface
    @Override
    public void plantTrees() {
        System.out.println("Planting trees in " + parkName + " park");
    }

    // Override the waterPlants() method from GreenSpace interface
    @Override
    public void waterPlants() {
        System.out.println("Watering plants in " + parkName + " park");
    }

    // Display park details
    public void showParkDetails() {
        System.out.println("Park: " + parkName);
        System.out.println("Area: " + area + " square meters");
    }
}
