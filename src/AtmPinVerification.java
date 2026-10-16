//Task 1: ATM PIN Verification

import java.util.Scanner;

public class AtmPinVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 0;
        boolean accessGranted = false;

        while (attempts < 3 && !accessGranted) {
            System.out.print("Pleeeasee Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            attempts = attempts + 1;

            if (enteredPin == correctPin) {
                accessGranted = true;
                System.out.println("Correct PIN) Access granted!");
            } else {
                System.out.println("Incorrect PIN(");
            }
        }

        if (!accessGranted) {
            System.out.println("Card blocked(((");
        }

        scanner.close();
    }
}