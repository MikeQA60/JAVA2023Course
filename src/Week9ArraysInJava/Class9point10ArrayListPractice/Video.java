package Week9ArraysInJava.Class9point10ArrayListPractice;

public class Video {

    public static void main(String[] args) {

        //create a string array of AI researchers
        //(e.g. , "Geoffrey Hinton", "Yann LeCun", "Andrew Ng", "Fei-Fei Li"

        //print out last names of each researcher

        //Hinton , Lecun, Ng, Li
        String[] aiResearchersArr = {"Geoffrey Hinton","Yann LeCun", "Andrew Ng", "Fei-Fei Li"};

        //first find a solution for one string

        String geoffrey = "Geoffrey Hinton";
       int indexOfSpace = geoffrey.indexOf(' ');
        System.out.println(indexOfSpace);
        System.out.println(geoffrey.substring(indexOfSpace+1));


        for (int i = 0; i<aiResearchersArr.length;i++) {
            String fullName = aiResearchersArr[i];
            int index = fullName.indexOf(' ');
            System.out.println(geoffrey.substring(index+1));
        }
    }
}
