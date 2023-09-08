package week3.Class7point0.Class9point2;

//conditional operators 3
/*
Discover the use of the conditional & and | operators in Java,
 how they differ from the logical && and || operators,
  in this comprehensive Conditional & and | Operators tutorial.
 */
public class Video {

    public static void main(String[] args) {
        //&& --> returns true if both sides are true, otherwise it returns false
        // || --> returns false if both sides are false, otherwise it returns true.
        //|| --> returns true if both sides or at least one side is true

        boolean a = true;
        boolean b = false;

        boolean result = a && b; //false
        System.out.println(result);


        //pt 2

        boolean a1 = true;
        boolean b1 = true;

        boolean result1 = a1 && b1; // true bc both sides are true
        System.out.println(result1);

        //pt 3
        boolean a2 = false;
        boolean b2 = true;
           //false && bc one is false
        boolean result2 = a2 && b2;
        System.out.println(result2);

        //pt 3
        boolean a3 = true;
        boolean b3 = false;
        //true ||
        boolean result3 = a3 || b3;
        System.out.println(result3);



    }

}
