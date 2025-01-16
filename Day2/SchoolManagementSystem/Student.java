import java.util.*;

public class Student {
    private String name;
    private int rollNumber;
    private List<Integer> grades; 
    private int attendance; 

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
        this.attendance = 0;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public void markAttendance() {
        attendance++;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Attendance: " + attendance + " days");
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}









