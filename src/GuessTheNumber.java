//Task 2

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 1;
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < 5 && !guessedCorrectly) {
            System.out.print("Угадай секретное число: ");
            int guess = scanner.nextInt();

            attempts++;

            if (guess == secretNumber) {
                guessedCorrectly = true;
                System.out.println("Congrats! You guessed correctly!");
            } else {
                System.out.println("Неправильно(");

                if (attempts < 5) {
                    System.out.println("Оставшиеся попытки: " + (5 - attempts));
                }
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Game over! The secret number was " + secretNumber);
        }

        scanner.close();
    }
}
