package Week12OOPInheritanceInJava.Class12point2ConstructorOverloadingInJava;

public class DogAndTheOrderOfParams1 {
    public static void main(String[] args) {

    }

    class Dog {

        // Public instance variables to store dog information
        public String name; //This variable will store the name of the dog.
        public int age;// This variable will store the age of the dog.

        // Constructor with two parameters
        public Dog(String name, int age) {
            // Initialize the instance variables with the provided values
            this.name = name;
            this.age = age;
        }

        // Constructor with two parameters (in different order)
        public Dog(int age, String name) {
            // Initialize the instance variables with the provided values
            this.name = name;
            this.age = age;
        }
    }
}


//    class Dog {: Defines a class named Dog.
//
//        Public instance variables:
//
//        public String name;: This variable will store the name of the dog.
//        public int age;: This variable will store the age of the dog.
//        Constructor with two parameters:
//
//        public Dog(String name, int age) {: This constructor takes two parameters: name for the dog's name and age for the dog's age. It initializes the instance variables with the provided values using the this keyword to differentiate between the instance variables and the constructor parameters.
//                Constructor with two parameters (in different order):
//
//public Dog(int age, String name) {: This constructor also takes two parameters, but in a different order compared to the previous constructor. It is another way to initialize the instance variables with the provided values using the this keyword.
//                    In summary, this code defines a Dog class with two constructors. Both constructors allow creating Dog objects with different orders of name and age parameters. The class has public instance variables to store the dog's name and age.
