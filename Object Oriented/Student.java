package LabTask;

import java.util.Scanner;

class Student {
    int id;
    String name;
    String department;
    String courseNumber;
    double marksObtained;

    public Student(int id, String name, String department, String courseNumber, double marksObtained) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.courseNumber = courseNumber;
        this.marksObtained = marksObtained;
    }

    public void takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        this.id = sc.nextInt();

        System.out.print("Enter student name: ");
        this.name = sc.next();

        System.out.print("Enter department: ");
        this.department = sc.next();

        System.out.print("Enter course number: ");
        this.courseNumber = sc.next();

        System.out.print("Enter marks obtained: ");
        this.marksObtained = sc.nextDouble();
    }

    public boolean isPassed() {
        return this.marksObtained >= 50;
    }

    public void display() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Course number: " + this.courseNumber);
        System.out.println("Marks obtained: " + this.marksObtained);
        System.out.println("Result: " + (isPassed() ? "Passed" : "Failed"));
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "John", "Computer Science", "CS101", 78.5);
        Student s2 = new Student(2, "Jane", "Electrical Engineering", "EE201", 46.0);
        Student s3 = new Student(3, "Alice", "Mechanical Engineering", "ME301", 85.0);

        System.out.println("Student 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();

        System.out.println("\nStudent 3:");
        s3.display();

        System.out.println("\nEnter details for student 1:");
        s1.takeInput();
        System.out.println("\nUpdated details for student 1:");
        s1.display();

        System.out.println("\nEnter details for student 2:");
        s2.takeInput();
        System.out.println("\nUpdated details for student 2:");
        s2.display();

        System.out.println("\nEnter details for student 3:");
        s3.takeInput();
        System.out.println("\nUpdated details for student 3:");
        s3.display();
    }
}
