package Week12OOPInheritanceInJava.Class12point5EncapsulationGetterMethodInJava;

public class EncapsulationVideo {
    public static void main(String[] args) {

        ChaseCheckingAccount c1 = new ChaseCheckingAccount("Askar", "1213223234",
                123434343, 100000.00);
//
//        System.out.println(c1.accountNum); //1213223234
//
//        c1.accountNum = "0000000000";
//        System.out.println(c1.accountNum); //0000000000

        System.out.println(c1.getAccountNum()); // 1213223234
        System.out.println(c1.getRoutingNum()); //123434343
        System.out.println(c1.getName());  // 123434343
        System.out.println(c1.getBalance()); //123434343


       // c1.setAccountNum("00000000");
        //System.out.println(c1.getAccountNum()); //00000000

        c1.setBalance(200000.00);//
        System.out.println(c1.getBalance()); // 200000.0

        c1.setBalance(-100.00);
        System.out.println(c1.getBalance()); // 100.0

        c1.setRoutingNum(123271978); //123271978 //343495455
        System.out.println(c1.getRoutingNum()); // Negative values can not be assigned to the balace`

    }
}


class ChaseCheckingAccount {


    private String name;
    //making instance variables private make sure you can not access those variables to read or modify it's
    //values outside of the current class
    private String accountNum;
    private int routingNum;
    private double balance;

    public ChaseCheckingAccount(String name, String accountNum, int routingNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.balance = balance;


    }
    //Getter and Setter methods
    //getter method helps you read the values of private instance variables
    //setter method helps you update the value of your private instance variable
    //each instance variable should have a getter and a setter most of the times
    //getter and setter methods must always be public

    //GETTER
    //add get
    public String getAccountNum() {
        return accountNum;

    }

    public int getRoutingNum() {
        return routingNum;

    }

    public String getName() {
        return name;

    }


    public double getBalance() {
        return balance;

    }
    //SETTER  - helps you update the instance variables
    //settter methods must be void
    //must have 1 param with the same data type as the instance variable
    //the biggest benefit of setter method is thtat
    //we can set logics that willl help avoid assign unwanted values
    //to our instance variables based on the business requirements

//    public void setAccountNum(String accountNum) {
//        this.accountNum = accountNum;
//    }
//}

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {

            System.out.println("Negative values can not be assigned to the balace");
        }
    }


    public void setRoutingNum(int routingNum) {
        if (routingNum == 123271978 || routingNum == 01510017) {
            this.routingNum = routingNum;
        }

        else {

            System.out.println("Routing number is outside of our bank");
        }
    }
}

