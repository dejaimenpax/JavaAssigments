package Ejercicio5;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        id = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter employee name: ");
        name = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        salary = scanner.nextDouble();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter employee designation: ");
        designation = scanner.nextLine();

        setId(id);
        setName(name);
        setDesignation(designation);
        setSalary(salary);

        scanner.close();
    }

    public void calSalary() {
        if (designation.equalsIgnoreCase("manager")) {
            salary += 5000;
        } else if (designation.equalsIgnoreCase("developer")) {
            salary += 3000;
        } else {
            salary += 1000;
        }
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
        System.out.println("Designation details: " + designation);
    }
    
}
