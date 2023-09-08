package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point19MultipleCatchBlocksInJavaExceptions;

public class MultipleCatchBlocksVideo {
    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        //imagine there is one try block
        //where there are 2 problematic statements

        try {
            System.out.println("Try start");
            // double result = 10/0;
            String var = null;
            //NullPointerException
            var.toLowerCase();
            System.out.println("Done with String");
            Class.forName("fgfgfhffh");
            System.out.println("Done with Class for Name");
            double result = 10 / 0;
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

        } catch (ClassNotFoundException e) {
            System.out.println("Couldnt find the class");


        } catch (NullPointerException e) {
            System.out.println("Second catch");
            System.out.println(e);


            //"global catch": catch(Exception e) {
        }
    }
}

