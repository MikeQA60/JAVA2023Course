package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point14DoWhileLoop1;

public class Video {

    //write a program that prints out numbers from 1-5

    //use do while

    public static void main(String[] args) {

        int counter = 1;

        do {

            System.out.println(counter++);  //post increment it first returns old value
            //then it increments


        }while (counter <=5);

    }
}
