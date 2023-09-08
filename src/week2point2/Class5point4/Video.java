package week2point2.Class5point4;

//example 1

/*
Class 5.4 - Arithmetic Operators Modulo
Learn about the modulo (%) operator in Java, its use for finding the remainder in division operations,
its precedence, associativity, and how to use it in expressions, in this comprehensive Modulo Arithmetic Operator tutorial.


 */
public class Video {
    public static void main(String[] args) {
       //prim datatype
        double num =  25;
        double num2 = 5;

        double result = num % num2;
        System.out.println(0);

        double num3 = 31;
        double num4 = 2;
        double result2 = num3 % num4;
        System.out.println(result2);


        int numOfMuffins = 53;
        int numOfTeamMembers = 20;

        int numOfMuffinsPerEmployee = numOfMuffins/numOfTeamMembers;
        System.out.println("muffins per employee " + numOfMuffinsPerEmployee);

        int numOfMuffinsForPM = numOfMuffins%numOfTeamMembers;
        System.out.println("muffins left over for PM " + numOfMuffinsForPM);


    }
}
