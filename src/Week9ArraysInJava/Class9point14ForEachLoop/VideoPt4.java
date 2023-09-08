package Week9ArraysInJava.Class9point14ForEachLoop;

public class VideoPt4 {
    public static void main(String[] args) {

        String[] arr = {"cat", "dog", "horse"};

        for (String str : arr) {
            if (!str.equals("horse")) {
                System.out.println(str);  //cat, dog, horse

            }
        }
    }
}
