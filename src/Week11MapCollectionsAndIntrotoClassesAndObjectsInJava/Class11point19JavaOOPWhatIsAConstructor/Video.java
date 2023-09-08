package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point19JavaOOPWhatIsAConstructor;

public class Video {

    public long accountNumber;
    public int routingNumber;
    public String accountHolderName;
    public String address;

   // What is a constructor?
    //Constructor is a part of the code that allows
    //you to create an object
    //EVERY CLASS has a construcot
    //if you dont create a constructor explicitly.
    //then java adds a default contructro into your class.

    //what is a defaul constructor
    //a defual contructor is a constructor that had no empty params


    public  Video() {
        //it's okay to write code inside constructors
        System.out.println("Hello IM Constructor");

    }

    //what are the rules for creating a constructor
    //1. initializes an object
    //2. cannot be called like methods
    //3. are called automatically asap objects gets created
    //4. dont have any return type (even void)
    //5. name is same as that of "Class Name"

}

class Main2 {
    public static void main(String[] args) {
      Video var = new Video(); // Hello IM Constructor



    }


}
