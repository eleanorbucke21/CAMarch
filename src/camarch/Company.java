/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camarch;

import camarch.CAMarch.Employee;
import java.util.ArrayList;

/**
 *
 * @author rubyb
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> staff;
    
    //Default
    public Company() {
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();
    }

    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void addEmployee(Employee employee) {
        staff.add(employee);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee details for " + companyName + ":");
        for (Employee employee : staff) {
            displayEmployeeDetails(employee);
        }
    }

    private static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Email: " + employee.getEmail());
        System.out.println("Employee EmpNum: " + employee.getEmpNum());
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a Company
        Company myCompany = new Company("MyCompany");

        // Add employees
        Employee employee1 = new Employee("John Doe", "john.doe@example.com");
        Employee employee2 = new Employee("Jane Smith", "jane.smith@example.com");

        myCompany.addEmployee(employee1);
        myCompany.addEmployee(employee2);

        // Display employee details
        myCompany.displayEmployeeDetails();
    }
}
