package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point4WhileLoopDecrement;

public class Video {
    public static void main(String[] args) {

        //write a program that prints out numbers from 5 to 1

        System.out.println(5);
        System.out.println(4);
        System.out.println(3);
        System.out.println(2);
        System.out.println(1);

        System.out.println("===================");

        //integer starting point
        int i = 5; //starting point


        //there is a possibilty while loop would not run at all
        //if the condition is false for the first run

        //greater than
        while (i >= 1 ) { //ending point

            //print out 5, 4,3 ,2 1
            System.out.println(i);

            //when  you are decrementing the counter
            //you should use > comparison operator
            //decrement
            i--;
        }
    }
}
