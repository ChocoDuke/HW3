//Задание5: a simple grading system application
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student grading system" );
        System.out.print("Enter your points");
        System.out.println();

        System.out.print("Attendance points(0-10): ");
        int attendance = scanner.nextInt();

        System.out.print("Homework points (0-60):");
        int homework = scanner.nextInt();

        System.out.print("Exam points (0-30):");
        int exam = scanner.nextInt();

        System.out.println();

        if (attendance < 0 || attendance > 10) {
            System.out.print("Attendance must be a whole number from 0 to 10.");
            System.out.println("Run the program again and enter a valid number");
        } else if (homework < 0 || homework > 60) {
            System.out.print("Homework must be a whole number from 0 to 60");
            System.out.println("Run the program again and enter a valid number");
        } else if (exam < 0 || exam > 30) {
            System.out.print("Exam must be a whole number from 0 to 30.");
            System.out.println("Run the program again and enter a valid number.");
        } else {
            int total = attendance + homework + exam;

            boolean totalOk = total > 65;
            boolean attendanceOk = attendance >= 6;
            boolean examOk = exam >= 17;

            System.out.print("Attendance: " + attendance + " / 10");
            System.out.print("Homework: " + homework + " / 60");
            System.out.print("Exam: " + exam + " / 30");
            System.out.print("Total: " + total + " / 100");
            System.out.println();

            if (totalOk && attendanceOk && examOk) {
                System.out.print("Result: Passed");
                System.out.print("You have more than 65 points in total,");
                System.out.println("at least 6 attendance points, and at least 17 exam points.");
            } else {
                System.out.print("Result: failed");
                System.out.print("To pass, all three conditions must be true:");

                if (totalOk) {
                    System.out.println("- Total: OK. You have " + total + " points (need more than 65).");
                } else {
                    System.out.println("- Total: not enough. You have " + total + " points (need more than 65).");
                }

                if (attendanceOk) {
                    System.out.println("- Attendance: OK. You have " + attendance + " points (need at least 6).");
                } else {
                    System.out.println("- Attendance: not enough. You have " + attendance + " points (need at least 6).");
                }

                if (examOk) {
                    System.out.println("- Exam: OK. You have " + exam + " points (need at least 17).");
                } else {
                    System.out.println("- Exam: not enough. You have " + exam + " points (need at least 17).");
                }
            }
        }

        scanner.close();
    }
}
