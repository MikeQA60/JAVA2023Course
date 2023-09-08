package Week10WrapperClassListSetCollections.Class10point14ArrayListSetMethod;

import java.util.ArrayList;
import java.util.List;

public class Video {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        //set(int index, element); //updates the element at a given index to a new
        //element


        list.add("Lambo");

        list.add("Ferrari");

        list.add("Bugatti");

        System.out.println(list); //[Lambo, Ferrari, Bugatti]

        //update
        list.set(1,"Porsche");
        System.out.println(list); //[Lambo, Porsche, Bugatti]



        list.set(2,"GTR");
        System.out.println(list);  //[Lambo, Porsche, GTR]

    }

}
