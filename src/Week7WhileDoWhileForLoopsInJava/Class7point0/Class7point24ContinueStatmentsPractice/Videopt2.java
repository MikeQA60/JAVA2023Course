package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point24ContinueStatmentsPractice;

public class Videopt2 {

    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {

             //1 % 2 = 1 = true
            if (counter % 2 !=0){
                counter++; //increment
                continue; //continue
            }
            System.out.println(counter);
            counter++; //1

    }

        System.out.println("================");
  }
}
