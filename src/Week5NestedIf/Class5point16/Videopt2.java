package Week5NestedIf.Class5point16;

public class Videopt2 {
    public static void main(String[] args) {
        //
        int num = 1;

        //print out Hello if the num is 1

        //switch and variable
        //no boolean exp, int, byte, short, char, string


        //switch statments are allows comparing if the varExpression
        //and the case value are EQual.
        switch (num) {
            case 1:
                System.out.println("Hello");
                System.out.println("DevX!");
                break;

                //the body of the case goes until the next case, or default
                //or the end of the switch statement

            case 2:
                System.out.println("Hello Mars");

            case 3:
                System.out.println("Jupiter");
                //if the case doesnt end with a break statement
                //it means after the case was executed the program
                //will continue to execute the next cases.

                //it will keep going to next cases and the default util
                //the program executes break statement or reaches the end of the
                //switch statement





        }
    }
}
