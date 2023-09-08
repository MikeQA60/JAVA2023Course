package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point9StringBuilderInsertMethod;

public class VideoPt2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("wedevxco");
        //index 5  (int index, String str);
        sb.insert(6,".");
        System.out.println(sb);


        StringBuilder sb1 = new StringBuilder("John Doe");

        //index of john at 4
        sb1.insert(4," Black Hand");

        System.out.println(sb1);

    }
}
