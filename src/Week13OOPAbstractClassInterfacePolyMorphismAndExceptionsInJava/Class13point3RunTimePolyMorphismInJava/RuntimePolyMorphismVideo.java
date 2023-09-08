package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point3RunTimePolyMorphismInJava;

public class RuntimePolyMorphismVideo {

    //first check if the data type class
    //contains the method you are trying to call
    //if it doesnt your code is not going to compile
    public static void main(String[] args) {
        Animal1 a = new Dog1();
        a.makeSound();


    }
}

class Animal1 {
    public void makeSound() {
        System.out.println("");
    System.out.println("Parent Class");
    }
}

class Cat extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Meow!!!");
    }

}

class Dog1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Woof!!!");

    }
}