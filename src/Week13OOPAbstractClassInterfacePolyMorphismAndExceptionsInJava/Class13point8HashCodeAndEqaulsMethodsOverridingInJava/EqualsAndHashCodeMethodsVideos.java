package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point8HashCodeAndEqaulsMethodsOverridingInJava;

import java.util.Objects;

public class EqualsAndHashCodeMethodsVideos {

    public static void main(String[] args) {
        Person1 p = new Person1("Elon", 52);
        Person1 p2 = new Person1("Elon",12);

        System.out.println(p == p2); //by default comparing if two objects are the same
        //both pointing to the same memory location.
        System.out.println(p.equals(p2)); //by default comparing if two objects are the same
        //both pointing to the same memory location.

    }
}

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return  "Person1{" +
                "name='" + name + '\'' +
                ",age=" + age +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);

    }

    //if the obj in the param has the instance variables with the same value
    //of my current object
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        //down casting
        Person1 other = (Person1) obj;
        return Objects.equals(name, other.getName()) && age == other.getAge();

    }
}

