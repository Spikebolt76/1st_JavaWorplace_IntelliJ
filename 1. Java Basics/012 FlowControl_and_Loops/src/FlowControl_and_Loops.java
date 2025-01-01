import java.util.Scanner;

public class FlowControl_and_Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display Menu
        System.out.println("===== JAVA CONCEPT REVISION PROGRAM =====");
        System.out.println("1. Demonstrate Loops");
        System.out.println("2. Demonstrate Conditional Statements");
        System.out.println("3. Demonstrate Switch Case");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                demonstrateLoops();
                break;
            case 2:
                demonstrateConditionals();
                break;
            case 3:
                demonstrateSwitchCase();
                break;
            case 4:
                System.out.println("Exiting... Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Try again.");
        }

        scanner.close();
    }

    // Method to demonstrate loops
    public static void demonstrateLoops() {
        System.out.println("\n===== LOOPS DEMONSTRATION =====");

        // FOR Loop: Print numbers 1 to 5
        System.out.println("FOR Loop: Numbers 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // WHILE Loop: Sum of numbers from 1 to 5
        System.out.println("WHILE Loop: Sum of numbers from 1 to 5");
        int sum = 0, num = 1;
        while (num <= 5) {
            sum += num;
            num++;
        }
        System.out.println("Sum: " + sum);

        // DO-WHILE Loop: Print numbers 5 to 1
        System.out.println("DO-WHILE Loop: Numbers 5 to 1");
        int count = 5;
        do {
            System.out.print(count + " ");
            count--;
        } while (count > 0);
        System.out.println();
    }

    // Method to demonstrate conditional statements
    public static void demonstrateConditionals() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===== CONDITIONAL STATEMENTS =====");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // IF-ELSE Statements
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested IF
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }

        // Ternary Operator
        String result = (number > 0) ? "Positive Number" : "Non-positive Number";
        System.out.println("Ternary Result: " + result);
    }

    // Method to demonstrate switch-case
    public static void demonstrateSwitchCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===== SWITCH-CASE DEMONSTRATION =====");
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        // SWITCH-CASE
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
    }
}
