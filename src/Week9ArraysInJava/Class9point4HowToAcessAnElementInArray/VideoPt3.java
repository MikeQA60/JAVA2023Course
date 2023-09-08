package Week9ArraysInJava.Class9point4HowToAcessAnElementInArray;

public class VideoPt3 {
    public static void main(String[] args) {
        int[] arr = {10,13,24,20,10};

        System.out.println(arr[1]); //13

        System.out.println(arr[2]);

        //use the values of elemnets to do some calculations

        int sum = arr[1] + arr[3]; //13 + 20
        System.out.println(sum);

        //i can acess the element and change its values

        arr[4] = 55;
        System.out.println(arr[4]); //55 because we overrode 10 with 55
    }

}
