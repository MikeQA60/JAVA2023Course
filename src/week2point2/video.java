package week2point2;

//for clas 5.0
/*
Class 5.0 - Arithmetic Operators Addition
Learn the basics of arithmetic operations in Java, including the use of the plus (+) operator for addition, its precedence,
 associativity, and how to use it in expressions, in this comprehensive Plus Arithmetic Operator tutorial.
 */
public class video {
    public static void main(String[] args) {
        int test1Score = 67;
        int test2Score = 70;
        int test3Score = 75;
        int test4Score = 85;

        //hello67+70 = hello67+70    string and adding ints = converts to strings
        System.out.println("Hello" + test1Score + test2Score); //Hello6770


        int totalScore = test1Score + test2Score + test3Score + test4Score;
        System.out.println(totalScore); //212
    }
}
