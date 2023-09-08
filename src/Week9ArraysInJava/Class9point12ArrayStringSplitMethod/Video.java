package Week9ArraysInJava.Class9point12ArrayStringSplitMethod;

import java.util.Arrays;

public class Video {
    public static void main(String[] args) {

        String fullname = "Elon Musk";
       // .split(String str); the param is the delimeter
        //where do i want to break the strings

       String[] names =  fullname.split(" "); //breaks the string into 2 strings
        System.out.println(Arrays.toString(names));


        //Name, Age, Gender
        //John, 25, Male
        //Mary, 30, Female
        String csv = "Name, Age, Gender\n"+
                "John, 25, Male\n" +
                "Mary, 30, Female";

        System.out.println(csv);

        //your task will be to find the age of john
        //what is regex amd how to use?

        String[] arr = csv.split("[,\n]");


        System.out.println(Arrays.toString(arr));


        System.out.println(arr[4]);


        //print out age of Mary
        for(int i = 0; i< arr.length; i++){
            if(arr[i].equals("Mary")) {
                System.out.println(arr[i+1]);
            }
        }

    }
}
