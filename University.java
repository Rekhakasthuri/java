import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private static int totalStudents = 0;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        totalStudents++;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}

class Course {
    private String title;
    private String code;
    private static int totalCourses = 0;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        totalCourses++;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }
}

public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students to enroll: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            String name = "";
            while (name.isEmpty()) {
                System.out.print("Student Name: ");
                name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("Name cannot be empty. Please enter a valid name.");
                }
            }

            String id = "";
            while (id.isEmpty()) {
                System.out.print("Student ID: ");
                id = scanner.nextLine();
                if (id.isEmpty()) {
                    System.out.println("ID cannot be empty. Please enter a valid ID.");
                }
            }

            new Student(name, id);
        }

        System.out.print("Enter the number of courses to offer: ");
        int numberOfCourses = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Enter details for Course " + (i + 1) + ":");

            String title = "";
            while (title.isEmpty()) {
                System.out.print("Course Title: ");
                title = scanner.nextLine();
                if (title.isEmpty()) {
                    System.out.println("Title cannot be empty. Please enter a valid title.");
                }
            }

            String code = "";
            while (code.isEmpty()) {
                System.out.print("Course Code: ");
                code = scanner.nextLine();
                if (code.isEmpty()) {
                    System.out.println("Code cannot be empty. Please enter a valid code.");
                }
            }

            new Course(title, code);
        }

        System.out.println("\nTotal Students Enrolled: " + Student.getTotalStudents());
        System.out.println("Total Courses Offered: " + Course.getTotalCourses());

        scanner.close();
    }
}
