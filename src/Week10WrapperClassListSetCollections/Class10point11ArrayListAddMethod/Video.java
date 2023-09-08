package Week10WrapperClassListSetCollections.Class10point11ArrayListAddMethod;

import java.util.ArrayList;
import java.util.List;

public class Video {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //add(Element) ===> it adds the given element to end of
        //arraylist

        list.add("Lambo");
        System.out.println(list);  //[Lambo]

        list.add("Ferrari");
        System.out.println(list); //[Lambo, Ferrari]

        list.add("Bugatti");
        System.out.println(list); //[Lambo, Ferrari, Bugatti]



        list.add(0, "Gwagon");
        System.out.println(list); //[Gwagon, Lambo, Ferrari, Bugatti]
    }
}
