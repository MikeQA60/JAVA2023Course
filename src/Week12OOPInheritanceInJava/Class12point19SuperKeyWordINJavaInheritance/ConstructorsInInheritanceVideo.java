package Week12OOPInheritanceInJava.Class12point19SuperKeyWordINJavaInheritance;

public class ConstructorsInInheritanceVideo {

    public static void main(String[] args) {

        SubClass obj = new SubClass();
        SubClass obj2 = new SubClass(2, "Hey");
        SubClass obj3 = new SubClass( "Hey");

    }
}

//1. every class has implicit default constructor with no arguments
class Superclass {
    //protected
    public int num;

    public Superclass() {
        System.out.println("Default constructor from parent class");

    }

    public Superclass(int a, String b) {
        System.out.println("two param constructor from parent class" + a + " " + b);

    }
}

//1. the first statement in a constructor must be
// a call to a parent constructor


//2. this() --> is used to call other constructors
//2. Super() --> is a way to call parent constructors

//3. when you don't have a default constructor in the parent class
//you must call a constructor with parameters explicitly.
class SubClass extends Superclass {

    //default constructors have an implict call to
    //defaul constructor of a parent clas
    public SubClass() {
        System.out.println("Default constructor from child class");
        super.num = 1000;
    }

    public SubClass(int a, String b) {

        super.num = 1000;
    }

    public SubClass(String b) {
        super(2, b);
        System.out.println("two param constructor from child class" + b);
    }
}

//super keyword with no param --> is used to access accessible instance variable from a parent class
//inside child class