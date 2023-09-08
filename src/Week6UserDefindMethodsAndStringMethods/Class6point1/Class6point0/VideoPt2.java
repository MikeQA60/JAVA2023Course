package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point0;

public class VideoPt2 {
    public static void main(String[] args) {

        //1
        String elonFullName = printElonMusk();
        System.out.println(elonFullName);
    }

    //2 check two vars
    public static String printElonMusk(){
        String firstName = "Elon";
        String lastName = "Musk";


        //3 return 3 vars and single space
        //write return when your method logic is ready to generate the result

        return firstName + " " + lastName;

}

}
