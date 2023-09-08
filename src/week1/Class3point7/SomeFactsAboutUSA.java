package week1.Class3point7;

//ex 1
/*
The following are some facts about the United States:


The United States is the third largest country in the world by land area, covering over 9 million square kilometers.

The United States is a federal constitutional republic with a democratic system of government.

The United States has a population of over 330 million people, making it the third most populous country in the world.

The economy of the United States is one of the largest and most developed in the world, with a Gross Domestic Product (GDP) of over $21 trillion.

Write a program that stores the information about totalLandAreaInSqKm, isDemoctatic, totalPopulation, totalGDP assigns the values from the above facts then prints them out in the same order with the descriptions.

 ____ totalLandAreaInSqKm = ____;
 ____ isDemocratic        = ____;
 ____ totalPopulation     = ____;
 ____ totalGDP            = ____;


The expected output of the program:

The United States covers 9000000 square kilometers of land

Is The United States a democratic country? true

The United States has a population of over 330000000 people

Gross Domestic Product (GDP) is over $21000000000000
 */
public class SomeFactsAboutUSA {
    public static void main(String[] args) {
        int totalLandAreaInSqKm = 9000000;
        boolean isDemocratic    = true;
        long totalPopulation    = 330000000l;
        long totalGDP           = 21000000000000l;


        System.out.println("The United States covers "+totalLandAreaInSqKm+" square kilometers of land");
        System.out.println("Is The United States a democratic country? " + isDemocratic);
        System.out.println("The United States has a population of over "+totalPopulation+" people");
        System.out.println( "Gross Domestic Product (GDP) is over $" +totalGDP);
    }
}
