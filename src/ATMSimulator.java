
import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 0;
        boolean loggedIn = false;

        double balance = 1000.0;

        System.out.println("===== SIMPLE ATM =====");

        while (attempts < 3 && !loggedIn) {
            System.out.print("Enter your PIN: ");
            int enteredPin = input.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                attempts++;

                System.out.println("Incorrect PIN(");
                System.out.println("Remaining attempts: " + (3 - attempts));
            }
        }

        if (!loggedIn) {
            System.out.println("Your account has been blocked.");
        } else {

            int option = 0;

            while (option != 4) {
                System.out.println();
                System.out.println("===== ATM MENU =====");
                System.out.println("1. Check balance");
                System.out.println("2. Deposit money");
                System.out.println("3.Withdraw money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                option = input.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("Current balance: $" + balance);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double deposit = input.nextDouble();

                        if (deposit > 0) {
                            balance = balance + deposit;
                            System.out.println("Deposit successful!");
                            System.out.println("Updated balance: $" + balance);
                        } else {
                            System.out.println("Invalid amount, Deposit must be greater than zero.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawal = input.nextDouble();

                        if (withdrawal <= 0) {
                            System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                        } else if (withdrawal > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance = balance - withdrawal;
                            System.out.println("Withdrawal successful!");
                            System.out.println("Updated balance: $" + balance);
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;

                    default:
                        System.out.println("Invalid option. Please choose 1, 2 3, or 4.");
                }
            }
        }

        input.close();
    }
}

