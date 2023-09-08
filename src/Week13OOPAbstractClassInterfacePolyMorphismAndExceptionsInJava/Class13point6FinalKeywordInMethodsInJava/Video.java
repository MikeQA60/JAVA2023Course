package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point6FinalKeywordInMethodsInJava;

public class Video {
    public static void main(String[] args) {
        //final keyword in java
        //1) variables can be declared as final - that means the variable can only be initialized once
        //2) class can be decalred final --> that means no other class can extend from that class
        //3) a method can be declared final --> the method can not be overriden.
    }

}

class Animal2 {
    public final void eat() {
        System.out.println("Eat");
    }

}

class Dog2 extends Animal2 {
//    public void eat() {
//        System.out.println("Eat");
//    }

}
