package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point19StringEqualsAndIgnoreCase;

public class Videopt3 {
    public static void main(String[] args) {


    String str4 = "Mars";
    boolean isEquals4 = str4.equalsIgnoreCase("mars"); //true --> because both words say mars besides ignorecase
        System.out.println(isEquals4);

     boolean isEquals5 =  str4.equalsIgnoreCase("MARS");//true --> because both words say mars besides ignorecase
        System.out.println(isEquals5);

      boolean isEquals6 = str4.equalsIgnoreCase("Jup"); //false --> because words says mars and jup
        System.out.println(isEquals6);
}
}
