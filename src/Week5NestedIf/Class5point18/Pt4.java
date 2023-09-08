package Week5NestedIf.Class5point18;

public class Pt4 {
    public static void main(String[] args) {

        String textFormat = ".java";

        switch (textFormat) {
            case ".txt":
            case ".doc":
            case ".docx":
                System.out.println("Attaching a text file");
                break;

            case ",jpg":
            case ".png":
            case".gif":
                System.out.println("Sending an image file");
                break;

            case ".mp3":
            case ".wma":
            case".ogg":
                System.out.println("Sending an audio file");
                break;

            default:
            System.out.println(textFormat + " is an Unsupported file type");

        }
    }
}

