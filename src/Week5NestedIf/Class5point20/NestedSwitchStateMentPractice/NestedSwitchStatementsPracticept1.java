package Week5NestedIf.Class5point20.NestedSwitchStateMentPractice;

public class NestedSwitchStatementsPracticept1 {
    public static void main(String[] args) {

        //write a program that calcaulates tax
        //based on country and the state
        //usa --> cal, wash, arizona ==> 20%
        //usa --> ill, new york => 15%
        //usa --> florida, texas => 10%

        //canada -> ontario, quebec ==> 10 %
        //Canada --> alberta => 12%

        String country = "USA";
        String state = "Arizona";

        switch (country) {
            case "USA":
                switch (state) {
                    case "California":
                    case "Washington":
                    case "Arizona":
                        System.out.println("20%");
                        break;
                    case "Illinois":
                    case "New York":
                        System.out.println("15%");
                        break;

                    case "Florida":
                    case "Texas":
                        System.out.println("10%");

                }
                break;
            case "Canada":
            default:
                System.out.println("Unsupported Country");

        }
    }
}
