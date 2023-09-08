package week4.Class12point.point0.Class4point13;

public class Videopt3 {
    public static void main(String[] args) {
        int num = 5;

        //with this it is 5 is pos because of first if statment

        // 5 is  neg because of both if statements below

        //-2 is neg
        //0 is neg
        //10 is pos

        if(num>0) {
            System.out.println(num + " is positive"); // inde
        }

        //else if needs a condition
        //0

        //below two are a pair
        //5 == 0 = false
         if (num == 0) {
            System.out.println("Zero");
        }
        else {
             //false as well because of if num = 0 false
            System.out.println(num + " is negative");
        }
    }
}


