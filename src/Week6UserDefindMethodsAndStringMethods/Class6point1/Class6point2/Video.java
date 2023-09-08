package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point2;

public class Video {
    public static void main(String[] args) {

        //class video
        //create an obect
      Video obj = new Video();

        //call work method in a character data type
        //saved in a variable
     char var =  obj.work();
     //value of an A char
        System.out.println(var);
    }

    //method instance method
    //return type is char
    public char work() {
        //return only char defined with ' '

        return 'A';

    }
}
