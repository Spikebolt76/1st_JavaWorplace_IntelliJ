import java.util.ArrayList;
import java.util.Scanner;

public class Employee_Management {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Update Employee Name");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new employee
                    System.out.print("Enter employee name to add: ");
                    String newEmployee = scanner.nextLine();
                    employees.add(newEmployee);
                    System.out.println(newEmployee + " added successfully.");
                    break;

                case 2:
                    // Remove an employee by name
                    System.out.print("Enter employee name to remove: ");
                    String removeEmployee = scanner.nextLine();
                    if (employees.remove(removeEmployee)) {
                        System.out.println(removeEmployee + " removed successfully.");
                    } else {
                        System.out.println(removeEmployee + " not found in the list.");
                    }
                    break;

                case 3:
                    // Search for an employee by name
                    System.out.print("Enter employee name to search: ");
                    String searchEmployee = scanner.nextLine();
                    if (employees.contains(searchEmployee)) {
                        System.out.println(searchEmployee + " is in the list.");
                    } else {
                        System.out.println(searchEmployee + " not found.");
                    }
                    break;

                case 4:
                    // Display all employees
                    System.out.println("List of Employees:");
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (String employee : employees) {
                            System.out.println(employee);
                        }
                    }
                    break;

                case 5:
                    // Update an employee's name
                    System.out.print("Enter current employee name to update: ");
                    String currentName = scanner.nextLine();
                    if (employees.contains(currentName)) {
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        employees.set(employees.indexOf(currentName), newName);
                        System.out.println(currentName + " updated to " + newName + ".");
                    } else {
                        System.out.println(currentName + " not found.");
                    }
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting Employee Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
