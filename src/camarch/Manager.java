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
public class Manager extends Employee {
    private String username;
    private String password;

    // Default
    public Manager() {
        super(); // Invoke the default constructor of the superclass (Employee)
        this.username = "defaultManagerUsername";
        this.password = "defaultManagerPassword";
    }

    // Constructor for a manager
    public Manager(String name, String email, String username, String password) {
        super(name, email); // Invoke a specific constructor of the superclass (Employee)
        this.username = username;
        this.password = password;
    }

    // Getters and setters for username and password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

