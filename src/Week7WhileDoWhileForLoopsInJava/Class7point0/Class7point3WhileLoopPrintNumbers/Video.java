package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point3WhileLoopPrintNumbers;

public class Video {
    public static void main(String[] args) {
//write a program that prints numbers from 1-5

        System.out.println(1); //+
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println("======================");

        int counter = 1; //starting from 1


        while (counter <= 5) { //ending point
            System.out.println(counter);

            //1 less than 5
            //2 less
            counter++; //update
        }
    }
}
