package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point19StringEqualsAndIgnoreCase;

public class videopt2 {
    public static void main(String[] args) {
        String str2 = "devx";
        boolean isEquals2 = str2.equals("devx");
        System.out.println(isEquals2);

        boolean isEquals3 = str2.equals("Devx"); //false --> equals()method is a case sensitive methid
        System.out.println(isEquals3);


    }

}
