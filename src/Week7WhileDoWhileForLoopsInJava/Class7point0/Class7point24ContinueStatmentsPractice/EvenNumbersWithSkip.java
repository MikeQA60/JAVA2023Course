package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point24ContinueStatmentsPractice;

public class EvenNumbersWithSkip {
    public static void main(String[] args) {


    }

    public static int printEvenNumbers(int n) {


        //
        if (n <= 0) {

            //
            System.out.println("Error! Number should be bigger than 0");
            //
            return n;
        }
      //
        int i = 0;

        //
        while (i <= n) {

            //
            if (i % 3 == 0) {
                //
                i += 2;
                //
                continue;
            }
            //
            System.out.println(i);
            //
            i += 2;
        }
        //
        return n;
    }
}
