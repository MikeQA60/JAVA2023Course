package Week12OOPInheritanceInJava.Class12point3ThisKeyWordInJava;

/*
Description: Implement a class called University that represents a university. The class should have four overloaded constructors to provide flexibility in initializing instances of the University class with different sets of parameters.

The University class should have the following instance variables:

name (String): Represents the name of the university.

location (String): Represents the location of the university.

establishedYear (int): Represents the year the university was established.

studentCount (int): Represents the number of students in the university.

The four constructors should have the following parameter combinations:

No-argument constructor: This constructor should initialize the instance variables to default values.

Constructor with the name parameter: This constructor should take a String parameter representing the name of the university.
 It should initialize the name instance variable with the provided value and set the remaining instance variables to default values.

Constructor with the name, location, and establishedYear parameters: This constructor should take a String parameter
 representing the name of the university, a String parameter representing the location of the university, and an int parameter representing
 the year the university was established. It should initialize the name, location, and establishedYear instance variables with the provided values
  and set the studentCount instance variable to a default value.

Constructor with all parameters: This constructor should take a String parameter representing the name of the university,
a String parameter representing the location of the university, an int parameter representing the year the university was established,
and an int parameter representing the number of students in the university. It should initialize all instance variables with the provided values.

By providing four constructors with different sets of parameters, the class allows users to create instances of the University
class with various levels of initialization based on their specific requirements.

Example:

University uni1 = new University(); // Initializes uni1 with default values

University uni2 = new University("ABC University"); // Initializes uni2 with name "ABC University" and default values for other variables

University uni3 = new University("XYZ University", "City Center", 1990); // Initializes uni3 with name "XYZ University",
 location "City Center", established year 1990, and default student count

University uni4 = new University("PQR University", "Suburb Area", 2005, 5000); // Initializes uni4 with name "PQR University",
location "Suburb Area", established year 2005, and student count 5000


 */
public class UniversityClass1 {
    public static void main(String[] args) {

    }

    public class University {

        private String name;
        private String location;
        private int establishedYear;
        private int studentCount;

        // No-argument constructor
        public University() {
            // Initialize instance variables with default values
            name = "Unknown";
            location = "Unknown";
            establishedYear = 0;
            studentCount = 0;
        }

        // Constructor with the name parameter
        public University(String name) {
            this(); // Call the no-argument constructor to set default values
            this.name = name; // Set the provided name
        }

        // Constructor with the name, location, and establishedYear parameters
        public University(String name, String location, int establishedYear) {
            this(name); // Call the constructor with the name parameter
            this.location = location; // Set the provided location
            this.establishedYear = establishedYear; // Set the provided established year
        }

        // Constructor with all parameters
        public University(String name, String location, int establishedYear, int studentCount) {
            this(name, location, establishedYear); // Call the constructor with name, location, and establishedYear parameters
            this.studentCount = studentCount; // Set the provided student count
        }

        // Getters and setters for instance variables (not shown for brevity)

    }
}

//In this code, the University class is defined with four constructors, each taking
// different sets of parameters to initialize the instance variables.
// The main method demonstrates how to create instances of the University class using
// these constructors and access their properties using getters.
