package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point12StringBuilderReplaceMethod;

public class Videopt2 {
    public static void main(String[] args) {

        //replace takes 3 params (int startIndex, intendIndex, String strToReplace)
        StringBuilder sb = new StringBuilder("Lets get down the business");

        //replace down/the to "some"
        sb.replace(10, 18, "some");
        System.out.println(sb);
    }
}
//output
        //
//Let's get some business;