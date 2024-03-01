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
    
    // Get Comapny Name
    public String getCompanyName() {
        return companyName;
    }
    
    // Set Company Name
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    // Add Employee
    public void addEmployee(Employee employee) {
        staff.add(employee);
    }
    
    // Add new Employee
    public void addNewStaff(Employee newEmployee) {
        staff.add(newEmployee);
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
    
    //Get staff Numbers
    public int getStaffNumber() {
        return staff.size();
    }


    public static void main(String[] args) {
        // Create a Company using different constructors
        Company defaultCompany = new Company();
        Company namedCompany = new Company("NamedCompany");
        Company overloadedCompany = new Company("OverloadedCompany", "John Doe");
        
        // Add employees using the addNewStaff method with updated names
        defaultCompany.addNewStaff(new Employee("Grogu", "grogu@example.com"));
        namedCompany.addNewStaff(new Employee("Luke", "luke@example.com"));
        overloadedCompany.addNewStaff(new Employee("Mandalorian", "mandalorian@example.com"));

        // Display employee details for each company
        defaultCompany.displayEmployeeDetails();
        namedCompany.displayEmployeeDetails();
        overloadedCompany.displayEmployeeDetails();
        
        //Staff numbers fior each company
        System.out.println("Number of employees in defaultCompany: " + defaultCompany.getStaffNumber());
        System.out.println("Number of employees in namedCompany: " + namedCompany.getStaffNumber());
        System.out.println("Number of employees in overloadedCompany: " + overloadedCompany.getStaffNumber());
    }
}
