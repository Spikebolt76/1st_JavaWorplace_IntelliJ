import java.util.Scanner;

public class Arrays_multiDimArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display Menu
        System.out.println("===== ARRAY CONCEPT REVISION PROGRAM =====");
        System.out.println("1. Demonstrate Single-Dimensional Arrays");
        System.out.println("2. Demonstrate Multi-Dimensional Arrays");
        System.out.println("3. Perform Common Array Operations");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                demonstrateSingleDimensionalArray();
                break;
            case 2:
                demonstrateMultiDimensionalArray();
                break;
            case 3:
                performArrayOperations();
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

    // Method to demonstrate single-dimensional arrays
    public static void demonstrateSingleDimensionalArray() {
        System.out.println("\n===== SINGLE-DIMENSIONAL ARRAYS =====");

        // Initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Access and modify an element
        System.out.println("Accessing second element: " + numbers[1]);
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Display array using a loop
        System.out.println("Iterating through array using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }

    // Method to demonstrate multi-dimensional arrays
    public static void demonstrateMultiDimensionalArray() {
        System.out.println("\n===== MULTI-DIMENSIONAL ARRAYS =====");

        // Initialize a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Display the 2D array
        System.out.println("2D Array Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Access and modify an element
        System.out.println("Accessing element at (1,1): " + matrix[1][1]);
        matrix[1][1] = 50;
        System.out.println("Modified element at (1,1): " + matrix[1][1]);

        // Display modified array
        System.out.println("Modified 2D Array:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to perform common array operations
    public static void performArrayOperations() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== COMMON ARRAY OPERATIONS =====");

        // Take array input from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the array
        System.out.println("Array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Find maximum and minimum
        int max = array[0], min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Calculate sum and average
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Search for an element
        System.out.print("Enter an element to search: ");
        int searchElement = scanner.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == searchElement) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element found!" : "Element not found!");
    }
}
