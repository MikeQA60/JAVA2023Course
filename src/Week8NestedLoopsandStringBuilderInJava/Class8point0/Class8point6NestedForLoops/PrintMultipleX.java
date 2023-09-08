package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point6NestedForLoops;

public class PrintMultipleX {
    public static void main(String[] args) {

    }
    public static void printMultipleX(int m, int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print("X");
            }
            System.out.print(" ");
        }
    }
}
