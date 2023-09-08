package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point14StringCharAt;

public class CharAtVideopt1 {
    public static void main(String[] args) {
        //create a string and initialize

        //            can be any string inside""
        String str ="wedevx.co";

        //charAt returns a char
  //char method      // and () is a param
      char firstIndex =  str.charAt(0);
        System.out.println(firstIndex);

        char secondIndex = str.charAt(1);
        System.out.println(secondIndex);

        char thirdIndex = str.charAt(2);
        System.out.println(thirdIndex);

        char fourthIndex = str.charAt(3);
        System.out.println(fourthIndex);


        char fifthIndex = str.charAt(4);
        System.out.println(fifthIndex);

        char sixthIndex = str.charAt(5);
        System.out.println(sixthIndex);

        char seventhIndex = str.charAt(6);
        System.out.println(seventhIndex);

        char eigthIndex = str.charAt(7);
        System.out.println(eigthIndex);

        char ninthIndex = str.charAt(8);
        System.out.println(ninthIndex);

        //stringIndexOutofBoundsException --
        //you get this error when inputting a wrong index and program crashed

        //you cant add negative and smallest num is 0

       // it crashes here
//        str.charAt(-1);
//        System.out.println("Hello");
    }

}
