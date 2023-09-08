package Week9ArraysInJava.Class9point5DifferentDataTypesofArrays;

public class Videopt2 {
    public static void main(String[] args) {
        char[] grades = {'A','B','A','C','F','D'};

        System.out.println(grades[3]); //'C'


        char [] grades2 = new char[3];

        //char --> \u0000 --> empty char
        System.out.println(grades2[0]); //0


    }
}
