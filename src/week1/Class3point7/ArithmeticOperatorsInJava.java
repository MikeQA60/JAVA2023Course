package week1.Class3point7;
// exercise 3

/*
Arithmetic operators in Java are used to perform basic mathematical operations, such as addition, subtraction, multiplication, division, and modulus. The following are the commonly used arithmetic operators in Java:

+ (Addition) - Adds two values and returns the result.

- (Subtraction) - Subtracts one value from another and returns the result.

* (Multiplication) - Multiplies two values and returns the result.

/ (Division) - Divides one value by another and returns the result.

% (Modulus) - Returns the remainder when one value is divided by another.

Write a program that stores each operator symbol (+, -, *, /, %) in the most suitable data type and prints them out with the description.

___ additionSymbol       = ____;
___ subtractionSymbol    = ____;
___ multiplicationSymbol = ____;
___ divisionSymbol       = ____;
___ modulusSymbol        = ____;



The expected output:

+ (Addition) - Adds two values and returns the result.

- (Subtraction) - Subtracts one value from another and returns the result.

* (Multiplication) - Multiplies two values and returns the result.

/ (Division) - Divides one value by another and returns the result.

% (Modulus) - Returns the remainder when one value is divided by another.
 */
public class ArithmeticOperatorsInJava {
    public static void main(String[] args) {
       char additionSymbol       = '+' ;
       char subtractionSymbol    = '-';
       char multiplicationSymbol = '*';
       char divisionSymbol       = '/';
       char modulusSymbol       = '%';


        System.out.println(additionSymbol+ " (Addition) - Adds two values and returns the result.");
        System.out.println(subtractionSymbol+ " (Subtraction) - Subtracts one value from another and returns the result.");
        System.out.println(multiplicationSymbol+" (Multiplication) - Multiplies two values and returns the result.");
        System.out.println(divisionSymbol+ " (Division) - Divides one value by another and returns the result.");
        System.out.println(modulusSymbol+ " (Modulus) - Returns the remainder when one value is divided by another.");
    }
}
