package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point24ContinueStatmentsPractice;

public class Videopt3 {

    //write a program that prints out every character in a String
    //except space
    public static void main(String[] args) {

        String str = "Hello Future SDET Superstar";


        for(int i =0; i<str.length();i++) {

            //if space dont execute line 18
            if(str.charAt(i) == ' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }
    }
}

//answer

//H
//e
//l
//l
//o
//F
//u
//t
//u
//r
//e
//S
//D
//E
//T
//S
//u
//p
//e
//r
//s
//t
//a
//r