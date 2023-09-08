package Week12OOPInheritanceInJava.Class12point11CollectionsAsInstanceVariables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Studentpt1 {
    public static void main(String[] args) {

    }
}

// Define a class named Students
class Students {
    // Declare a static List variable to store student names
    private static List<String> studentList = new ArrayList<>();

    // Declare a Map variable to store student marks
    private Map<String, Integer> marks = new HashMap<>();

    // Declare a final variable to store year of birth
    private final String yearOfBirth;

    // Constructor to initialize the yearOfBirth variable
    public Students(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // Static method to get the studentList
    public static List<String> getStudentList() {
        return studentList;
    }

    // Method to get the marks Map
    public Map<String, Integer> getMarks() {
        return marks;
    }

    // Method to get the yearOfBirth
    public String getYearOfBirth() {
        return yearOfBirth;
    }

    // Method to add a student to the studentList
    public void addStudent(String name) {
        studentList.add(name);
    }

    // Method to add marks for a subject
    public void addMarks(String subject, int marks) {
        // Check if the marks are within the valid range
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        } else {
            // If marks are valid, add them to the marks Map
            this.marks.put(subject, marks);
        }
    }
}
  //  This code defines the Students class with instance variables, constructor, and methods as specified in the description.
//  It allows you to store student names, marks for different subjects, and the year of birth.
//  The provided methods enable you to retrieve the student list, marks, and year of birth, as well as add students and marks.




