package Week10WrapperClassListSetCollections.Class10point16LoopsAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class video {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //set(int index, element); //updates the element at a given index to a new
        //element


        list.add("Lambo");
        list.add("Ferrari");
        list.add("Bugatti");

        System.out.println(list); //[Lambo, Ferrari, Bugatti]

        //you can use traditional for loops
        //for each loop
        //while loop

        for (int i = 0; i < list.size(); i++) {

            //arr[i]
           // list.get(i);
            System.out.println(list.get(i)); //Lambo ,Ferrari , Bugatti
        }

        //
        for (String var : list) {
            System.out.println(var); //Lambo , Ferrari , Bugatti
        }

        //skip ferrari
    }
}
