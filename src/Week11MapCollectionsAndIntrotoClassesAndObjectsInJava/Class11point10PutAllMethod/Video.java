package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point10PutAllMethod;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {

        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        Map<Integer, String> countryCodesWorld = new HashMap<>();
        countryCodesWorld.put(1, "United States");
        countryCodesWorld.put(86, "China");
        countryCodesWorld.put(89, "South Korea");
        countryCodesEU.put(44, "England"); //if the key already exists then it wont be uodated

        System.out.println(countryCodesEU); //{33=France, 49=Germany, 44=United Kingdom} if adding then //{33=France, 49=Germany, 44=England}
        System.out.println(countryCodesWorld); //{1=United States, 86=China, 89=South Korea}


        countryCodesWorld.putAll(countryCodesEU);
        System.out.println(countryCodesWorld); //{1=United States, 33=France, 49=Germany, 86=China, 89=South Korea, 44=United Kingdom}

        countryCodesWorld.putAll(countryCodesEU);
        System.out.println(countryCodesWorld); //{1=United States, 33=France, 49=Germany, 86=China, 89=South Korea, 44=England}


    }
}
