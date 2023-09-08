package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point2MethodOverridingInPractice;

public class BankAccountpt4 {
    public static void main(String[] args) {


   CheckingAccount account = new CheckingAccount(1244345555l, 30.00);
//        account.balance= 10;
//        System.out.println(account.balance);

        account.setBalance(20);
        System.out.println(account.getBalance());
        System.out.println(account.getAccountNumber());

        account.deposit(500);
        System.out.println(account.getBalance());

        account.withdraw(200);
        System.out.println(account.getBalance());

       CheckingAccount ac2 = new CheckingAccount(129.00, 6444555l,15.00);
        System.out.println(ac2.getBalance());
        System.out.println(ac2.getAccountNumber());


        System.out.println("=========================================");

        System.out.println(account.getMonthlyFee());
        account.applyMonthlyFee();
        System.out.println(account.getBalance());

        System.out.println(ac2.getMonthlyFee());
        ac2.applyMonthlyFee();
        System.out.println(ac2.getBalance());


        System.out.println("===============================================");
        CheckingAccount ac3 = new CheckingAccount(5000.00, 256434343l, 20.00);
    ac3.withdraw(900);
        System.out.println(ac3.getBalance());

        ac3.withdraw(400);
        System.out.println(ac3.getBalance());

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
    // private static  double monthlyFee;

    private double monthlyFee;
    private double dailyWithdrawlAmount;


    public CheckingAccount(long accountNum, double monthlyFee) {
        super(accountNum);
        this.monthlyFee = monthlyFee;

    }

    public CheckingAccount(double balance, long accountNum, double monthlyFee) {
        super(balance, accountNum);
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void applyMonthlyFee(){
        withdraw(monthlyFee);
    }

    //the users can only withdraw $1000 per day
    @Override
    public void withdraw(double amount) {
        //0 + 1200
        if(dailyWithdrawlAmount + amount > 1000){
            System.out.println("you reached your daily limit you can only withdraw " + (1000- dailyWithdrawlAmount));


        }
        else {
            setBalance(getBalance()-amount);
        }
        dailyWithdrawlAmount+=amount;

    }
}

