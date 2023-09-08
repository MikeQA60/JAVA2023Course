package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point9StringBuilderInsertMethod;

public class ConditionalInsert {
    public static void main(String[] args) {

    }
    public static StringBuilder insertWords(String word, String insertedWord){
        StringBuilder sb = new StringBuilder(word);

        if(word.contains("is")) {
            int abc = sb.indexOf("is");
            return sb.insert(abc + 3, insertedWord);
        }else{
            return sb;
        }
    }

}
