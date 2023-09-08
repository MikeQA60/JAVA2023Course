package Week10WrapperClassListSetCollections.Class10point12ArrayListGetMethod;

import java.util.ArrayList;
import java.util.List;

public class Videopt2 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        //get(int index) === >  return the element at a given index


        list.add("Apple inc.");
        list.add("Google.");
        list.add("Amazon.");
        list.add("Microsoft");

        System.out.println(list); //[Apple inc., Google., Amazon., Microsoft]


        String str  = list.get(0);
        System.out.println(str); //Apple inc.


        str+= " Company";
        System.out.println(str); //Apple inc. Company
        System.out.println(list); //[Apple inc., Google., Amazon., Microsoft]

        //save data type in a string
      String amazon =   list.get(2);

        System.out.println(amazon); //Amazon.



    }
}
