package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point11StringBuilderDeleteMethod;

public class Video {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello Superstar");

        //delete(int startingIndex, int endingIndex)
        sb.delete(0,6);

        System.out.println(sb);

    }
}
