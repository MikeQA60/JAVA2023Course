package Week10WrapperClassListSetCollections.Class10point22SetSizeClearIsEmptyMethods;

import java.util.HashSet;
import java.util.Set;

public class Videopt3 {
    public static void main(String[] args) {

        Set<Double> prices = new HashSet<>();


        prices.add(12.44);
        prices.add(5.22);
        prices.add(55.11);
        prices.add(234.01);
        prices.add(33.22);

        System.out.println(prices); //[55.11, 234.01, 5.22, 33.22, 12.44]

        prices.clear(); //[55.11, 234.01, 5.22, 33.22, 12.44]
        System.out.println(prices); //[]

        //useful when refreshing elements

        if(prices.isEmpty()) {
            System.out.println("it's empty"); //it's empty
        }
    }
}
