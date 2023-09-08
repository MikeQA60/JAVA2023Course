package Week10WrapperClassListSetCollections.Class10point16LoopsAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class VideoPt3 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        //set(int index, element); //updates the element at a given index to a new
        //element


        list.add("Lambo");
        list.add("Ferrari");
        list.add("Bugatti");

        System.out.println(list); //[Lambo, Ferrari, Bugatti]

        for (String var : list){

            //if not ferrari print , if ferrari skip
            if(!var.equalsIgnoreCase("Ferrari")){
                System.out.println(var); //Lambo, Bugatti

            }
        }
    }
}
