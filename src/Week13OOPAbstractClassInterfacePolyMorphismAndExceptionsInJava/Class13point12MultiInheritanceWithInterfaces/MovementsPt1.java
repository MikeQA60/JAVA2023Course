package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point12MultiInheritanceWithInterfaces;

public class MovementsPt1 {
    public static void main(String[] args) {

    }
}

// Define the Movable interface with moveForward and moveBackward methods
interface Movable {
    void moveForward(int distance);
    void moveBackward(int distance);
}

// Define the Resizable interface with increaseSize and decreaseSize methods
interface Resizable {
    void increaseSize(int factor);
    void decreaseSize(int factor);
}

// Implement the Body class that implements both Movable and Resizable interfaces
class Body implements Movable, Resizable {
    private int height;
    private int width;

    // Constructor to initialize height and width
    public Body(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // Implement the moveForward method from Movable interface
    @Override
    public void moveForward(int distance) {
        height += distance;
    }

    // Implement the moveBackward method from Movable interface
    @Override
    public void moveBackward(int distance) {
        height -= distance;
    }

    // Implement the increaseSize method from Resizable interface
    @Override
    public void increaseSize(int factor) {
        height *= factor;
        width *= factor;
    }

    // Implement the decreaseSize method from Resizable interface
    @Override
    public void decreaseSize(int factor) {
        height /= factor;
        width /= factor;
    }

    // Display the current size of the body
    public void displaySize() {
        System.out.println("Current size: Height=" + height + ", Width=" + width);
    }
}