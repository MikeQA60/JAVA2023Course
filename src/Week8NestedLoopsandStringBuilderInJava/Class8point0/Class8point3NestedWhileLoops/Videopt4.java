package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point3NestedWhileLoops;

public class Videopt4 {
    public static void main(String[] args) {
        //write a program that prints out value of counter2
        //1,2,3,4 --> counter 1 =1
        //1,2,3,4 --> counter 1 =2
        //1,2,3,4 --> counter 1 =3
        //1,2,3,4 --> counter 1 =4
        //1,2,3,4 --> counter 1 =5

        // Initialize a variable counter1 to 1
        int counter1 = 1;

        //Start a while loop that runs as long as counter1 is less than or equal to 5
        while (counter1 <= 5) {

              // Initialize a variable counter2 to 1
            int counter2 = 1;

            // Start a nested while loop that runs as long as counter2 is less than or equal to 4
            while (counter2 <= 4) {

                // Print the value of counter2 followed by a comma and space
                System.out.print(counter2 + ", ");  //statemnet ran 20x because of 4*5

                //helps print out 1,2,3,4 5x  in a straight line
                // 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4,
                counter2++; // condition updater
            }

            // new print statement helps
            System.out.println("-----> counter 1 " + counter1);

            // Increment counter1 by 1 for the next iteration
            counter1++;


            //result below
//            1, 2, 3, 4, -----> counter 1 1
//            1, 2, 3, 4, -----> counter 1 2
//            1, 2, 3, 4, -----> counter 1 3
//            1, 2, 3, 4, -----> counter 1 4
//            1, 2, 3, 4, -----> counter 1 5
        }
    }
}

