package Week12OOPInheritanceInJava.Class12point1ConstructorWithMultipleParamsInJava;

public class Video1 {

        public long accountNum;
        public String accountHolderName;
        public double balance;



        //constructor with params are used to initialize the values of instance variables
        public Video1(long num, String name,double b) {
//            System.out.println(num);
//            System.out.println(name);
//            System.out.println(b);


            //this constructor doesnt print out
            accountNum = num;
            accountHolderName = name;
            balance = b;
        }

        public Video1(){
    }
}

    class Main4 {
        public static void main(String[] args) {

            //cant use default constructor with the 3 params above
            Video1 var = new Video1();
            var.accountNum = 1234556666l;
            var.accountHolderName = "John Doe";
            var.balance = 278000.00;

            System.out.println(var.accountNum);
            System.out.println(var.accountHolderName);
            System.out.println(var.balance);


            Video1 var2 = new Video1(44466621l, "Elon Musk", 25555666.00);
            //44466621
            //Elon Musk
           // 2.5555666E7

            System.out.println(var2.accountNum);
            System.out.println(var2.accountHolderName);
            System.out.println(var2.balance);
        }
    }