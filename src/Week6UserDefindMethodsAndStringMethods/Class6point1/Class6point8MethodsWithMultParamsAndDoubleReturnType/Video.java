package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point8MethodsWithMultParamsAndDoubleReturnType;

public class Video {

    public static void main(String[] args) {


   //save in a double     //call method
        double var = substract(100,50);
        System.out.println(var);
    }


    //crete a method that takes 2 double values and return the difference between
    //the first value and second value
    public static double substract (double num1, double num2) {
        return num1 - num2;

    }
}
