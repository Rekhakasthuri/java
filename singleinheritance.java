import java.util.*;

class Person 
{
String name;
int age;

void displayperson_details() 
{
System.out.println("EMPLOYEE DETAILS USING SINGLE INHERITANCE");

System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}

class Employee extends Person 
{
int employeeID;
String Dept;

void displayemp_details() 
{
System.out.println("EmployeeID: " + employeeID);
System.out.println("Department: " + Dept);
}
}

public class singleinheritance 
{
public static void main(String[] args) 
{
System.out.println(" ");
System.out.println("SINGLE INHERITANCE");
System.out.println(" ");

Scanner input = new Scanner(System.in);
        
System.out.println("Enter the name:");
String name = input.nextLine();
        
System.out.println("Enter the age:");
int age = input.nextInt();
        
System.out.println("Enter the employeeID:");
int employeeID = input.nextInt();
        
input.nextLine();         
System.out.println("Enter the Department:");
String Dept = input.nextLine();
        
Employee emp = new Employee();
emp.name = name;
emp.age = age;
emp.employeeID = employeeID;
emp.Dept = Dept;
        
emp.displayperson_details();
emp.displayemp_details();
}
}