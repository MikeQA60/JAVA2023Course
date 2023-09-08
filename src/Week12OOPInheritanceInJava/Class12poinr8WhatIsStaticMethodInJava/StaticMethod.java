package Week12OOPInheritanceInJava.Class12poinr8WhatIsStaticMethodInJava;

public class StaticMethod {
    public static void main(String[] args) {


    // Create a BankAccount object named 'ba' with account number "ABC123"
 BankAccount ba = new BankAccount("ABC123");


    // Deposit 300 and then 200 into 'ba'
        ba.deposit(300);
        ba.deposit(200);

    // Print account number and balance of 'ba'
        System.out.println(ba.getAccountNumber()); //ABC123
        System.out.println(ba.getBalance()); // Output: 300.0 or 500.0 (depending on deposit sequence)

// Withdraw 150 from 'ba'
        ba.withdraw(150);
        System.out.println(ba.getBalance());  // Output: 350.0

    // Create another BankAccount object named 'ba2' with account number "DEF555"
BankAccount ba2 = new BankAccount("DEF555");

    // Deposit a large amount into 'ba2'
        ba2.deposit(5000000); //5000000.0
        System.out.println(ba2.getAccountNumber()); //DEF555
        System.out.println(ba2.getBalance()); //0.0
    // Withdraw 10000 from 'ba2'
        ba2.withdraw(10000);
        System.out.println(ba2.getBalance()); //4990000.0

        //added in class 12.8
        // Calculate the interest using the calculateInterest method from the BankAccount class
// The method takes principal, rate, and years as arguments
// The result is stored in the "interest" variable
      double interest =  BankAccount.calculateInterest(10000, 0.05, 2);
        // Print the calculated interest value
        System.out.println(interest); //1000.0

  }
}

// Define the BankAccount class
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor to initialize instance variables
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;

    }

    //instance methods are the methods that belong to a specific instance
    //of a class. it means it belongs to an object
    //instance methods are declared without the static keyword
    //instance methods can access instance variables  and manipulate instance variables
    //to access(invoke, call) the instance methods
    //we frist have to create an object


    // Instance methods of the BankAccount class

    // Getter method for the account number
    public String getAccountNumber() {

        return accountNumber;
    }

    // Deposit method to increase balance
    public void deposit(double amount){
        //update and depoist
        balance+=amount;
    }
    // Deposit method to increase balance
    public double getBalance() {

        return balance;
    }

    // Withdraw method to decrease balance
    public void withdraw(double amount) {
        balance-=amount;
    }

    //static method
    //added in class 12.8

    // Define a public static method named "calculateInterest"
// This method calculates the interest based on provided parameters
    public static double calculateInterest(double principal, double rate, int years) {
        // Calculate the interest by multiplying principal, rate, and years
        double interest = principal * rate * years;

        // Return the calculated interest value
        return interest;
    }
}
//In summary, this code demonstrates the usage of instance methods and instance variables in Java.
// It defines a BankAccount class with methods to deposit, withdraw, and get balance.
// The main class InstanceMethodsVsStaticMethodsVideo creates instances of the BankAccount class,
// performs de

