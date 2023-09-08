package Week12OOPInheritanceInJava.Class12point11CollectionsAsInstanceVariables;

import java.util.ArrayList;
import java.util.List;

public class AccountPt1 {
    public static void main(String[] args) {

    }
}


// Define a class named "Account"
class Account {
    // Declare a static final variable "bankName" representing the bank's name
    public static final String bankName = "XYZ Bank";

    // Declare a static variable "totalAccounts" to keep track of the total number of accounts
    public static int totalAccounts = 0;

    // Declare instance variables for an account
    public String accountNumber;
    public List<String> accountHolders;
    public List<Double> transactions;

    // Constructor to initialize an account with an account number and a list of account holders
    public Account(String accountNumber, List<String> accountHolders) {
        this.accountNumber = accountNumber;
        this.accountHolders = new ArrayList<>(accountHolders);
        this.transactions = new ArrayList<>();
        totalAccounts++; // Increment the totalAccounts count
    }

    // Method to get the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to get the list of account holders
    public List<String> getAccountHolders() {
        return accountHolders;
    }

    // Method to get the list of transactions
    public List<Double> getTransactions() {
        return transactions;
    }

    // Method to add a transaction amount to the list of transactions
    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    // Method to calculate and return the balance by summing up the transactions
    public double getBalance() {
        double balance = 0;
        for (double transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    // Method to check if an account holder exists in the accountHolders list
    public boolean hasAccountHolder(String accountHolder) {
        return accountHolders.contains(accountHolder);
    }
}
//In this code, a class named Account is defined. It has instance variables to store account information
// such as account number, account holders, and transactions.
// It also has instance methods to perform operations related to accounts, such as adding transactions,
// calculating balance, and checking for account holders.
// The class also includes static variables (bankName and totalAccounts) that are shared among
// all instances of the class. The bankName is a constant value representing the bank's name, and
// totalAccounts keeps track of the total number of accounts created.
// Overall, this class provides a basic structure to model and manage bank accounts.