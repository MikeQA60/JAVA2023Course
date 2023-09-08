package Week12OOPInheritanceInJava.Class12point18MoreInstanceVariablesAndMethodsToInherit;

//import Week12OOPInheritanceInJava.Class12point17ExtendsKeywordInheritingInstanceVariablesAndMethods.CheckingAccount;

public class BankAccountpt2 {

    public static void main(String[] args) {

      CheckingAccount account = new CheckingAccount();


        account.setBalance(20);
        System.out.println(account.getBalance());

        System.out.println(account.getAccountNumber());

        account.deposit(500);
        System.out.println(account.getBalance());

        account.withdraw(200);
        System.out.println(account.getBalance());
    }
}
//super class
class BankAccount {
    private double balance;
    private final long accountNumber = 0;
  //  public BankAccount


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public long getAccountNumber() {
        return  accountNumber;

    }

    public void withdraw(double amount) {
        balance-=amount;
    }

    public void deposit(double amount) {
        balance+=amount;
    }


}
//sub-class
//sub class has to extend the parent class using extends keyword
//when a class extends from another class
//the sub-class inherits(takes) all public and default instance variables
//and public and default methods
class CheckingAccount extends BankAccount {


}
