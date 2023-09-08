package Week10WrapperClassListSetCollections.Class10point11ArrayListAddMethod;

import java.util.ArrayList;
import java.util.List;

public class Videopt2 {

    public static void main(String[] args) {
    //             end variable name with a list
        List<Double> monthlyRevenueList =  new ArrayList<>();

        monthlyRevenueList.add(15999.33); //
        System.out.println(monthlyRevenueList); //[15999.33]


        monthlyRevenueList.add(35000.21);
        System.out.println(monthlyRevenueList); //[35000.21]

        monthlyRevenueList.add(85000.95);
        System.out.println(monthlyRevenueList); //[35000.21]


        ///////////

        //add(int index, element) --- it adds the element at a specified index
        /*
        //add(2,9)  --> you will get an indexOutOfBoundException

        +---+---+---+---+---+---+---

        |  1 | 2| 9 |  3 | 4 | 5 | 6 | 7 | 8 |

        +---+----+----+----+---+---+---+---+

       0 1 2 3 4 5  6 7 8 index
         */






    }
}
