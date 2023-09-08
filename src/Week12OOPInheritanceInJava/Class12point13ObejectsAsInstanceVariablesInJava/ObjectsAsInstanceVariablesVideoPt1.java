package Week12OOPInheritanceInJava.Class12point13ObejectsAsInstanceVariablesInJava;

import java.util.ArrayList;
import java.util.List;

public class ObjectsAsInstanceVariablesVideoPt1 {

    public static void main(String[] args) {

        //create address for customer 1,2,3
        Address c1Address = new Address("123 Main", "Patterson", 90002, "USA");
        Address c2Address = new Address("1125 Punta Gorda", "Santa Barbara", 93103, "USA");
        Address c3Address = new Address("1520 HollyWood Dr", "LA", 9002, "USA");


        //create banking account for john doe
        Account johnDoeChecking = new Account("12345678", 244444);
        Account johnDoeSavings = new Account("4554433", 988444);

        //store all john doe accounts in a list

        List<Account> johnDoeAccounts = new ArrayList<>();
        johnDoeAccounts.add(johnDoeChecking);
        johnDoeAccounts.add(johnDoeSavings);

        //create banking accounts for elon musk
        Account elonChecking = new Account("12345678", 244444);
        Account elonSavings = new Account("476599322", 2000);

        //store all Elon Musk accounts in a list
        List<Account> elonAccounts = new ArrayList<>();
        elonAccounts.add(elonChecking);
        elonAccounts.add(elonSavings);


        //create banking accoumt for ana

        Account anaChecking = new Account("126878", 50144455);
        Account anaSavings = new Account("807659221", 894140398);
        Account anaSavings2 = new Account("5659221", 121000392);

        //store all Jessica Alba accounts in a list
        List<Account> anaAccounts = new ArrayList<>();
        johnDoeAccounts.add(anaChecking);
        johnDoeAccounts.add(anaSavings);
        johnDoeAccounts.add(anaSavings2);

        //creating all customers
        Customer c1 = new Customer("John Doe", c1Address, johnDoeAccounts);
        Customer c2 = new Customer("Elon Musk", c2Address, elonAccounts);
        Customer c3 = new Customer("Ana Alba", c3Address, anaAccounts);

        //adding all customers to a list
        List<Customer> customersList = new ArrayList<>();
        customersList.add(c1);
        customersList.add(c2);
        customersList.add(c3);

        //creating one bank with list of customers, where each customer has a list of accounts
        Bank chaseBank = new Bank("Chase",customersList);
        printAllAccounts(chaseBank);
        double result = depositFunds(chaseBank, "Elon Musk", "476599322", 1000);
        System.out.println(result);
//        Bank chaseBank = new Bank("Chase", customersList);
//
//        printAllAccounts(chaseBank,customersList);
//        double result = depositFunds(chaseBank, "Elon Musk", "476599322", 1000);
//        System.out.println(result);
        // }
//        System.out.println(chaseBank.getName()); //Chase
//        List<Customer> cList = chaseBank.getCustomerList();
//        for (Customer obj : cList) {
//            if(obj.getName().equalsIgnoreCase("Elon Musk")) {
//                System.out.println(obj.getName()); //Chase, John Doe, Elon Musk, Ana Alba
//                System.out.println(obj.getAddress().getStreet()); // 1125 Punta Gorda
//                System.out.println(obj.getAddress().getCity()); // Santa Barbara
//                System.out.println(obj.getAddress().getZipcode()); // 93103
//                System.out.println(obj.getAddress().getCountry()); // USA
//
//            }
//        }
    }

    //create a method that will print out all accounts of all customers
//    public static void printAllAccounts(Bank bank) {
//        List<Customer> customerList = bank.getCustomerList();
//        for (Customer customerObj : customerList) {
//            System.out.println(customerObj.getName());
//           List<Account> accountList =  customerObj.getAccountsList();
//           for (Account accountObj : accountList) {
//               System.out.println("Account number: " + accountObj.getAccountNumber());
//               System.out.println("Balance: " + accountObj.getBalance());
//
//           }
//
//        }
//
//    }

    public static void printAllAccounts(Bank bank){
        List<Customer> customersList = bank.getCustomerList();
        for(Customer customer1Obj : customersList){
            System.out.println(customer1Obj.getName());
            List<Account> accountList = customer1Obj.getAccountsList();
            for(Account accountObj : accountList){
                System.out.println("Account Number: " + accountObj.getAccountNumber());
                System.out.println("Balance: " + accountObj.getBalance());
            }
        }
    }

    //create a method to deposit that takes 1. Customer name, 2. accountNum, 3. deposit amount
    //return the updated balance
    public static double depositFunds(Bank bank, String customerName, String accountNum, double amount) {
        List<Customer> customerList = bank.getCustomerList();

        for (Customer customerObj: customerList){
            if (customerObj.getName().equalsIgnoreCase(customerName)) {
                List<Account> accountList = customerObj.getAccountsList();
                for (Account accountObj : accountList) {
                    if ((accountObj.getAccountNumber().equalsIgnoreCase(accountNum))) {
                        accountObj.deposit(amount);
                        accountObj.getBalance();
                    }
                }
            }
        }

        return -1;

    }
}

//I want to be able to store information about Bank
/*
Bank {
   "name": "Chase";

   "customers": [{"John Doe"}, {"Elon"}, {"Ana"}]
   "customers": [{"name": "John Doe";
             "accounts": ["accountNum": 232323;
             "balance": 12343441;]

             "accounts": ["accountNum": 332323;
             "balance": 144445;]

             "accounts": ["accountNum": 567888;
             "balance": 99999;]

             //"savings": 23334;
   }

 */
/*
Customer {
"name" : "String";
"address":
}
Address {
"street": "string";
"city": "string";
"zipcode" : int;
"Country" : "string"
 */


class Customer {
    private String name;
    private Address address;
    private List<Account> accountsList;
    public Customer(String name, Address address, List<Account> accountsList) {
        this.name = name;
        this.address = address;
        this.accountsList = accountsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public  Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Account> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(List<Account> accountsList) {

        this.accountsList = accountsList;
    }
}





class Address {
    private String street;
    private String city;
    private int zipcode;
    private String country;

    public Address(String street, String city, int zipcode, String country) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}


class Bank {
    private String name;
    private List<Customer> customerList;

    public Bank(String name, List<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double depositAmount) {
        balance+= depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount>balance) {
            System.out.println("Insufficient funds");
            
        } else {
            balance-=withdrawAmount;
        }
    }
}