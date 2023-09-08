package Week10WrapperClassListSetCollections.Class10point15ArrayListRemoveMethod;

import java.util.ArrayList;
import java.util.List;

public class Video {
    public static void main(String[] args) {

List<Double> numsList = new ArrayList<>();
        numsList.add(21.33);
        numsList.add(14.56);
        numsList.add(55.23);
        numsList.add(96.01);
        numsList.add(26.01);

        System.out.println(numsList); //[21.33, 14.56, 55.23, 96.01, 26.01]
        numsList.remove(2);
        System.out.println(numsList); //[21.33, 14.56, 96.01, 26.01]

        numsList.remove(3);
        System.out.println(numsList); //[21.33, 14.56, 96.01]
    }


}
