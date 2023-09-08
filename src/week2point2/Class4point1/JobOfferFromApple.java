package week2point2.Class4point1;
//excercise 3

/*
Help Apple write a program that creates job offer letters.

Declare a variable for candidateName = "WeDevX Graduate", salary=180000.0, stockOptions=2340, annualBonus=15000.

____ candidateName = "WedevX Graduate";
____ salary=180000.0;
_____ stockOptions=2340;
_____ annualBonus=15000;

____ offerLetter = _____;


Declare a data type for offerLetter and the value should be
"Dear WeDevX Graduate,

Apple is delighted to offer you the position of Software Quality Engineer.

You will receive an annual salary of $180000.0

2340 stock options and annual bonus of 15000"

The entire offer letter text should be concatenated and assigned to offerLetter variable.

Print out the value of offerLetter.

 */
public class JobOfferFromApple {
    public static void main(String[] args) {

      String candidateName = "WeDevX Graduate";
      String salary="180000.0";
      String stockOptions="2340";
      String annualBonus="15000";

      String offerLetter = "\"" + "Dear " + candidateName +",\n" + "Apple is delighted to offer you the position of Software Quality Engineer.\n"
        + "You will receive an annual salary of $" + salary +"\n" + stockOptions + " stock options and annual bonus of " + annualBonus + "\"";


        System.out.println(offerLetter);

    }
}
