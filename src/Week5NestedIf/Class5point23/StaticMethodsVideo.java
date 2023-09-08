package Week5NestedIf.Class5point23;

public class StaticMethodsVideo {
    public static void main(String[] args) {


        //if the method you are calling is located in the same class
        //and if you are calling the method inside a static method
        //all you have to do is call the name of a new method
        printSomething();
    }

    //static
    //what is static
    //in order to call a static you need to create an object of a class


    //static methods do not belong to any object it belongs to a class
    //instance methods belong to objects

    public static void printSomething() {
        System.out.println("I'm a rockstar building my future with wedevx");

    }
}
