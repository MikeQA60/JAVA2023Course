package Week12OOPInheritanceInJava.Class12point5EncapsulationGetterMethodInJava;

public class PersonalData {
    public static void main(String[] args) {

    }
    // Define a class named "Person"
    class Person {

        // Private instance variables to store personal information
        private String name;
        private int age;
        private String email;
        private String phoneNumber;

        // Constructor to initialize the instance variables
        public Person(String name, int age, String email, String phoneNumber) {
            // Initialize instance variables with the provided values
            this.name = name;
            this.age = age;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getter method to access the "name" instance variable
        public String getName() {
            return name; // Return the value of "name"
        }

        // Getter method to access the "age" instance variable
        public int getAge() {
            return age; // Return the value of "age"
        }
    }
}
//    In this code, a class named "Person" is defined. It has private instance variables name, age, email, and phoneNumber to store personal information. The constructor is used to initialize these instance variables when an instance of the class is created.
//
//    Getter methods are provided to allow access to the private instance variables name and age from outside the class. These getter methods ensure encapsulation by providing controlled access to certain attributes of the class. The comments explain the purpose of each method and the role of each instance variable.
//}
