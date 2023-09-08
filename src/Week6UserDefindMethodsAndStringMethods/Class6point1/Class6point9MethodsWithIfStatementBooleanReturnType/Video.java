package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point9MethodsWithIfStatementBooleanReturnType;

public class Video {

    public static void main(String[] args) {

//save in boolean
   boolean scenario1  =  isEligibleForDiscount(20, true);

   //200 and false = true
        //20 and false = false
        //20 and true = true bc memer
        System.out.println(scenario1);

}

//create a method that takes spent amount and wheter the client is rewards member(true/false)
//return true if the client is a reward member or if the client spent more than 100 otherwise false
      // take double and boolean
public static boolean isEligibleForDiscount(double amountSpent, boolean isMemberMember) {

        //if statements be careful with what you return
    if(amountSpent>100 || isMemberMember){
      return true;
    }
    //otherwise
    else {

return false;
    }
}
}


