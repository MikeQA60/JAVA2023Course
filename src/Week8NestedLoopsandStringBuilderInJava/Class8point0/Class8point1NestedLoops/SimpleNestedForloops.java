package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point1NestedLoops;

public class SimpleNestedForloops {
    public static void main(String[] args) {
        String letters = "abc";
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            System.out.print(letter);
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
        }
        System.out.println();
      }
    }