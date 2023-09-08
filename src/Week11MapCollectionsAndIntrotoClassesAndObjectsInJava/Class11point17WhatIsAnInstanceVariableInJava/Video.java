package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point17WhatIsAnInstanceVariableInJava;

public class Video {


    //instance variables ==> are characters of an
    //object
    //properties of a class

    //instance variables are variables defined on class level(scope).
    //they have default values, all whole nums have 0
    //decimal number data types have 0.9
  //  boolean = false
    //all objects have null

    //name
    //properties
    String name;
    double price;
    String description;

}


class Main {
    public static void main(String[] args) {
        //datatype     variable name       = initialzie with object
       Video var = new Video();
       var.name = "iphone14";
       var.price = 999.99;
       var.description = "256GB";

        System.out.println(var.name);
        System.out.println(var.price);
        System.out.println(var.description);
        //iphone14
        //999.99
        //256GB

        Video var2 = new Video();
        var2.name = "Google Pixel";
        var2.price = 599.99;
        var2.description = "Google it";

        System.out.println(var2.name);
        System.out.println(var2.price);
        System.out.println(var2.description);
        //Google Pixel
        //599.99
        //Google it

        //when you create an object all properties will
        //get a default value first

        Video var3 = new Video();
        System.out.println(var3.name);
        System.out.println(var3.price);
        System.out.println(var3.description);

        //null
        //0.0
        //null

         //decimal number data types have 0.9
        //  boolean = false
        //all objects have null
    }
}


