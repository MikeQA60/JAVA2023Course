package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point9MapClearMethod;

import java.util.HashMap;
import java.util.Map;

public class SwitchBinaries {
    public static void main(String[] args) {


    }

    public static Map<Integer, Boolean> binarySwitching(String binaryStr) {
        // Create a map to store the results
        Map<Integer, Boolean> binarySwitchMap = new HashMap<>();

        // Initialize the current value based on the first character of the input
        boolean currentValue = binaryStr.charAt(0) == '1';

        // Iterate through each character in the binaryStr
        for (int i = 0; i < binaryStr.length(); i++) {

            //inaryStr: This is the input string from which you want to extract a character.
            //.charAt(i): This is a method used on a string to access the character at a specific index (i).
            // The index is zero-based, meaning the first character is at index 0, the second at index 1, and so on.
            //char ch: This declares a variable named ch of type char to store the character retrieved from the string.
            char ch = binaryStr.charAt(i);

            // Determine the new switch value based on the current character
            boolean switchValue = ch == '1';

            // If the switch value is different from the current value, clear the map and update the current value
            if (switchValue != currentValue) {
                binarySwitchMap.clear();
                currentValue = switchValue;
            }

            // Store the current value in the map at the current index
            binarySwitchMap.put(i, currentValue);
        }

        // Return the map containing the binary switching results
        return binarySwitchMap;
    }
}


    // The method takes a binaryStr as input and returns a map containing binary switching results.

   // A HashMap called binarySwitchMap is created to store the results. The key represents the index in the input string, and the value represents the current binary switch state.

    //The initial value of currentValue is determined based on the first character of the input string. If the first character is '1', currentValue is set to true; otherwise, it's set to false.

    //The code then iterates through each character in the binaryStr.

    //Inside the loop, the variable ch stores the current character being processed.

    //The switchValue is determined based on whether the current character is '1' or not.

    //If the switchValue is different from the currentValue, it means a switch in the binary state has occurred. In this case, the binarySwitchMap is cleared (all previous values are removed), and the currentValue is updated to the new switchValue.

    //Regardless of whether a switch occurred or not, the currentValue is stored in the binarySwitchMap at the current index (i).

    //After processing all characters, the map containing the binary switching results is returned.

//The purpose of this code is to identify the locations in a binary string where there is a change in the binary value
// and store this information in a map. The map's keys represent the positions where the switching occurs,
// and the values indicate the binary state after the switch.