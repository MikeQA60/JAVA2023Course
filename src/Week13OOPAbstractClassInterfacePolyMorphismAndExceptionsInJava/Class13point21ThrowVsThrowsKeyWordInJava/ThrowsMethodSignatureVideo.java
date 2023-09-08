package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point21ThrowVsThrowsKeyWordInJava;

public class ThrowsMethodSignatureVideo {
    public static void main(String[] args) {

    }

    //throws keyword is used to declare exceptions in the
    //method signature
    //which means the method has a block of code
    // that throws an exception

    //it's like a warning to the methods that are going to use this method
    public static void withdraw(int amount) throws Exception {

        int balance = 100;

        if (amount < balance) {

            //throw keyword is to actually throws an exception
            //it stops
            throw new Exception("Insufficient funds");


        }
    }

    //when you are creating a logic declare exceptions in the
    //method signature


    //and when you are applying the method logic that try catch
    public static void transfer() {
        try {
            withdraw(50);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}