package Week10WrapperClassListSetCollections.Class10point16LoopsAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class Videopt2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //set(int index, element); //updates the element at a given index to a new
        //element


        list.add("Lambo");
        list.add("Ferrari");
        list.add("Bugatti");

        System.out.println(list); //[Lambo, Ferrari, Bugatti]


        //skip ferrari

        //arraylist
        for (int i = 0; i < list.size(); i++) {

            //save in string and var
            String var = list.get(i); //numbers, whole num,  decimal  point nums

            //if not ferrari print , if ferrari skip
            if (!var.equalsIgnoreCase("Ferrari")) {
                System.out.println(var);  //Lambo , Bugatti


            }
        }
    }
}
