package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point11MethodsWithMultipleParansandCharReturnType;

public class Video {
    public static void main(String[] args) {
// save grade
     char grade =   calculateExamResult(90,85,100);
        System.out.println(grade);

        char grade2 = calculateExamResult(70,20,46);
        System.out.println(grade2);

        char grade3 = calculateExamResult(1000,2000,100);
        System.out.println(grade3);

}

//the user is going to provide the test scroe for 3 exams in as an int
// and write a method that returns A if the average of those 3 scores is more than 90

//b if its more than 80
//c if its more than 70
//d if its more than 60
//f if its less than 6
//b if its more than 80

//data type is char
public static char calculateExamResult(int score1, int score2, int score3) {

    //int and average of all then divide
    int average = (score1 + score2 + score3) / 3;
    //compare with if
    //less or

    if (average<=100 && average>=90) {
        return 'A';
    }
        else if(average<90 && average>=80) {
            return 'B';
    }
        else if(average<80 && average>=70) {
            return 'C';
    }
        else if (average<70 && average>=60){
           return 'D';
        }
        else if (average<60) {
            return 'F';

    }
        else {
        System.out.println("Given score were wrong");
            //
            return '0';
    }
}
}
