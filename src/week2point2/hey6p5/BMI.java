package week2point2.hey6p5;

//example 1

/*

Write a program that calculates the body mass index (BMI) of Lebron James, given his height is 2.03 meters and weight is 113 kg. The program should store height, weight and BMI values in variables and print the BMI using the %f format specifier.

Formula for finding BMI = weight / (height * height);

Note BMI should be rounded to 1 decimal point.





Expected output:

Lebron James' height is 2.03 meters
Lebron James' weight is 113 kg
Lebron James' BMI is X

Where X is the value of BMI.
 */
public class BMI {
    public static void main(String[] args) {

        float height = 2.03f;
        double weight = 113;
        double BMI = 27.4;

        System.out.printf("Lebron James\' height is %.2f meters",height);
        System.out.printf("\nLebron James\' weight %.0f kg",weight);
        System.out.printf("\nLebron James\' BMI is %.1f", BMI);



    }
}
