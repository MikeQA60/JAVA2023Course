package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point18PrintOutExceptionMessageAndPrintStackTraceInJava;

public class CatchExceptionMessages {
    public static void main(String[] args) {
        method1();
        System.out.println("Im still alive");
    }

    public static void method1() {
        try {
            System.out.println("Started Try");
            int[] nums = new int[2];
            int num = nums[5];
            System.out.println("Everything went well and finished try");


            //what do you put in catch clause?
        } catch (ArrayIndexOutOfBoundsException e) {
           // first print out exception message
            System.out.println(e);

            //then print out stack trace to be able to troubleshoot where
            //the exception were thrown in my big framework
            e.printStackTrace();

        }
    }
}
