package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point6WhileWithStrings1;

public class ConcatAndPrint {

    public static void printConcatenatedString(String str1, String str2){
        String concatenatedString = str1.concat(str2);
        int i = 0;
        while (i < concatenatedString.length()){

            System.out.printf("%c-", concatenatedString.charAt(i));
            i++;
        }
    }
}
