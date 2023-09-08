package Week12OOPInheritanceInJava.Class12point1ConstructorWithMultipleParamsInJava;

public class SavingsAccountVideo {

    public long accountNum;
    public String accountHolderName;
    public double balance;
}

    class Main3 {
        public static void main(String[] args) {
            SavingsAccountVideo var = new SavingsAccountVideo();
            var.accountNum = 1234556666l;
            var.accountHolderName = "John Doe";
            var.balance = 278000.00;

            System.out.println(var.accountNum);
            System.out.println(var.accountHolderName);
            System.out.println(var.balance);
            //1234556666
            //John Doe
            //278000.0
        }
    }
