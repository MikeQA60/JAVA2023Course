package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point2;

public class VideoPt2 {
    public static void main(String[] args) {

        VideoPt2 obj = new VideoPt2();

       //call work method in a character data type
                //saved in a variable        returns f
        char gender = obj.getGender();

        //save
        System.out.println(gender);
    }

    //method instance method
    //return type is char
    public char getGender() {
        //return only char defined with ' '
        return 'F';


    }
}
