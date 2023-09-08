package Week10WrapperClassListSetCollections.Class10pointAutoBoxingUnboxing;

public class Video {
    public static void main(String[] args) {
      //              literal value
        Integer num = 27; //autoboxing

        //autoboxing is a concept that converts literal
        // values of primitive data types into wrapper classes



        int num2 = new Integer(24); //unboxin
        //the process of converting wrapper clsses into
        // correspoing primitive data type


        int sum = num + num2;
        System.out.println(sum); //51

        Double d = 25.0;
        Double d2 = 2.5;
        double result = d/d2;
        System.out.println(result); //10.0

    }
}
