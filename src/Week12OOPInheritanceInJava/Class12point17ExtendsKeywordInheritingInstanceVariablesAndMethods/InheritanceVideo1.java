package Week12OOPInheritanceInJava.Class12point17ExtendsKeywordInheritingInstanceVariablesAndMethods;

public class InheritanceVideo1 {

    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount();
//        account.balance= 10;
//        System.out.println(account.balance);

        account.setBalance(20);
        System.out.println(account.getBalance());
    }
}
//super class
class BankAccount {
    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
//sub-class
//sub class has to extend the parent class using extends keyword
//when a class extends from another class
//the sub-class inherits(takes) all public and default instance variables
//and public and default methods
class CheckingAccount extends BankAccount {


}
