// Base class (Parent class)
class Employee {
    String name;
    int empId;
    double salary;

    // Constructor for Employee
    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Derived class (Child class) - Inherits from Employee
class Manager extends Employee {
    String department;

    // Constructor for Manager, using super() to call the parent constructor
    Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary); // Calls the Employee constructor
        this.department = department;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails(); // Calls the parent class method
        System.out.println("Department: " + department);
    }
}

// Main class
public class ExplainInheritance {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee("Alice", 101, 50000);
        System.out.println("Employee Details:");
        emp1.displayDetails();
        System.out.println();

        // Creating a Manager object
        Manager mgr1 = new Manager("Bob", 201, 80000, "IT");
        System.out.println("Manager Details:");
        mgr1.displayDetails();
    }
}
