package Week5NestedIf.Class5point18;

public class SwitchStatmentWithaSingleBodyVideo {
    public static void main(String[] args) {

        //allows user to attach
        //text file such as: .txt, .doc, .doc

        //image file: jpg, png, gif

        //attacghing an image file

        //audio files: .mp2, .wma, .opg
        //attaching an audio file

        String textFormat = ".txt";

        switch (textFormat) {
            case ".txt":
                System.out.println("Attaching a text file");
            break;
            case ".doc":
                System.out.println("Attaching a text file");
                break;
            case ".docx":
                System.out.println("Attaching a text file");
                break;

        }
    }
}
