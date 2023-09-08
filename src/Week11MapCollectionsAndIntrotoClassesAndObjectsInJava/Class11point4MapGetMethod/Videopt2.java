package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point4MapGetMethod;

import java.util.HashMap;
import java.util.Map;

public class Videopt2 {
    public static void main(String[] args) {

        Map<String, Double> reportedIncome = new HashMap<>();
        reportedIncome.put("124-46-8957", 100000.00);
        reportedIncome.put("241-46-8758", 120000.00);
        reportedIncome.put("146-66-8023", 130000.00);
                           //just gives income
        System.out.println(reportedIncome.get("146-66-8023")); //  130000.0

        double salary1 = reportedIncome.get("124-46-8957");
        System.out.println(salary1); //100000.0
    }
}
