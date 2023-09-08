package Week12OOPInheritanceInJava.Class12point18MoreInstanceVariablesAndMethodsToInherit;

public class AnimalClasspt1 {
    public static void main(String[] args) {

    }
}
// Define a class named "Animal"
class Animal {
    // Private instance variables
    private String name;
    private int age;

    // Getter method for the "name" variable
    public String getName() {
        return name;
    }

    // Setter method for the "name" variable
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the "age" variable
    public int getAge() {
        return age;
    }

    // Setter method for the "age" variable
    public void setAge(int age) {
        // Check if the provided age is negative
        if (age < 0) {
            System.out.println("Age cannot be less than 0. Setting age to 0.");
            this.age = 0;  // Set age to 0 if negative
        } else {
            this.age = age; // Set age to the provided value if non-negative
        }
    }

    // Method to make a generic sound for the animal
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Define a class named "Cat" that inherits from the "Animal" class
class Cat extends Animal {
    // The Cat class inherits the properties and methods of the Animal class.
}
