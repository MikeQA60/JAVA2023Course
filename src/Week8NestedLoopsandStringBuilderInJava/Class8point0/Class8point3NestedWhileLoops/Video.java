package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point3NestedWhileLoops;

public class Video {

    public static void main(String[] args) {
        //write a program that prints out value of counter2

        int counter1 = 1;
        while (counter1 <= 5) {

            int counter2 = 1;
            while (counter2 <= 4) {
                System.out.println(counter2);  //statemnet ran 20x because of 4*5
                counter2++; // condition updater
            }

            counter1++;

            //print outs 1-4, 5x
        }
    }
}
