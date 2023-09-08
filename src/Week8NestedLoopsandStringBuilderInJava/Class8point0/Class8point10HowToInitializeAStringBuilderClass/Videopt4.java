package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point10HowToInitializeAStringBuilderClass;

public class Videopt4 {
    public static void main(String[] args) {
        //apend(): = Appends the specified string to the end of the current sequence
        //will just add the provided text above, string builder is immutable
        // adds the provided text into the existing string

        StringBuilder sb5 = new StringBuilder("Hello");
        // with append i can do a chian menthod

         sb5.append(" World").append(1).append(" ").append(23.0);
        //sb5.append(" World");
        System.out.println(sb5);

        //result: Hello World

        StringBuilder sb6 = new StringBuilder();
        for(int i = 0; i < 10; i++){
            sb6.append(i).append(" ");
        }
        System.out.println(sb6);
    }
}

