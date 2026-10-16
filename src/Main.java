import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        //Task 1
        int j = 1;
        while (j <= 1000) {
            j *= 10;
            System.out.println(j);
}
        //Task 2
        for(int i = 5; i <=1000; i *= 10)
            System.out.println("\ni");

        //Task 4
        while (true) {
            System.out.println("This loop never stops");
        }

       //Task 7
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
             */

        //Task 3
        int n = scanner.nextInt();
        System.out.print("Введите число N");
        int i = 1;
        while (i <= n) {
            System.out.print("Цикл While:");
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.print("Cycle Do-While:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();

        System.out.print("Cycle For:");
        for (i = 1; i<= n; i++)
            System.out.print(i);
        System.out.println();

        scanner.close();

    }
}
