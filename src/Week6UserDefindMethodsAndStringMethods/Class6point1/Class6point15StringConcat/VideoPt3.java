package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point15StringConcat;

public class VideoPt3 {
    public static void main(String[] args) {

//        //creating a string
//        String str1 = "Hello";
//        //assign a varible
//        String str2 = "Superstars";
//
//        //concat return a string
//
//        //saved in finalstring         // Hello calls Superstars
//        String finalString = str1.concat(str2);

        //to add space
        //String finalString = str1.concat(" ").concat(str2);
//
//        //Calls hello superstars
//        System.out.println(finalString);
//
//        //methods     //result is opposite  //passing the variable
//        String finalStr2 = str2.concat(str1);
//        System.out.println(finalStr2);

        //reassigning a value of a String variable

        String str4 = "Mars";
//reassign a value  save result in str
      str4  =  str4.concat(" is future!");
        System.out.println(str4);


        //in strings we are allowed to chain the methods
        //call another string method at the end of another string method
        String str5 = "Space X";

        //method chaining

        //saved in finalstring   //return string
     String finalStr5 =  str5.concat("::").concat("is going to take us to Mars");
        System.out.println(finalStr5);


    }

}