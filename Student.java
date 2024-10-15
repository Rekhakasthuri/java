import java.util.Scanner;

class Student {
    private int grade;

    public boolean setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
            return true; 
        } else {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            return false; 
        }
    }

    public int getGrade() {
        return grade;
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter the student's grade (0-100): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
                System.out.print("Enter the student's grade (0-100): ");
            }
            int grade = scanner.nextInt();
            validInput = student.setGrade(grade);
        }

        System.out.println("The student's grade is: " + student.getGrade());
        scanner.close();
    }
}
