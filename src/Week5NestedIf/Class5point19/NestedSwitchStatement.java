package Week5NestedIf.Class5point19;

public class NestedSwitchStatement {
    public static void main(String[] args) {

        int num = 10;
        String country = "USA";
        switch (num) {
            case 1:
                System.out.println("case 1");
                switch (country) {
                    case "USA":
                        //do you work
                        break;
                    case "Canada":
                        //do you work
                        break;
                }

        }
    }
}