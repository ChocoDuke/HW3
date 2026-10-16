//Task 6 OddNumbers
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= n);

        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
