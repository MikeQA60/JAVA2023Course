package week2point2.Class4point1;

/*
Class 4.1 - String Concatenation
Explore the process of combining two or more strings into a single string in Java
through the use of concatenation operators, methods,
 and more in this comprehensive String concatenation tutorial
 */

// " " is a space
public class Video {
    public static void main(String[] args) {

        String firstName = "Miguel";
        String lastName = "Hernandez";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        String address = "1125 Punta Gorda St";
        String city = "Santa Barbara";
        String country = "USA";
        String zipCode = "93103";

        String fullAddress= address + " " + city + "," + country + " " + zipCode;
        System.out.println(fullAddress);
    }
}
