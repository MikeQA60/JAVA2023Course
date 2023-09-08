package week3.Class7point0.Class9point3;

/*
Class 9.3 - Conditional Operators Practice 1
Practice and reinforce your understanding of the conditional & and | operators in Java
 through a series of hands-on exercises and challenges in this Conditional & and | Operators Practice tutorial.

 */
public class Video {
    public static void main(String[] args) {
        // credit valid numbers are between 300 and 850 inclusive
        //write a program that tell us whether the number is a valid credit score

        //ex 1
//returns true bc 750 is between 300 and 800
        int creditScore = 750;
        //more than or equal too              ///less than or = too
        boolean isValidCreditScore = creditScore >= 300 && creditScore <= 850;
        System.out.println(isValidCreditScore);

//ex2
        //returns false bc 250 is not between 300 and 800
        int creditScore2 = 250;
        //more than or equal too              ///less than or = too
        boolean isValidCreditScore2 = creditScore2 >= 300 && creditScore2 <= 850;
        System.out.println(isValidCreditScore2);


//ex3
        //returns false bc 250 is not between 300 and 800
        int creditScore3 = 650;
        //more than or equal too              /// || will be true because 650 is more
        boolean isValidCreditScore3 = creditScore3 >= 300 || creditScore <= 850;
        System.out.println(isValidCreditScore3);


//ex4
        //a person must be a us citizen
        //and must be over 18 y.o in order to be able to vote
        boolean isCitizen = true;
        int age = 17;
        //returns false because age is not more than 18
            ///true. && false
        boolean canVote = isCitizen && age >= 18;
        System.out.println(canVote);

        //ex5
        //a person must be a us citizen
        //and must be over 18 y.o in order to be able to vote
        boolean isCitizen2 = false;
        int age1 = 25;
        //returns false because age is not more than 18
        ///true. && false
        boolean canVote1 = isCitizen2 && age1 >= 18;
        System.out.println(canVote1);


    }
}