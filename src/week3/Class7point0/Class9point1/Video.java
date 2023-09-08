package week3.Class7point0.Class9point1;

public class Video {

    public static void main(String[] args) {


        // & --> And -- > returns true if both sides of the operators are true, other it return false
        // | --> or --> returns true if either or both sides of the operators are true, other it return false
        // | --> returns false if both side are false

        //first ex
        boolean a = true;
        boolean b = false;
          // (a)true  & (b)false
        System.out.println(a & b); // false bc only one side is true

        // 2n ex

        //(a1)true & (b1)true
        boolean a1 = true;
        boolean b1 = true;
        System.out.println(a1 & b1); //true

        //(a1)true & (b1)true
        boolean a2 = false;
        boolean b2 = true;
        System.out.println(a2 & b2); //false

        boolean a3 = true;
        boolean b3 = false;
        System.out.println(a3 | b3); // true

        boolean a4 = false;
        boolean b4 = true;
        System.out.println(a4 | b4); //true

        boolean a5 = false;
        boolean b5 = false;

        System.out.println(a5 | b5); //false









    }
}
