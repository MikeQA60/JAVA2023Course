package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point3NestedWhileLoops;

public class Videopt2 {
    public static void main(String[] args) {
        //write a program that prints out value of counter2

        int counter1 = 1;
        while (counter1 <= 5) {

            int counter2 = 1;
            while (counter2 <= 4) {
                System.out.print(counter2 + ", ");  //statemnet ran 20x because of 4*5

                //helps print out 1,2,3,4 5x  in a straight line
               // 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4,
                        counter2++; // condition updater
            }

            counter1++;


        }
    }
}

