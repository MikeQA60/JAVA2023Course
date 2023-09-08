package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point5WhileLoopWithString;

public class All8Planets {
    public static void main(String[] args) {

        getCharacters("Mercury");
        getCharacters("Venus");
        getCharacters("Earth");
        getCharacters("Mars");
        getCharacters("Jupiter");
        getCharacters("Saturn");
        getCharacters("Uranus");
        getCharacters("Neptune");
    }
    static void getCharacters(String planetName) {
        int counter = 0;
        while (counter <= planetName.length() -1){
            System.out.println(planetName.charAt(counter));
            counter++;

        }
        System.out.println("=========");

    }
}
