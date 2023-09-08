package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point7ToStringMethodInJava;

public class FinalyKeyWordVideo {

    public static void main(String[] args) {
        //final keyword in java
        //1) variables can be declared as final - that means the variable can only be initialized once
        //2) class can be decalred final --> that means no other class can extend from that class
        //3) a method can be declared final --> the method can not be overriden.

        Animal2 obj = new Animal2();
        String str = obj.toString();
        System.out.println(str);
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

