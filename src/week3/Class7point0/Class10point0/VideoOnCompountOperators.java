package week3.Class7point0.Class10point0;

//In this class, we will discover how compound operators in Java can streamline your code and boost its efficiency.
public class VideoOnCompountOperators {
    public static void main(String[] args) {

        //+= add the previous value of a variable with a new value
        //and updates the value of a variable with a new value

        //interger
        int num = 10;
        System.out.println(num); //10
        //or int num2 = num + 5;
               //right side executed first
        num+=5; // num = num + 5;
        System.out.println(num); //15

        num+=10; // num = num + 10; //will print out 25
        System.out.println(num);

        num+=2; // 25 + 2 = 27
        System.out.println(num);


    }
}
