package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point12StringBuilderReplaceMethod;

public class Videopt3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Let's get down the business");

        sb.replace(10, 18, "some").append(" done");
        System.out.println(sb);
    }
}

//output
//Let's get some business done
