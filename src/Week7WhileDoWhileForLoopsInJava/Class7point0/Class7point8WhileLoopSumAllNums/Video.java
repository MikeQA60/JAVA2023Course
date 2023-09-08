package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point8WhileLoopSumAllNums;

public class Video {

    //write a program that sums up all numbers from 1-5

    //1+2+3+4+5 = 15

    public static void main(String[] args) {

        int counter = 1;  //starting point
        //variable that tracks 1-5
        int sum =0; //

        //1 less than 5
        while (counter <= 5) { //increment

            //            System.out.println(counter);

            //sum is 0 +1, then counter = 2
            //1 + 2 =3 +3 = 6
            //6 + 4 = 10
            //10 + 5 == 15
            sum+=counter;

            System.out.println(sum);
     //then add plus
            counter++;
        }
    }

}
