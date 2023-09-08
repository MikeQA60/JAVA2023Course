package week3.Class7point0.Class8point4;

public class Video {

    public static void main(String[] args) {

        //returning true because they are both literals " "


        String str1 = new String ("April");
        String str2 = "April";

        //ex1
        //boolean isEqual = str1 == str2;
        //.equals method turns true when value of str1 = str2

        //
        System.out.println(str1);
        System.out.println(str2);

        //ex2
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);



    }
}
