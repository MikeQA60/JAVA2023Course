package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point20StringPoolVsHeap;

public class Stringpool {
    public static void main(String[] args) {

        String str = "devx"; //string pool
        String str2 = "devx"; //string poo
        String str3 = new String("devx"); //string heap
        String str4 = new String("devx"); //string heap

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


        //checks the value and doesnt care about memoery location
        System.out.println(str.equals(str4));

        //== -> compares the memory location
     boolean isEquals =  str == str4; // false
        System.out.println(isEquals);

        boolean isEquals2 = str == str2; //true
        System.out.println(isEquals2);
    }
}
