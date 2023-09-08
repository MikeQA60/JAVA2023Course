package Week12OOPInheritanceInJava.Class12point13ObejectsAsInstanceVariablesInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LibraryPt1 {
    public static void main(String[] args) {

    }
}
class Library {
    //
//Instance Variables:
    private Employee employee;    // (Employee): Represents an employee working at the library.
    private final String name;    // (String final): Represents the name of the library. Can't be less than 4 characters.
    private Map<String, String> openHours = new HashMap<>(7);  //(Map<String, String>): Represents open hours for all days. Format-> {"Monday":"7am-9pm"}. Should contain exactly 7 elements.
    private Set<Floor> floors;   //(Set of Floor): Represents the unique collection of floors in the building. Should contain at least 1 element.

//Constructors:
//Library(String name, Map openHours): Initializes the Library object with the provided name and openHours.
//

    public Library(String name, Map<String, String> openHours) {

        this.name = name;
        this.openHours = openHours;
    }


//Instance Method:
//Getters and Setters.


    public String getName() {
        return name;
    }
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        if (employee.getAge() <18 || employee.getAge()>75){
            System.out.println("Error: Employee age should be between 18 and 75. ");
        }else {
            this.employee = employee;
        }
    }
    public Map<String, String> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(Map<String, String> openHours) {
        this.openHours = openHours;
    }

    public Set<Floor> getFloors() {
        return floors;
    }
    public void setFloors(Set<Floor> floors) {
        this.floors = floors;
    }
}
class Employee {

    //Instance Variables:
    private String title;   // (String): Represents the job title of the employee. Can't be less than 5 characters.
    private int age;   // (int): Represents the age of the employee. Should be between 18 and 75 inclusively.
    private double salary;   // (double): Represents the salary of the employee. Should be between 18000 and 57000 inclusively.
    private Floor floor;  // (Floor): Represents the floor where the employee is assigned.

//Constructors:
//Employee(String title, int age, double salary, Floor floor): Initializes the Employee object with the provided title, age, salary, and floor.

    public Employee(String title, int age, double salary, Floor floor) throws IllegalArgumentException{
        this.title = title;
        if(age <18) { throw new IllegalArgumentException("Employee age should be between 18 and 75.");}
        this.age = age;
        this.salary = salary;
        this.floor = floor;
    }
//Instance Methods:
//Getters and Setters.


    public void setAge(int age) {
        if(age<18 || age>75){
            System.out.println("Error: Employee age should be between 18 and 75.");
        }else {
            this.age = age;
        }
    }

    public void setSalary(double salary) {
        if(salary<18000 || salary>57000){
            System.out.println("Error: Employee salary should be between $18,000 and $57,000.");
        }else{
            this.salary = salary;}
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Floor getFloor() {
        return floor;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
class Floor {
    //Instance Variables:
    private int numberOfRooms;  // (int): Represents the number of rooms on the floor. Can't be negative and more than 20.
    private String floorName;   // (String): Represents the name of the floor.
    private boolean isBusy;   // (boolean): Indicates whether the floor is busy or not. Default false.

//Constructors:
//Floor(int numberOfRooms, String floorName, boolean isBusy): Initializes the Floor object with the provided number of rooms, floor name, and busy status.

    public Floor(int numberOfRooms, String floorName, boolean isBusy) {
        this.numberOfRooms = numberOfRooms;
        this.floorName = floorName;
        this.isBusy = isBusy;
    }


//Instance Methods:
//Getters and Setters.


    public void setNumberOfRooms(int numberOfRooms) {
        if(numberOfRooms<0 || numberOfRooms>20){
            System.out.println("Error: Number of rooms on the floor should be between 0 and 20.");
        }else {
            this.numberOfRooms = numberOfRooms;
        }
    }

    public String getFloorName() {
        return floorName;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }
}