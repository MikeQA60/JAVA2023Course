package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point15StringConcat;

public class ConcatTwoStrings {
    public static void main(String[] args) {


       // String str1 = "WeDevx";
//reassign a value  save result in str
    //    str1  =  str1.concat(" is future!");
   //     System.out.println(str1);


        String str2 = "Wedevx";

        //method chaining

        //saved in finalstring   //return string
        String finalStr2 =  str2.concat(" ").concat("SuperStar");
        System.out.println(finalStr2);
    }
}
