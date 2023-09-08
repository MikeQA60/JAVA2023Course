package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point5MethodOverRidingVsOverloadingInJava;

public class Video {
    public static void main(String[] args) {

    }
}

// Defining the base class "Employee"
class Employee {
    // Public instance variables for name and salary
    public String name;
    public double salary;

    // Constructor for initializing name and salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate and return the base salary of the employee
    public double calculateSalary() {
        return salary;
    }

    // Method to calculate and return the salary with an additional bonus
    public double calculateSalary(double bonus) {
        return salary + bonus;
    }
}

// Defining a subclass "Manager" that inherits from "Employee"
class Manager extends Employee {
    // Constructor for initializing name and salary using the parent constructor
    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Overriding the "calculateSalary" method to include a bonus calculation
    @Override
    public double calculateSalary() {
        double bonus = 0.1 * salary; // 10% bonus of the base salary
        return super.calculateSalary(bonus);
    }
}

// Defining another subclass "Salesperson" that also inherits from "Employee"
class Salesperson extends Employee {
    // Private instance variable for the sales amount made by the salesperson
    private double salesAmount;

    // Constructor for initializing name, salary, and salesAmount
    public Salesperson(String name, double salary, double salesAmount) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }

    // Overriding the "calculateSalary" method to include a commission calculation
    @Override
    public double calculateSalary() {
        double commission = 0.05 * salesAmount; // 5% commission on sales amount
        return super.calculateSalary(commission);
    }
}
 //   This code demonstrates object-oriented programming concepts in Java. It defines a base class
//   Employee with instance variables, constructors, and methods. Then, two subclasses, Manager and Salesperson,
//   nherit from the Employee class, override the calculateSalary method, and include their specific salary calculation
//   logic based on the provided descriptions. Each class is encapsulated to handle its own data and behavior,
//   contributing to the reusability and maintainability of the code.