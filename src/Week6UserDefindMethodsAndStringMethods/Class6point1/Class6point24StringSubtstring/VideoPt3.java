package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point24StringSubtstring;

public class VideoPt3 {

    //stirng substring (int i, int j)
    //cut the string from i to j



    public static void main(String[] args) {

        String str5 = "Hello Java Superstars, Java is Hard, but it's fun!";
    String str7 = "hello my dear friend, it's a beautiful day today";

  String str8 =  str7.substring(22,37); //22 is to i in it's , ful in 36
        System.out.println(str8); // returns "it's a beautifu"

        //save in integer variable
        int lastIndexOfJava = str5.lastIndexOf("Java"); // j and i ,  Java is
        int lastIndexOfComma = str5.lastIndexOf(","); //Hard,

     String str10 =  str5.substring(lastIndexOfJava,lastIndexOfComma);
        System.out.println(str10); //Java is Hard

    }
}
