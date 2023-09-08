package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point2NestedWhileLoop;

public class Video {
    public static void main(String[] args) {


        int counter1 = 1; //two starting points
        int counter2 = 1;

        while(counter1 <=3) { //1,2,3,4
            while (counter2<=2){ //1,2,3
                System.out.println("Superstar");
                counter2++; //run inner loop twice

            }

             counter2 =1;
            counter1++;

            //stoped at 3:32
        }
    }
}
