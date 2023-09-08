package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point5WhileLoopWithString;

public class Video {

    //given a hello superstar string

    //print out each character of a string in a new line


    public static void main(String[] args) {

        //create a string
        String str = "Hello Superstar";
                     //print character
        System.out.println(str.charAt(0)); //+1
        System.out.println(str.charAt(1));//+1
        System.out.println(str.charAt(2));//+1
        System.out.println(str.charAt(3));//+1
        System.out.println(str.charAt(4));//+1
        System.out.println(str.charAt(5));//+1
        System.out.println(str.charAt(6));//+1
        System.out.println(str.charAt(7));//+1
        System.out.println(str.charAt(8));//+1
        System.out.println(str.charAt(9));//+1
        System.out.println(str.charAt(10));//+1
        System.out.println(str.charAt(11));//+1
        System.out.println(str.charAt(12));//+1
        System.out.println(str.charAt(13));//+1
        System.out.println(str.charAt(14));//+1

        System.out.println("===============================");

        //integer
     //
        int counter = 0; //starting
              //ince
        while (counter <= 14) { //ending

            //
            System.out.println(str.charAt(counter));
            counter++;
        }
    }
}
