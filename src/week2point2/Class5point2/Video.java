package week2point2.Class5point2;

/*
Class 5.2 - Arithmetic Operators Multiplication
Understand the use of the multiply (*) operator in Java for multiplication,
its precedence, associativity, and how to use it in expressions, in this comprehensive Multiply Arithmetic Operator tutorial.
 */
public class Video {
    public static void main(String[] args) {

        double annualSalary = 135000;
        double raisePercent = 0.15;
        double raiseAmount = annualSalary*raisePercent;

        System.out.println(raiseAmount);


        double newSalary = annualSalary + raiseAmount;
        System.out.println(newSalary);
    }
}
