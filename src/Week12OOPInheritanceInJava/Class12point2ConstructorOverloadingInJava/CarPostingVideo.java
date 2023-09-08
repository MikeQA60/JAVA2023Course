package Week12OOPInheritanceInJava.Class12point2ConstructorOverloadingInJava;

public class CarPostingVideo {

    public String make;
    public String model;
    public int year;
    public double askingPrice;
    public int mileage;
    public String drive;
    public String color;
    public boolean isCleanTitle;

    //constructors are used to initialize an object
    //and initialize the instance variables (characteristics)

    public CarPostingVideo(String carMake, String carModel, int carYear, double carAskingPrice,
                           int carMileage, String carDrive, String carColor,
                           boolean isCarCleanTitle) {

        make = carMake;
        model = carModel;
        year = carYear;
        askingPrice = carAskingPrice;
        mileage = carMileage;
        drive = carDrive;
        color = carColor;
        isCleanTitle = isCarCleanTitle;


    }

    //constructor overloading gives you an ability to create multiple
    //constructors with different set of parameters

    public CarPostingVideo(String carMake, String carModel, int carYear, double carAskingPrice) {
        make = carMake;
        model = carModel;
        year = carYear;
        askingPrice = carAskingPrice;


    }

    public CarPostingVideo(double carAskingPrice, int carMileage){
        askingPrice = carAskingPrice;
        mileage = carMileage;

    }
}

class Main4 {
    public static void main(String[] args) {

        //firstObject
        CarPostingVideo post1 = new CarPostingVideo("Ferrari", "418", 2022,
                350000.00, 100, "RWD", "Red", true);

        System.out.println(post1.askingPrice);
        System.out.println(post1.color);

        CarPostingVideo post2 = new CarPostingVideo("Rolls Royce", "Cullinan", 2023, 450000.00);


        CarPostingVideo post3 = new CarPostingVideo(1000.00, 50000);

        System.out.println(post2.askingPrice); //450000.0
        System.out.println(post3.mileage); //5000


        System.out.println(post2.color); //null

    }
}
