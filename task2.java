import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks1;
    int marks2;
    int marks3;
    int total;
    double average;
    char grade;

    // Method to calculate total and average
    void calculateResults() {
        total = marks1 + marks2 + marks3;
        average = total / 3.0;

        // Grade Calculation
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    // Method to display student report
    void displayReport() {
        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Student Name   : " + name);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks Subject1 : " + marks1);
        System.out.println("Marks Subject2 : " + marks2);
        System.out.println("Marks Subject3 : " + marks3);
        System.out.println("Total Marks    : " + total);
        System.out.println("Average Marks  : " + average);
        System.out.println("Grade          : " + grade);

        if (grade == 'F') {
            System.out.println("Result         : Fail");
        } else {
            System.out.println("Result         : Pass");
        }
    }
}

public class StudentGradeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        // Input Student Details
        System.out.println("===== STUDENT GRADE MANAGEMENT SYSTEM =====");

        System.out.print("Enter Student Name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s1.rollNumber = sc.nextInt();

        // Input Marks
        System.out.print("Enter Marks for Subject 1: ");
        s1.marks1 = sc.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        s1.marks2 = sc.nextInt();

        System.out.print("Enter Marks for Subject 3: ");
        s1.marks3 = sc.nextInt();

        // Calculate Result
        s1.calculateResults();

        // Display Report
        s1.displayReport();

        sc.close();
    }
}