package Week12OOPInheritanceInJava.Class12point4ConstructorChainingInJava;

public class ConstructorChaining {

    public static void main(String[] args) {
        //create object
        StudentCheckingAccount sc = new StudentCheckingAccount("Elon Musk", 100000.00,
                "12345633221", 3232322);

        StudentCheckingAccount sc2 = new StudentCheckingAccount("Bill Gates",
                "1245223311", 24334565);

        System.out.println(sc2.studentName);
        System.out.println(sc2.balance);

        StudentCheckingAccount sc3 = new StudentCheckingAccount("Beyonce", "323445454545");

        System.out.println(sc3.studentName);
        System.out.println(sc3.routingNum);

        //Beyonce
        //123271978
    }
}

class StudentCheckingAccount {

    public String studentName;
    public double balance;
    public String accountNum;
    public int routingNum;

    //contructor
    public StudentCheckingAccount(String studentName, double balance,
                                  String accountNum, int routingNum) {

        this.studentName = studentName;
        this.balance = balance;
        this.accountNum = accountNum;
        this.routingNum = routingNum;

    }

    //constructor
    //in programming having duplicate code is a bad practice
    //we should avoid it
//
//    public StudentCheckingAccount(String studentName, String accountNum, int routingNum) {
//        this.studentName = studentName;
//        this.accountNum = accountNum;
//        this.routingNum = routingNum;


      //this() ---> this with paranthesis
    //what is the difference between this and this() keywords in java?
    //this () --> helps you access and use the other constructors in this class
    //this() --> enable you to use constructor chaining
    //constructor chaining is when you are calling one constructor from another
    public StudentCheckingAccount(String studentName, String accountNum, int routingNum) {
      //  this("John Doe",  -1, "00000000", 1233443444);
        // John Doe
        //-1.0

        this(studentName, 0.0, accountNum, routingNum);


    }

    //123271978 - default routing num. you can get from ba, requirements or business requried
    public StudentCheckingAccount(String studentName, String accountNum) {
        this(studentName, accountNum, 123271978);


    }

}
