package week2point2.hey6p5;

/*
Class 6.5 - %f Format Specifier
Learn about the use of the %f format specifier in Java for
 formatting floating-point values, including how to use it with the printf method, precision, and more,
  in this comprehensive %f Format Specifier tutorial.
 */
public class video {
    //%f numbers that have decimal points
    public static void main(String[] args) {


        double salary = 175000.1375;
        System.out.printf("%f",salary);
                          //%.2f = 175000.00
        System.out.printf("\n%.2f",salary);
                       //, indicate 1000 with, .2f deci
        System.out.printf("\n%,.2f",salary);

    }


}
