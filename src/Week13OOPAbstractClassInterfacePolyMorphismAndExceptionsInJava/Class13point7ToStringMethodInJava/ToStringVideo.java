package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point7ToStringMethodInJava;

public class ToStringVideo {
    public static void main(String[] args) {
        Person p = new Person("Elon", 52);
//        System.out.println(p.getName());
//        System.out.println(p.getAge());


        //internally- println() method calls the toString method of the object
       // System.out.println(p);
        System.out.println(p.toString());

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

    //to string
    @Override
    public String toString() {
        return "name: " + name + "\nage: " + age;
    }
}
