/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camarch;

/**
 *
 * @author rubyb
 */
public class CAMarch {
    public static void main(String[] args) {
        // Create default Employee
        Employee employee1 = new Employee();

        // Create Employee with specifics
        Employee employee2 = new Employee("John Doe", "john.doe@example.com");

        System.out.println("Employee 1 Name: " + employee1.getName());
        System.out.println("Employee 2 Email: " + employee2.getEmail());
        System.out.println("Employee 1 EmpNum: " + employee1.getEmpNum());

        // Set email for employee1 (valid)
        employee1.setEmail("new.email@example.com");
        System.out.println("Updated Employee 1 Email: " + employee1.getEmail());

        // Set email for employee2 (invalid)
        employee2.setEmail("ab");
    }

    static class Employee {
 
        private String name;
        private String email;
        private int empNum;

        
        private static int nextEmpNum = 1;

        public Employee() {
            this.name = "Default Name";
            this.email = "default@example.com";
            this.empNum = nextEmpNum;
            nextEmpNum++; // Increment for the next employee
        }

        public Employee(String name, String email) {
            this.name = name;
            this.email = email.length() > 3 ? email : "default@example.com";
            this.empNum = nextEmpNum;
            nextEmpNum++; // Increment for the next employee
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getEmpNum() {
            return empNum;
        }

        // setEmail method
        public void setEmail(String email) {
            if (email.length() > 3) {
                this.email = email;
            } else {
                System.out.println("Email must be longer than 3 characters. Email not updated.");
            }
        }
    }
}
