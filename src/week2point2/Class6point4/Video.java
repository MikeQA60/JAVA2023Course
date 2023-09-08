package week2point2.Class6point4;

/*
Class 6.4 - %d Format Specifier
Understand the use of the %d format specifier in Java for formatting decimal values,
including how to use it with the printf method, placeholders, and more, in this comprehensive %d Format Specifier tutorial.
 */
public class Video {
    //%d print number with out changes
    public static void main(String[] args) {


    int num = 12;
    System.out.printf("%d",num);

    //%,d separate command to break thousands

        //\n new line


        int myFirstSalary = 168000;
        System.out.printf("\n%,d",myFirstSalary);

        long psyGangnamStyleViewsOnYT = 6000000000l;
        System.out.printf("\n%,d",psyGangnamStyleViewsOnYT);

        short temp = 73;
        System.out.printf("\n%+-1d",temp);

        //mm/dd/yyyy
        int months = 1;
        int day = 26;
        int year = 2022;
                         //day day
        System.out.printf("\n%02d/%d/%d", months, day, year);

}
}
