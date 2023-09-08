package Week5NestedIf.Class5point19;

public class NestPt2 {
    public static void main(String[] args) {

    //    int num = 10;

        //variables
        //switch statment
        String country = "USA";
        String state = "New York";

        //outer switch is checking countries
        switch (country) {
            case "USA":

                // inner switch is checking states
                switch (state){
                    case "California":
                        //do you work
                        System.out.println("Tex is 15%");
                        break;
                    case "New York":
                        //do you work
                        System.out.println("Tax is 16%");
                        break;
                }
                break;

        }
    }
}
