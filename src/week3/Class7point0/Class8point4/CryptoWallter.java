package week3.Class7point0.Class8point4;

import java.util.Scanner;

public class CryptoWallter {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the crypto wallet ID of a receiver: ");
        String enterPlateNumber = scanner.nextLine();
        String walletid = "0x742d35Cc6634C0532925a3b844Bc454e4438f44e ";
        boolean tap = enterPlateNumber.equals(walletid);
        System.out.println("Transaction Approved: " + tap);

}
}
