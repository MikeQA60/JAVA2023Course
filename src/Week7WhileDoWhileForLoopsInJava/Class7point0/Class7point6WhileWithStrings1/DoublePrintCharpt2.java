package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point6WhileWithStrings1;

public class DoublePrintCharpt2 {

    public static String printStringWithX(String input) {

        if(input.contains("X") || input.contains("x")) {

            String newInput = input.replace("x", "xx");

            newInput = newInput.replace("X", "XX");
            return newInput;
        }
        return input;
    }
}
