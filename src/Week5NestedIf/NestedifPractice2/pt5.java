package Week5NestedIf.NestedifPractice2;

public class pt5 {
    //outer if
    public static void main(String[] args) {


        if (false) {

            if (false) {
                //inner if
                System.out.println("Devx 5");
            }
            //inner if
            else if (true) {
                System.out.println("if 5");
            }
            //inner else
            else {
                System.out.println("Java 5");
            }
        } else {
            System.out.println("Else 5");
        }
    }
}

    //if(false), else(false), else if(true), else
    //only if 4 is executed

//else 5  is answe


