package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point9IntroToAbstraction;

public class AbstractionIntroVideo {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal c = new Cat();

        a.makeSound();
        c.makeSound();

    }
}

//1. when you want to restrict the ability to create objects from parent class
//2. Abstract classes can not be instiated
//you cannot create an object from abstract class
//the whole purpose of abstract
//its to serve as a parent class that stores all
//common behavior and properties


abstract class Animal {

    //problem 2:
    //when you want to create a method in the parent class
    //to enable polymorphism
    //and you know that every single child class
    //MUST override that method logic
    //you can declare abstract method


    //abstract methods
    //can only be declared in abstract classed or interfaces
    //abstract methods dont have a body
    //abstract methods are meant to be overridden in
    // concrete subclasses
    public abstract void makeSound();

    }


//if the subclass is extending the abstract class that has abstract methods
//the concrete subclass must override all inherited abstract methods
//otherwise the code doesnt compile

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {

        System.out.println("Meow!");

    }
}