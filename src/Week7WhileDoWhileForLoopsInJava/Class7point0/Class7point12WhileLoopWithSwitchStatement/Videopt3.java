package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point12WhileLoopWithSwitchStatement;

public class Videopt3 {
    public static void main(String[] args) {


        vowel("Hello");
        System.out.println("==============");
        vowel("Superstar");
    }

    public static void vowel(String str) {
        //starting point
        int counter = 0;

        //counter less length of hello which  (5) - (1)
        while (counter <= str.length() - 1) {

            //looking H  although since it not only of "a,e,i,o,y" not vowel

            switch (str.charAt(counter)) { //is str.charAt0 any of "a,e,i,o,y) then no
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'o':
                case 'y':

                    System.out.println(str.charAt(counter));
                    counter++;
                    break; //prints blank since


                //then
                default:
                    counter++;

            }
        }
    }
    }

