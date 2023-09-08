package Week10WrapperClassListSetCollections.Class10point4ParseMethodsInWrapper;

public class Video {

    public static void main(String[] args) {

        String str = "25";

        //parseByte(String str)

        byte num = Byte.parseByte(str);

        System.out.println(num);

       int b =  num+10;
        System.out.println(b);
    }
}
