package Week10WrapperClassListSetCollections.Class10point19InitializingHashSetLinkedHashSetTreeSetInJava;

//import com.sun.org.apache.xpath.internal.operations.String;



import java.util.*;

public class Video {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        //unordered, unique
        //hashset
        Set<String> namesSet = new HashSet<>();

        //treeset, ordered based on what ordering logic you provide
        Set<String> treeSet = new TreeSet<>();

        //linked hash set, ordered based on insertion order
        Set<String> linkedSet = new LinkedHashSet<>();

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("Salam alekyum");
        list.add("Merhaba");
        list.add("Hi");
        System.out.println(list); //[Hello, Hi, Salam alekyum, Merhaba, Hi]

        Set<String> set = new HashSet<>(list);
        System.out.println(set);//[Hi, Merhaba, Hello, Salam alekyum]

        Set<String> set2 = new LinkedHashSet<>();
        System.out.println(set); //[Hi, Merhaba, Hello, Salam alekyum]
    }

}
