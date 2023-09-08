package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point22StringIndexandLastIndexOf;

public class Videopt3 {

    //int lastindexOf (String str)
    //1. checks if the original String contians the given string
    //2. if it does then find the last


    public static void main(String[] args) {


        String str6 = "Play, Work, Read, Sleep, Eat, Party, Study, Repeat";
        int i7 = str6.lastIndexOf("y"); //41 becuase it goes to to the y in study
        System.out.println(i7);


       int i8 =  str6.lastIndexOf("at"); //48 where the at in repat is at
        System.out.println(i8);
    }
}
