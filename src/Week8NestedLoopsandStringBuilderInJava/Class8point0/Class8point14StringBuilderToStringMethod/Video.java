package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point14StringBuilderToStringMethod;

public class Video {
    public static void main(String[] args) {

       // StringBuilder sb = new StringBuilder();

        //modify string
        String str = "Superstar from wedevx";

        //using stringBuilder
        StringBuilder sb = new StringBuilder(str);

        sb.append(" is going to the moon");

        String str1 = sb.toString();

        System.out.println(str1);

    }
}

//output
//Superstar from wedevx is going to the moon
