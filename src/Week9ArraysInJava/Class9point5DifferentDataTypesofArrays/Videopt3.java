package Week9ArraysInJava.Class9point5DifferentDataTypesofArrays;

public class Videopt3 {
    public static void main(String[] args) {
        String[] employeeNames = {"Steve", "Elon", "Erica", "Aisha"};

        System.out.println(employeeNames[3]); //Aisha

        String[] cities = new String[6];

        //String --> null

        //null is a default value of any obeject
        //null means nothing
        System.out.println(cities[0]); //null


        boolean[] answers = {true, true, false, true, false};
        System.out.println(answers[3]); //true


        boolean[] answers1 = new boolean[10];
        System.out.println(answers1[2]); //false
        //boolean --> false


    }
}
