package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point6MethodsWMultParam;

public class FindAreaOfCircle {
    public static void main(String[] args) {

        double var = calculateArea(3.14,5.0);
        System.out.println(var);
    }
    public static double calculateArea(double pi, double radius) {
        return pi*radius;
        //  System.out.println(pi*radius*radius);
    }
}
