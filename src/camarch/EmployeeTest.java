/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camarch;

import camarch.CAMarch.Employee;

/**
 *
 * @author rubyb
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // Create specific Employee details
        Employee employee1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee employee2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee employee3 = new Employee("Tom Thumb", "tt@gmail.com");
        
        // Declare an array to store Employee
        Employee[] projectGroup = new Employee[3];

        // Load the array with Employees
        projectGroup[0] = employee1;
        projectGroup[1] = employee2;
        projectGroup[2] = employee3;

        // Display details for each employee
        for (Employee employee : projectGroup) {
            displayEmployeeDetails(employee);
        }
        
        // Details for each employee
        displayEmployeeDetails(employee1);
        displayEmployeeDetails(employee2);
        displayEmployeeDetails(employee3);
    }

    // Display employee details
    private static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Email: " + employee.getEmail());
        System.out.println("Employee EmpNum: " + employee.getEmpNum());
        System.out.println();
    }
}