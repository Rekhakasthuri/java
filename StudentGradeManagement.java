import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            return true;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
            return 
                validInput = employee.setSalary(salary);
            } else {
                System.out.println("Invalid input. Please enter a numeric value for salary.");
                scanner.next();
            }
        }

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: $" + employee.getSalary());

        scanner.close();
    }
}