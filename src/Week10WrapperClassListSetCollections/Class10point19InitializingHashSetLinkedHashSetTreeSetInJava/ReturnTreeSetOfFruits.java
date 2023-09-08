package Week10WrapperClassListSetCollections.Class10point19InitializingHashSetLinkedHashSetTreeSetInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReturnTreeSetOfFruits {
    public static void main(String[] args) {


        }

        public static Set<String> returnTree(List<String> inputList) {
            // Define a method called returnTree that takes an ArrayList of Strings as input.
            // The method returns the initialized TreeSet from the list provided.

            Set<String> treeSet = new TreeSet<>(inputList);
            // Create a TreeSet named 'treeSet' and initialize it with the elements from the inputList.

            return treeSet;
            // Return the initialized TreeSet containing unique elements in sorted order from the inputList.
        }
    }
  //  This code defines a method named returnTree that takes an ArrayList of Strings as input. It initializes a TreeSet with the elements from the input list, automatically removing duplicate elements and sorting the elements in natural order. The example input values have been used in the main method to demonstrate how the method works.






