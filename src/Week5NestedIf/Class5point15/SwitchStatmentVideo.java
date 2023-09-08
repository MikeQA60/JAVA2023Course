package Week5NestedIf.Class5point15;

public class SwitchStatmentVideo {
    public static void main(String[] args) {

        int num = 1;

        //print out Hello if the num is 1

        //variable name
        //int, byte, short, char, string
        //switch statments are allows comparing if the varExpression
        //an the case value are EQUAL
        switch (num){


            case 1:
                System.out.println("Hello");
                System.out.println("DevX");

                break;
                //the body of the case goes unitl the next case, or default
                //or the end of swtich statment

            case 2:
                System.out.println("Hello Mars");
                break;

            case 3:
                System.out.println("Jupiter");
                break;

                //if the case doesnt end with a break statement
                //it means your after the case was executed the program
                //will continue to execute the next cases
                //it will keep going to next cases and the default unitl the program executes



                //if the case doesnt end with a break statement
                //it means your after the case was executed the program
                //will continue to execute the program

        }
    }
}
