package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point10HowToInitializeAStringBuilderClass;

public class Video{

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); //""
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello"); //initialize a value in the constructor
        System.out.println(sb1);

        //Dont do this below
       // StringBuilder sb2 = "Hello";

             //string
        String str = "Elon";
        //                constructor of string builder
        StringBuilder sb2 = new StringBuilder(str); //transform your string into a stringbuilder
        System.out.println(sb2);



    }
}
