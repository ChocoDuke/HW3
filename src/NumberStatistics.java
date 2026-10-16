//task3 Number Statistics

import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int even = 0;
        int odd = 0;

        int i = 1;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number > 0) {
                positive = positive + 1;
            } else if (number < 0) {
                negative = negative + 1;
            } else {
                zeros = zeros + 1;
            }

            if (number % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }

            i = i + 1;
        }

        System.out.println();
        System.out.println("===== STATISTICS =====");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        scanner.close();
    }
}
