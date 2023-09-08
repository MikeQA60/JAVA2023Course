package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point24StringSubtstring;

public class Video {

    //string substring (int i) //return the substring from the ith index char to end
    // ex: "DevXSchool" // returns "XSchool"
    public static void main(String[] args) {
        //substring(int i) --> cuts the String from the given index
        //till the end


        String str = "DevXSchool";

        //save string
       String str1 =  str.substring(4);
        System.out.println(str1); //returns "School

     String str2 =  str.substring(2);
        System.out.println(str2);


    }
}
