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
    
    // Overloaded constructor with a name parameter
    public Company(String companyName, String name) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
        // Additional logic for handling the provided name, if needed
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
        // Create a Company using different constructors
        Company defaultCompany = new Company();
        Company namedCompany = new Company("NamedCompany");
        Company overloadedCompany = new Company("OverloadedCompany", "John Doe");

        // Display employee details for each company
        defaultCompany.displayEmployeeDetails();
        namedCompany.displayEmployeeDetails();
        overloadedCompany.displayEmployeeDetails();
    }
}
