package week1.Class2point4;

//excercise 2
/*
Five little ducks went swimming one day,
	Over the hills and far away.
		Mommy duck said: "Quack, quack, quack, quack."
			But only four little ducks came back.

Four little ducks went swimming one day,
	Over the hills and far away.
		Mommy duck said: "Quack, quack, quack, quack."
			But only three little ducks came back.

 */
public class Duck {
    public static void main(String[] args) {

        // \t is 3 spaces
        // \n is space

        System.out.println("Five little ducks went swimming one day, \n" +
                "\tOver the hills and far away. \n" +
                //6 spaces
                "\t\tMommy duck said: \"Quack, quack, quack, quack.\" \n" +
                //9 spaces
                "\t\t\tBut only four little ducks came back.\n" +
                "\n" +
                "Four little ducks went swimming one day, \n" +
                //3 spaces
                "\tOver the hills and far away. \n" +
                //6 spaces
                "\t\tMommy duck said: \"Quack, quack, quack, quack.\" \n" +
                //9 spaces                                /next line
                "\t\t\tBut only three little ducks came back.\n");
    }


}
