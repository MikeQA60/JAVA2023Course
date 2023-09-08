package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point13DoWhileLoopIntro;


//do while
public class Video {
    public static void main(String[] args) {
        //Print out Hello 5 times
        //if we kniw have times e need loop
        //we are still required to have
        //1 body
        //2 have the counter with starting point
        //3 condition with the ending point
        //4 make sure you have the counter updater



        //only after the body is executed once the condition is check for the first time
        //after that it works exactly the same as while loop


        //the biggest difference between while and do while loop
        //is that do while loop is
        //executed at least once
        //starting point
        int counter = 1;

        do {  //in the first iteration we dont check for any condtion

            //body
            System.out.println("Hello");
            //updater
            counter++;
            //put condition in ()

            //ending and compare
        }while (counter <=5);

        //executing hello 5 times
    }
}
