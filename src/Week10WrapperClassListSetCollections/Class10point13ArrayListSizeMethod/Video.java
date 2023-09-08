package Week10WrapperClassListSetCollections.Class10point13ArrayListSizeMethod;

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
        //size() --> return an int which the size of the list.


        //this is same as array.length property
        //use numsList.size() in every loop
      int sizeOfArrayList =  numsList.size();
        System.out.println(sizeOfArrayList); //4



    }
}
