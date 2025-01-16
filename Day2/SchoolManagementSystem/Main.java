import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); 
        Student student = new Student(name, rollNumber);

        while (true) {
            System.out.println("\n--- School Management System ---");
            System.out.println("1. Add Grade");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Display Student Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter grade to add: ");
                    int grade = scanner.nextInt();
                    student.addGrade(grade);
                    System.out.println("Grade added successfully.");
                    break;

                case 2:
                    student.markAttendance();
                    System.out.println("Attendance marked successfully.");
                    break;

                case 3:
                    System.out.println("\n--- Student Details ---");
                    student.displayDetails();
                    break;

                case 4:
                    System.out.println("Exiting the system. Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
