package Week5NestedIf.NestedifPractice2;

public class pt2 {
    public static void main(String[] args) {
        //outer if
        if (true) {
            //inner if
            if (false) {
                System.out.println("DevX 2");
            }
            //inner else
            else {
                //false then goes to else
                System.out.println("Java 2");

            }
        }
    }
}
