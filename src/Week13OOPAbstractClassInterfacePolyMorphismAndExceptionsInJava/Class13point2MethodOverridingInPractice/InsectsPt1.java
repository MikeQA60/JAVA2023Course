package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point2MethodOverridingInPractice;

public class InsectsPt1 {
    public static void main(String[] args) {

    }
}
// Define a class named Insect.
class Insect {
    // Declare instance variables for name and lifespan.
    String name;
    int lifeSpan;

    // Setter method to set the name of the insect.
    public void setName(String name) {
        this.name = name;
    }

    // Setter method to set the lifespan of the insect.
    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    // Method to display generic information about insects.
    public void displayInfo() {
        System.out.println("This is an insect.");
    }
}

// Define a subclass named Bee that inherits from Insect.
class Bee extends Insect {

    // Override the displayInfo() method to provide specific information about bees.
    @Override
    public void displayInfo() {
        // Set the name and lifespan attributes for a bee.
        name = "Bee";
        lifeSpan = 30;
        // Display information about bees.
        System.out.println(name + " has a lifespan of " + lifeSpan + " days.");
    }
}

// Define another subclass named Ant that also inherits from Insect.
class Ant extends Insect {
    // Override the displayInfo() method to provide specific information about ants.
    @Override
    public void displayInfo() {
        // Set the name and lifespan attributes for an ant.
        name = "Ant";
        lifeSpan = 45;
        // Display information about ants.
        System.out.println(name + " has a lifespan of " + lifeSpan + " days.");
    }
}
