package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point22StringIndexandLastIndexOf;

public class Videopt2 {
    public static void main(String[] args) {

        //two params method overloading
              // look for string  //look fo
        //r index
        //int indexOf(String s int i)

        //int indexOf(String str, int index)
        //it checks if the original String contains the given String

        //if it dos it starts looking for that string starting from the given index

        //and returns the index of fisrt occurence of that string after the given index

        String str1 = "Mars, Spacex, DevX, Developer, Mars";
      int i5 =  str1.indexOf("Mars", 6); //start looking from S
        System.out.println(i5); //31

        //use case of indexOf is to skip certain chars

        int i6 = str1.indexOf("Dev",16);//where v is at
        System.out.println(i6); //20

    }

}
