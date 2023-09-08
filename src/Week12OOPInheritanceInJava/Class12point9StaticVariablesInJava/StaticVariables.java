package Week12OOPInheritanceInJava.Class12point9StaticVariablesInJava;

public class StaticVariables {

    public static void main(String[] args) {
        Sample obj1 = new Sample();
        Sample obj2 = new Sample();
        Sample obj3 = new Sample();
        Sample obj4 = new Sample();
        //Sample.count = 10;
        System.out.println(Sample.count); //4

        System.out.println(Sample.companyName); //WEDEVX.CO
       // System.out.println(obj1.count);
       // System.out.println(obj2.count);

    }
}

class Sample {
    public static int count;

    //constance values

    public static String companyName = "WEDEVX.Co";
    //constructer
    public Sample(){
        count++;

    }

}
