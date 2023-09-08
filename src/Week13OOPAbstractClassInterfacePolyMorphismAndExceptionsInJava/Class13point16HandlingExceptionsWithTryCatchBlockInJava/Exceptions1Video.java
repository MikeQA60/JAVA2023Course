package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point16HandlingExceptionsWithTryCatchBlockInJava;

public class Exceptions1Video {

    public static void main(String[] args) {
        example();
        System.out.println("Hello WeDevx");
    }

    public static void example() {
//        int[] nums = new int[3];
//       int num = nums[5];


        //checked exceptions need to be handled
        //in order for code to compile


        //how to handle checked exceptions?
        //1. handle with try catch block


        //checked exceptions mean that you want to
        //use methods that are known to be error prone
        //developer make a lot of misspelling mistakes with it
        try {
            //you write the logic
            // which throws a checked
            //exception


            //when the method actually fails - the code will jump to catch block by skipping
            //the remaining code in the try block
            Class.forName("com.wedex-java.class19.ClassName");
            System.out.println("Line 25");

            //catch block comes with parenthesis
            //in which you need to put the exception
            //the block of codd throws
        } catch (ClassNotFoundException e) {
            //everything in the catch block is executed
            System.out.println("Some things went wrong in the try block");

        }



    }
}