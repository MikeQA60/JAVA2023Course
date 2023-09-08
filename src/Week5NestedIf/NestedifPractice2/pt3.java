package Week5NestedIf.NestedifPractice2;

public class pt3 {
    public static void main(String[] args) {
        //outer if
        if(true) {
            System.out.println("World 3");
            //inner if
            if(false) {
                System.out.println("DevX 3");
            }
            //inner else
            else {
                System.out.println("Java 3");


                //true, false skip , else is correct so java 3
            }
        }
    }
}

