package Week12OOPInheritanceInJava.Class12point21SuperWithNoParanthesisKeywordInJava;

public class Personpt1 {
    public static void main(String[] args) {

    }
}
// Define a class named "Person"
class Person {
    // Public instance variables representing person attributes
    public String name;
    public int age;
    public double height;
    public double weight;

    // Constructor to initialize person attributes
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

// Define a class named "Student" that inherits from the "Person" class
class Student extends Person {
    // Additional instance variables specific to students
    public String studentId;
    public int gradeLevel;
    public double GPA;
    public String major;

    // Constructor to initialize student attributes
    public Student(String name, int age, double height, double weight, String studentId, int gradeLevel, double GPA, String major) {
        // Call the constructor of the parent class ("Person") to initialize common attributes
        super(name, age, height, weight);

        // Initialize student-specific attributes
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.major = major;
    }

    // Overloaded constructor for student with basic information
    public Student(String name, int age, double height, double weight) {
        super(name, age, height, weight);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0.0;
        this.major = "N/A";
    }

    // Overloaded constructor for student with limited information
    public Student(String name, int age, String studentId, int gradeLevel) {
        super(name, age, 0.0, 0.0);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = 0.0;
        this.major = "N/A";
    }

    // Overloaded constructor for student with minimal information
    public Student(String name, int age) {
        super(name, age, 0.0, 0.0);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0.0;
        this.major = "N/A";
    }

    // Default constructor for student with no information
    public Student() {
        super("N/A", 0, 0.0, 0.0);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0.0;
        this.major = "N/A";
    }
}

