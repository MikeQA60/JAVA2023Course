package Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava;

//in Collection class create a static method called calculateTotalBalanceOfAllAccount
//that takes a list of BankingAccounts as a param
//and it sums up balance of every account
//and return the total balance of all account

import java.util.ArrayList;
import java.util.List;

//call the method in the main method and pass the allAccountsList list and print out the result
public class CollectionOfObjectsPt2 {
    public static void main(String[] args) {

        List<BankingAccount1> allAccountList = new ArrayList<>();

        //banking account objects

        BankingAccount1 ba1 = new BankingAccount1("Chase", 245500);
        BankingAccount1 ba2 = new BankingAccount1("BOA", 124700);
        BankingAccount1 ba3 = new BankingAccount1("US Bank", 345780);

        allAccountList.add(ba1); //[Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava.BankingAccount@1540e19d,
        allAccountList.add(ba2); // Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava.BankingAccount@677327b6]
        allAccountList.add(ba3); //Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava.BankingAccount@14ae5a5]


        //[ba1]
        //

        System.out.println(allAccountList); //[Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava.BankingAccount@1540e19d]

        for (BankingAccount1 obj : allAccountList) {
            if (obj.getName().equalsIgnoreCase("chase")) {
                System.out.println(obj.getName()); // Chase, BOA, US Bank or just chase


            }
        }

        double result = calculateTotalBalanceOfAllAccounts(allAccountList);
        System.out.println(result); // 715980.0

    }

    public static double calculateTotalBalanceOfAllAccounts(List<BankingAccount1> balist) {

        double sum = 0;
        for (BankingAccount1 obj : balist) {
            obj.getBalance();
            sum+=obj.getBalance();

        }

        return  sum;
    }
}

//no classes with duplicate names withing the same package
//POJO - plain old java object -- just stores information

class BankingAccount1 {

    private String name;
    private double balance;

    public BankingAccount1(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

