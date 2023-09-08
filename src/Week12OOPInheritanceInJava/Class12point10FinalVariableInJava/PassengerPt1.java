package Week12OOPInheritanceInJava.Class12point10FinalVariableInJava;

public class PassengerPt1 {
    public static void main(String[] args) {

    }
}

// Define a class named "Passenger"
class Passenger {
    // Declare constant variables for maximum capacity and passenger type
    public static final int MAX_CAPACITY = 200;
    public static final String PASSENGER_TYPE = "Regular";

    // Declare private instance variables for passenger details
    private int passengerId;
    private String passengerName;
    private int age;
    private boolean isFrequentFlyer;

    // Declare static variables for tracking total passengers and airline name
    private static int totalPassengers;
    private static String airlineName;

    // Constructor to initialize passenger details
    public Passenger(int passengerId, String passengerName, int age, boolean isFrequentFlyer) {
        // Constructor declaration that takes parameters:
        // passengerId - Unique ID of the passenger
        // passengerName - Name of the passenger
        // age - Age of the passenger
        // isFrequentFlyer - Indicates if the passenger is a frequent flyer

        // Assign the value of passengerId parameter to the passengerId instance variable.
        this.passengerId = passengerId;


        // Assign the value of passengerName parameter to the passengerName instance variable.
        this.passengerName = passengerName;


        // Assign the value of age parameter to the age instance variable.
        this.age = age;

        // Assign the value of isFrequentFlyer parameter to the isFrequentFlyer instance variable.
        this.isFrequentFlyer = isFrequentFlyer;


        totalPassengers++;
        // Increment the totalPassengers static variable by 1.
        // This line counts the total number of passengers created using this constructor.


    // Increment the totalPassengers count
    }

    // Method to print the passenger type (constant)
    public void printPassengerType() {
        System.out.println(Passenger.PASSENGER_TYPE); // Accessing the constant using the class name
    }

    // Method to change the passenger's name
    public void changePassengerName(String newName) {
        passengerName = newName;
    }

    // Method to get the total number of passengers (static)
    public static int getTotalPassengers() {
        return totalPassengers;
    }

    // Method to get the airline name (static)
    public static String getAirlineName() {
        return airlineName;
    }

    // Method to set the airline name (static)
    public static String setAirlineName(String airlineName) {
        return airlineName = airlineName;
    }

    // Method to display passenger details
    public void displayPassengerDetails() {
        System.out.println("Passenger Details:\nPassenger ID: " + passengerId + "\nName: " + passengerName +
                "\nAge: " + age + "\nFrequent Flyer: " + isFrequentFlyer);
    }
}
//
//In this code, the Passenger class is defined. It includes instance variables to store passenger
// information and static variables to maintain common data across all instances of the class.
// The class also contains methods to perform various operations related to passengers, such as printing passenger type,
// changing passenger name, and displaying passenger details.
//
//The code demonstrates the use of instance variables, static variables, constant variables, constructors,
// instance methods, and static methods in a class. It models a basic structure to represent and manage passenger information.
//







