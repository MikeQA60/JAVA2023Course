package Week5NestedIf.Class5point27;

public class Pt2Video {

    public static void main(String[] args) {

       double taxTobePAid =  calculateTax();
        System.out.println(taxTobePAid);

    }


        public static double calculateTax() {
            double salary = 100000;
            double tax = 0.1;

            return salary*tax;
            }
        }

