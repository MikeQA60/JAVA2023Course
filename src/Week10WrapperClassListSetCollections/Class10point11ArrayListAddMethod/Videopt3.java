package Week10WrapperClassListSetCollections.Class10point11ArrayListAddMethod;

import java.util.ArrayList;
import java.util.List;

public class Videopt3 {
    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        numList.add(20);
        numList.add(10);
        numList.add(5);

        System.out.println(numList); // [20, 10, 5]

        numList.add(1,25);
        System.out.println(numList); //[20, 25, 10, 5]


    }
}
