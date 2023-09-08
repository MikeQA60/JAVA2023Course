package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point17TryCatchPractice;

public class TryCatchPracVideo {
    public static void main(String[] args) {
        method1();
        System.out.println("Line 6");
    }

    public static void method1() {
        //catch unchecked exception

        //whenever try executes successfully
        //catch block is skipped
        try {
            System.out.println("Beginning of the try");
            double result = 10 / 1;
            System.out.println("More stuff after trying divide by 0");
            System.out.println("More stuff after trying divide by 0");
            System.out.println("More stuff after trying divide by 0");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: / by zero occured but handled");
            System.out.println("More catch stuff");
        }
    }
}
