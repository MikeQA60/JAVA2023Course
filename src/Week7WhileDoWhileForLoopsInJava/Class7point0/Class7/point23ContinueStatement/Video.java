package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7.point23ContinueStatement;

public class Video {

    public static void main(String[] args) {

        //starting from 1
        int counter = 1;

        //true
        while (counter <=5) {

            System.out.println("superstars");
            //incremening till 5
            counter++;

            if (counter ==2) {

                continue; //skip lines 19 and 23, go to the next iteration
            }
            //below statement becomes unreachable and statements must be wrapped with if statments
          //  continue;
            System.out.println("I love java");

        }
    }
}

//prints out
//
//    superstars
//            superstars
//    I love java
//        superstars
//    I love java
//        superstars
//    I love java
//        superstars
//    I love java
