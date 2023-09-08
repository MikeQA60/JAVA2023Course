package Week10WrapperClassListSetCollections.Class10point5WrapperClassParseMethodEx;

public class Video {

    public static void main(String[] args) {

        //Acme inc ., 123456.78,7898.12,3456.78
        //  Globex Cororation, 987654.32,5432.10,2189.87
        //"Initech Industries, 456789.01,1234.56,7890.12

        String values = "Acme Inc.,123456.78,7890.12,3456.78\n" +
                "Globex Corporation, 987654.32,5432.10,2109.87\n" +
                "Initech Industries, 456789.01,1234.56,7890.12";

        //task is to calculate total revenue of 3 companies
        //revenu is the value between frist and second commas

        int indexOfFirstComma = values.indexOf(",");
        int indexOfSecondComma = values.indexOf(",", indexOfFirstComma+1);

        System.out.println(indexOfFirstComma); //9
        System.out.println(indexOfSecondComma);//19


        String firstCompanyRevenue = values.substring(indexOfFirstComma+1, indexOfSecondComma); //,123456.78
        System.out.println(firstCompanyRevenue);
        double fistCompRev = Double.parseDouble(firstCompanyRevenue);
        System.out.println(fistCompRev);


        int indexOfFirstNewLine = values.indexOf("\n");
        int secondCompFirstComma = values.indexOf(",", indexOfFirstNewLine);
        int secondCompSecondComma = values.indexOf(",", secondCompFirstComma+1);


        String secondComRevStr = values.substring(secondCompFirstComma +1, secondCompSecondComma);
        double secCompRevenue = Double.parseDouble(secondComRevStr);

        int indexOfSecondNewLine = values.indexOf("\n", indexOfFirstNewLine+1);
        int thirdCompFirstComma = values.indexOf(",", indexOfSecondNewLine);
        int thirdCompSecondComma = values.indexOf(",", thirdCompFirstComma+1);

        String thirdCompRevStr = values.substring(thirdCompFirstComma+1, thirdCompSecondComma);
        double thirdCompRev = Double.parseDouble(thirdCompRevStr);

        System.out.println(secCompRevenue);
        System.out.println(thirdCompRev);

        System.out.println(fistCompRev+secCompRevenue+thirdCompRev);


    }
}
