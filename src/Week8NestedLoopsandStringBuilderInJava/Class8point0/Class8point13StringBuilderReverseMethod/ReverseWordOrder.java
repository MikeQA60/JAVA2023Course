package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point13StringBuilderReverseMethod;

public class ReverseWordOrder {
    public static void main(String[] args) {
    }

    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return "";


        }

        StringBuilder reversed = new StringBuilder();

        StringBuilder word = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (Character.isWhitespace(c)) {
                if(word.length() > 0) {

                    reversed.append(word.reverse()).append(c);
                    word.setLength(0);

                } else {
                    reversed.append(c);

                }
            }else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            reversed.append(word.reverse());
        }
        return reversed.toString();
    }
    }




