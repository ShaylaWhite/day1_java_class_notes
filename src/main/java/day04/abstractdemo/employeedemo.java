package day04.abstractdemo;

// Abstract class "Person" representing a person's basic information
abstract class Person {
    private final String name;
    private final int age;

    // Constructor for initializing name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented by subclasses to display person's information
    public abstract void displayInfo();

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Abstract class "Employee" extending "Person" and representing an employee's information
abstract class Employee extends Person {
    private final int employeeId;
    private final double salary;

    // Constructor for initializing employee's information
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Abstract method to be implemented by subclasses to calculate employee's salary
    public abstract void calculateSalary();

    // Getter methods for employeeId and salary
    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}

// Concrete class "FullTimeEmployee" extending "Employee"
class FullTimeEmployee extends Employee {

    private final double bonus;

    // Constructor for initializing full-time employee's information
    public FullTimeEmployee(String name, int age, int employeeId, double salary, double bonus) {
        super(name, age, employeeId, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Full-time Employee: " + getName() + ", Age " + getAge());
    }

    @Override
    public void calculateSalary() {
        double salary = getSalary() + bonus;
        System.out.println("Total salary for full-time employee " + getName() + " : " + salary);
    }
}

// Main class to demonstrate the usage of the classes
public class employeedemo {
    public static void main(String[] args) {
        // Creating a FullTimeEmployee instance with name, age, employeeId, salary, and bonus
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Alice", 28, 10001, 50000, 10000);

        // Calculate and display the total salary for the employee
        fullTimeEmployee1.calculateSalary();

        // Display the information about the employee
        fullTimeEmployee1.displayInfo();
    }
}


