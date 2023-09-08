package Week12OOPInheritanceInJava.Class12point20SuperKeyWordPractice;

public class Inheritancept2 {

    public static void main(String[] args) {

       CheckingAccount account = new CheckingAccount(1244345555l);
//        account.balance= 10;
//        System.out.println(account.balance);

        account.setBalance(20);
        System.out.println(account.getBalance());
        System.out.println(account.getAccountNumber());

        account.deposit(500);
        System.out.println(account.getBalance());

        account.withdraw(200);
        System.out.println(account.getBalance());

        CheckingAccount ac2 = new CheckingAccount(129.00, 6444555l);
        System.out.println(ac2.getBalance());
        System.out.println(ac2.getAccountNumber());
    }
}
//super class
class BankAccount {
    private double balance;
    private final long accountNumber;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(double balance, long accountNumber) {
       this(accountNumber);
        this.balance = balance;

    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void withdraw(double amount) {
        balance-=amount;

    }

    public void deposit(double amount) {
        balance +=amount;
    }
}
//sub-class
//sub class has to extend the parent class using extends keyword
//when a class extends from another class
//the sub-class inherits(takes) all public and default instance variables
//and public and default methods
class CheckingAccount extends BankAccount {
    public CheckingAccount(long accountNum) {
        super(accountNum);

    }

    public CheckingAccount(double balance, long accountNum) {
        super(balance, accountNum);
    }
}

