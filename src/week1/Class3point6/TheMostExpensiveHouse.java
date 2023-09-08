package week1.Class3point6;
//ex 4

/*
The most expensive house in the world, according to 99acres, is:

1. Buckingham Palace, London - Spread across 830,000 sq ft, the palace has 775 rooms,
 92 offices, 188 staff bedrooms, 78 bathrooms, and 19 staterooms. It has its own in-house dispensary and jewelry room as well.
  The current worth of Buckingham Palace is estimated to be $4.9 billion.

Write a program that populates all measurable info about Buckingham Palace, London,
in the most suitable data types. Then prints them all out in the same order.
 */
public class TheMostExpensiveHouse {
    public static void main(String[] args) {
        int totalAreaInSqFt       = 830000;
        System.out.println(totalAreaInSqFt);
        short numberOfRooms       = 775;
        System.out.println(numberOfRooms);
        byte  numberOfOffices     = 92;
        System.out.println(numberOfOffices);
        short numberOfStuffBedrooms = 188;
        System.out.println(numberOfStuffBedrooms);
        byte numberOfBathrooms     = 78;
        System.out.println(numberOfBathrooms);
        byte numberOfStateRooms    =  19;
        System.out.println(numberOfStateRooms);
        boolean hasInHouseDispensary  = true;
        System.out.println(hasInHouseDispensary);
        boolean hasJewelryRoom        = true;
        System.out.println(hasJewelryRoom);
        long totalCostOfPalace     = 4900000000l;
        System.out.println(totalCostOfPalace);




    }
}
