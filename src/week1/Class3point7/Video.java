package week1.Class3point7;

/*
Class 3.7 - How to print out variables with additional info
In this video lecture, we will learn how to print out variables in Java programming language effectively.
You will learn about the different ways to print variables and how to include additional information (e.g. labels, formatting, etc.)
for better readability. By the end of this lecture, you will have the skills to create clear and informative output in your programs.
 */
public class Video {

    public static void main(String[] args) {

        //print variables with text is using + sign
        //

        byte day = 16;
        byte month = 7;
        short year = 1994;
        char gender = 'M';
        int desiredSalary = 165000;
        boolean hasUSPassport = true;

        //printing variables with adding text before or after variable

        System.out.println("Askar's birthday is on " + month + "/" + day +  "/" +year);
        System.out.println("Askar's gender is: " +gender);
        System.out.println("Askar's desired salary: " + desiredSalary);
        System.out.println("Does Askar have a US passport " + hasUSPassport);

    }

}
