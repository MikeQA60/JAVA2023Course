package Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfObjectsVideo {
    public static void main(String[] args) {

        List<BankingAccount> allAccountList = new ArrayList<>();

        //banking account objects

        BankingAccount ba1 = new BankingAccount("Chase", 245500);
        BankingAccount ba2 = new BankingAccount("BOA", 124544700);
        BankingAccount ba3 = new BankingAccount("US Bank", 345780);

        allAccountList.add(ba1); //[Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava.BankingAccount@1540e19d,
        allAccountList.add(ba2); // Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava.BankingAccount@677327b6]
        allAccountList.add(ba3); //Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava.BankingAccount@14ae5a5]


        //[ba1]
        //

        System.out.println(allAccountList); //[Week12OOPInheritanceInJava.Class12point122CollectionOfCustomObjectsInJava.BankingAccount@1540e19d]

        for (BankingAccount obj : allAccountList) {
            if (obj.getName().equalsIgnoreCase("chase")) {
                System.out.println(obj.getName()); // Chase, BOA, US Bank or just chase


            }
            }

        }
    }

//no classes with duplicate names withing the same package
//POJO - plain old java object -- just stores information

    class BankingAccount {

        private String name;
        private double balance;

        public BankingAccount(String name, double balance) {
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

