package Week12OOPInheritanceInJava.Class12point10FinalVariableInJava;

public class FinalKeyWordVideo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.calculateCircumference());

    }
}

class Circle {

    //final keyword can be used with variables, classes and methods.
    //final keyword with variables allows the value of the variable to be assigned
    //only once.
    private final double PI =  3.14159;
    private double radius = 5.0;

    public Circle(double radius) {
        this.radius = radius;
       // PI = 12.2;

    }

    public double calculateCircumference(){
        return 2 * PI * radius;

    }

}

