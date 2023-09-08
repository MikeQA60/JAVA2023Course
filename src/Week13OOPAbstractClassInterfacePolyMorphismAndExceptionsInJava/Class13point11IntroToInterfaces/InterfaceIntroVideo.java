package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point11IntroToInterfaces;

public class InterfaceIntroVideo {

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        //List list = new ArrayList();
        //Map map = new HashMap();



        shape.calculateArea();
    }
}

interface Shape {

    //all variables in an interface are constants - public static final
    public static final int i = 10;
    //by default all methods in the interface are public and static abstract
    void calculateArea();
}

//we use implements keyword to inherit interfaces
//when we implement an interface the first concrete class
//must override all abstract methods from the interfaces

class  Rectangle  implements  Shape {
    @Override
    public void calculateArea() {
        System.out.println(1+1);

    }

}

//when do you use an Abstract class vs Interface?
//use abstract when you want to create a parent class with common instance variables
//and some instance methods plus some abstract methods

//use interface when you only want to create abstract methods