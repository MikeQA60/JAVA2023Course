package week1.Class1point2;


/*
Class 1.1 - Class Structure 2
You will get a closer look at building your first Java class, a main method, and print statements in this class.
We will cover common mistakes beginners make when writing their first program and how to avoid them.
 */
/*
1//class is creating a text file
2//class and public can not be switched
3//{ } curly braces define a scope ex.class or method

 */
public class ClassStructureClass2 {

    //ex. 4

//main method is stating point of java ( public static void main(String[] args) { )

    //public is an access modifier
    //static is a java keyword
    //void is java keyword
    //main
    //(String[] args)
    public static void main(String[] args) {

        //system(S with uppercase) //no spaces on this code
        // inside "" we can write a comment and it will print out a statement
        //put semicolon at the end

        //  System.out.println is a method we can print anything
        //  System.out.println("Hello WeDevX");
        System.out.println("1. Apple \n" +
                "Annual revenue: $387.54 billion \n" +
                "Employees: 154,000 people \n" +
                "Market Cap: $2,502,000,000,000 \n" +
                "------------------------------ \n" +
                "2. Microsoft \n" +
                "Annual revenue: $203.07 billion \n" +
                "Employees: 221,000 people \n" +
                "Market Cap: $1,758,000,000,000 \n" +
                "------------------------------ \n" +
                "3. Google \n" +
                "Annual revenue: $282.11 billion \n" +
                "Employees: 174,014 people \n" +
                "Market Cap: $1,248,000,000,000");


    }
}

