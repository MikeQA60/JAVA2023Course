package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point22StringIndexandLastIndexOf;

public class Video {

    //indexOf(String str) --> returns an int
    // it does two things  ---> first it checks whether the strings cotains the given Strings
    //if does it returns the index of the firt chars of a given string

    //if the string doesnt contain the given then indexOf method returns -1

    public static void main(String[] args) {

        String str = "Hello Superstar of wedevx";

        //goes to original star and contains superstar
        //then checks if it contains superstar
  //returns int      //goes to
    int indexOfS =   str.indexOf("Superstar"); //returns 6
        System.out.println(indexOfS);

        int indexOfOf = str.indexOf("of"); //returns 16
        System.out.println(indexOfOf);

       int index1 = str.indexOf("mars"); //-1 if the word doesnt exist
        System.out.println(index1);


    }
}
