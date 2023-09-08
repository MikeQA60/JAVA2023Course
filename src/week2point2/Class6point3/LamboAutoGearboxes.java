package week2point2.Class6point3;

//example 1

/*
Lamborghini's automatic gearboxes typically use gear shift paddles mounted behind the steering wheel to allow the driver to control the gear selection manually.
 The gear shift paddles are typically labeled with "+" and "-" signs, indicating upshift and downshift, respectively.

When the driver pulls the "+" paddle, the gearbox will shift up to the next higher gear, while pulling the "-"
paddle will result in a downshift to a lower gear. This allows the driver to have more control over the engine's power and torque, especially during high-performance driving.

Write a program that will store + and - characters in a char variable and prints out the values with a description of what each sign means and does.

____ upShiftSign = _____;
____ downShiftSign = _____;

____ upShiftDescription = _____;
____ downShiftDescription = _____;

//add a system printf() to print out upShiftSign and upShiftDescription
//add a system printf() to print out downShiftSign and downShiftDescription



Expected Output:

+ paddle, the gearbox will shift up to the next higher gear
- paddle will result in a downshift to a lower gear
 */
public class LamboAutoGearboxes {
    public static void main(String[] args) {
       char upShiftSign = '+';
       char downShiftSign = '-';

        String upShiftDescription = "the gearbox will shift up to the next higher gear";
        String downShiftDescription = "will result in a downshift to a lower gear";

        System.out.printf("%c paddle, the gearbox will shift up to the next higher gear",upShiftSign, upShiftDescription);
        System.out.printf("\n%c paddle will result in a downshift to a lower gear", downShiftSign,downShiftDescription);

//add a system printf() to print out upShiftSign and upShiftDescription
//add a system printf() to print out downShiftSign and downShiftDescription
    }


}
