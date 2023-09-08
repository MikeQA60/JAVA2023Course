package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7poin7WhileLoopIncrementby2;

public class Video {

    //write a program that prints 1-3-5-7-9
    public static void main(String[] args) {

        System.out.println(1); //+2
        System.out.println(3);
        System.out.println(5);
        System.out.println(7);
        System.out.println(9);

        System.out.println("========");

        //start
        int counter = 1;

        //
        while (counter <=9) {
            System.out.println(counter);

            //1+=2 3<=9 = yes print out 3


            //compound operator
            counter+=2;
        }
    }
}
