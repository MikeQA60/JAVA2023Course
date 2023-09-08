package Week12OOPInheritanceInJava.Class12point11CollectionsAsInstanceVariables;

import java.util.ArrayList;
import java.util.List;

 //Define a class named CollectionsAsInstanceVariablesClass
public class CollectionsAsInstanceVariablesClass {


     // Main method to demonstrate the usage of the Employee class
    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee emp1 = new Employee("Elon", 52, "Executive", 1000000.00);

        // Print the projects associated with emp1 (initially empty)
        System.out.println(emp1.getProjects()); //[]

        // Add a project to emp1
        emp1.addProject("Tesla");

        // Print the projects associated with emp1 (now contains "Tesla")
        System.out.println(emp1.getProjects()); //[Tesla]

        // Add a project to emp1
        emp1.addProject("SpaceX");

        // Print the projects associated with emp1 (now contains "Tesla" and "SpaceX")

        System.out.println(emp1.getProjects()); //[Tesla, SpaceX]

        emp1.addProject("BoringCompany");
        emp1.addProject("Neuralink");
        emp1.addProject("Twitter");

        // Print the projects associated with emp1 (now contains multiple projects)
        System.out.println(emp1.getProjects()); //[Tesla, SpaceX, BoringCompany, Neuralink, Twitter]

        //now a single variable emp1 --> stores the following info
        //Employee
// name: "Elon"
//age: 52
//department: "Executive"
//salary: 1000000;
//projects: [Tesla, SpaceX, BoringCompany, Neuralink, Twitter]


    }
}




class Employee {
    //instance variable to store employee information
    private String name;
    private int age;
    private String department;
    private double salary;
    private List<String> projects = new ArrayList<>();

    //constructor to initialize employee information
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Overloaded constructor to include projects along with other information
    public Employee(String name, int age, String department, double salary, List<String> projects) {
//        this.name = name;
//        this.age = age;
//        this.department = department;
//        this.salary = salary;

        // Call the previous constructor to set common information
        this(name, age, department, salary);
        // Assign the projects list
        this.projects = projects;
    }

    //methods

    // Getter and setter methods for employee information
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to get the list of projects associated with the employee
    public List<String> getProjects(){
        return projects;
    }
    // Method to add a new project to the employee's list
    public void addProject(String projectName) {
        projects.add(projectName);
    }
}
