package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point10MethodsWithMultParamsAndStringRetrunType;

/*
Methods With Multiple Parameters and String Return Type

Learn to create flexible and powerful functions that take multiple parameters and return string values
 with this comprehensive course on Methods With Multiple Parameters and String Return Type
 */
public class Video {
    public static void main(String[] args) {

        //static method so call login
        //save in string
      String str = login("alex@gmail.com", "Hello123");
      //print out result of login message
        System.out.println(str);

      String str2 =login("hello@wedevx.co", "ABC123$$");
        System.out.println(str2);




}

//write a method that takes a username and password
//and returns welcome username if the username and the password match with

//hello@wedevx.co
//ABC123$$
//if the
// username or the pass doesnt match then we return "invalid username or password

    //
public static String login(String username, String password) {
        //write logic

    if(username.equals("hello@wedevx.co") && password.equals("ABC123$$")) {

        //welcome message
        return "welcome" + username;

    } else {

        //
        return "invalid username or password.";

    }
}
}
