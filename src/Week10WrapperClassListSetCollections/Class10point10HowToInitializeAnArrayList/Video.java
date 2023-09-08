package Week10WrapperClassListSetCollections.Class10point10HowToInitializeAnArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Video {

    //rule 1: you must have an import statement for ArrayLists
    //import java.util.ArrayList

    public static void main(String[] args) {


        //old way, the problem with the following initialization is that
        //i am not specifying the data type of elements
        ArrayList list1 = new ArrayList();

        //add() - will add elements to the end of the arrayList
        list1.add("Elon");
        System.out.println(list1); //[Elon]

        list1.add(1);
        System.out.println(list1);//[Elon, 1]


        //initialize and restrict to only String elements

        //put data type in <>
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Steve");

        System.out.println(list2); //Steve


        //list2.add(20); not alloed bc list2 can only hold Strings

        list2.add("Michelle");
        System.out.println(list2); //[Steve, Michelle]

        //initialize with only one diamond
      ArrayList<Integer> list3 = new ArrayList<>();
      //list3.add("adssdfrg"); only Integers are allowed
        //integer
        list3.add(123);
        list3.add(3243);
        System.out.println(list3); //[123, 3243]


        //initialize with List interface

        List<String> list4 = new ArrayList<>();
        list4.add("Hello");
        list4.add("World");
        System.out.println(list4); //[Hello, World]
    }
}
