package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point20BreakAndContinueStatments;

public class Video {

    //write a program that executes hello world 4 times
    public static void main(String[] args) {

        //rely on starting point
      //  int counter = 1;


//        //will execute true but go into infinite loop
//        while(true) {
//            System.out.println("Hello World");


        //rely on starting point
        int counter2 = 1;
        while(true) { //run loop infinite times


            System.out.println("Hello World");
            counter2++; //increment
            if (counter2 == 5) { //counter starts from one and exit at 4
                //then
                break;


            }
        }
    }
}
