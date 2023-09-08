package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point21StringStartsWithandEndWith;

public class Videopt2 {
    public static void main(String[] args) {

        String str4 = "sent to Elon Musk: Hi Elon I am a big fan of yours!";

       boolean b = str4.startsWith("send to Elon Musk"); //returns false bc of mispelling
        System.out.println(b);

        boolean c = str4.startsWith("sent to Elon Musk"); //returns true
        System.out.println(c);

    }
}
