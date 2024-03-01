/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camarch;

/**
 *
 * @author rubyb
 */
import camarch.CAMarch.Employee;
import java.util.Scanner;

public class ManagerConsole {
    private static final String MANAGER_USERNAME = "Gnomeo";
    private static final String MANAGER_PASSWORD = "smurf";

    private Scanner scanner;
    private Company company;

    public ManagerConsole(Scanner scanner, Company company) {
        this.scanner = scanner;
        this.company = company;
    }

    public void run() {
        // Login
        System.out.println("Manager Login");
        System.out.print("Username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Password: ");
        String enteredPassword = scanner.nextLine();

        if (login(enteredUsername, enteredPassword)) {
            System.out.println("Login successful!\n");

            // Menu
            int choice;
            do {
                System.out.println("Menu:");
                System.out.println("1. View Current Staff");
                System.out.println("2. Add New Staff");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        // View Current Staff
                        company.displayEmployeeDetails();
                        break;
                    case 2:
                        // Add New Staff
                        addNewStaff();
                        break;
                    case 3:
                        System.out.println("Exiting. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 3);
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
    }

    private boolean login(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(MANAGER_USERNAME) && enteredPassword.equals(MANAGER_PASSWORD);
    }

    private void addNewStaff() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee email: ");
        String email = scanner.nextLine();

        Employee newEmployee = new Employee(name, email);
        company.addNewStaff(newEmployee);

        System.out.println("New employee added successfully!");
    }
 public static void main(String[] args) {
        // Create a Company using different constructors
        Company namedCompany = new Company("NamedCompany");

        // Add employees using the addNewStaff method with updated names
        namedCompany.addNewStaff(new Employee("Luke", "luke@example.com"));

        // Display employee details for namedCompany
        namedCompany.displayEmployeeDetails();

        // Create a ManagerConsole for namedCompany
        Scanner scanner = new Scanner(System.in);
        ManagerConsole managerConsole = new ManagerConsole(scanner, namedCompany);

        // Run the ManagerConsole
        managerConsole.run();

        // Close the scanner
        scanner.close();
    }
}

