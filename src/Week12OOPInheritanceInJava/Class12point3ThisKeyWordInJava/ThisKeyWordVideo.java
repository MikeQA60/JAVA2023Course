package Week12OOPInheritanceInJava.Class12point3ThisKeyWordInJava;

public class ThisKeyWordVideo {
    public static void main(String[] args) {
        MusicAlbum mc = new MusicAlbum("If you are reading this it's too late", "Drake", 2014, false);
        System.out.println(mc.isForKids); //false
        System.out.println(mc.title); //If you are reading this it's too late

        MusicAlbum mc2 = new MusicAlbum("Graduation", "Kanye West", 2010, false);
        System.out.println(mc2.artist); //Kanye West

    }
}

class MusicAlbum {

    public String title;
    public String artist;
    public int yearReleased;
    public boolean isForKids;

//    public MusicAlbum(String albumTitle, String albumArtist,
//                      int albumYearReleased, boolean isAlbumForKids) {
//
//        title = albumTitle;
//        artist = albumArtist;
//        yearReleased = albumYearReleased;
//        isForKids = isAlbumForKids;
//        }


    //this keyword helps you access the instance variables
    //of your current class.
    //this keyword helps differciate between method or constructor params
    //an instance variables
    //it helps us avoid redudancy in variable naming
public MusicAlbum(String title, String artist, int yearReleased, boolean isForKids) {

    //when you use
    //variable name

    this.title = title;
    artist = artist;
    this.artist = artist;
    this.yearReleased = yearReleased;
    this.isForKids = isForKids;

   }

}
