package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point1MethodOverridingInJava;

public class MethodOverridingVideo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.eat();
        d.getNumLegs();

        Animal animal = new Animal();
        animal.makeSound();

    }
}

class Animal {

    public void getNumLegs() {
        System.out.println("4 legs");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal {

    //rules for overrdie

    //annotation info about a method
    //can override about method, instance variable, constructor or classses
    @Override
    public void makeSound() {
        System.out.println("Bark Bark");
    }


}