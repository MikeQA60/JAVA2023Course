package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point20FinallyBlockInJava;

import Week5NestedIf.Class5point15.Ex;

public class FinallyBlockVideo {
    public static void main(String[] args) {
        method1();

    }

    //finally is a block of code try catch pair that is executed regardless of the result of
    //try and catch
    //it's used for cleaning up and quitting resources.
    public static void method1() {
        try {
            //code that may throw an exception
            //...

            System.out.println("Try");
            //   Class.forName("dsfggsgs");
        } catch (Exception e) {
            //Exception Handling
            //...
            System.out.println(e);

        } finally {
            //cleanup operations
            //...
            System.out.println("Cleaning up");
        }
    }
}
    //what is the diffrence between final and finally
    //they are not related at all
    //final can be used with variables, methods and classes
    //if the var is final that it can only be initiazliezed once
    //if the method is final it cannot be overriden
    //if the class is final it can be extended

    //and fianlly
 //finally is a block of code try catch pair that is executed regardless of the result of
//try and catch
//it's used for cleaning up and quitting resources.
