package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point12StringBuilderReplaceMethod;

public class Video {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java, Junit, Selenium, API");

        //replace takes 3 params (int startIndex, intendIndex, String strToReplace)
        sb.replace(6,11,"Cucumber");

        System.out.println(sb);


        //replaces Junit with Cucumber
    }
}
