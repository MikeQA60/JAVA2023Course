package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point21StringStartsWithandEndWith;

public class EstablishASecureConnection {

    public static void main(String[] args) {

    }

    public static void checkURL(String url) {
        if (url.startsWith("https://")){
            System.out.println("Establishing a secure connection");
        }
        else if (url.startsWith("http://")) {
            System.out.println("Establishing an insecure connection");

        } else {
            System.out.println("Bad connection request");
        }
    }
}
