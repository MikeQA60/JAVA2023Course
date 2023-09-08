package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point0;

public class MethodsWithStringReturnTypeVideo {
    public static void main(String[] args) {

        //String var = "Miguel";
        String var = giveMyName();
        System.out.println(var);

        String lastName = giveMyLastName();
        System.out.println(lastName);

    }
        //string

        public static String giveMyName(){

            return "Miguel";
        }

        //return statement is not sous ---> so it doesnt print anything

    public static  String giveMyLastName(){
        return "Hernandez";
    }
    }
