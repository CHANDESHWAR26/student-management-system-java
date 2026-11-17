package com.sms.main;

import java.util.Scanner;

import com.sms.service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n=================================");
            System.out.println("STUDENT MANAGEMENT SYSTEM ");
            System.out.println("=================================");

            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. View Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");

            System.out.print("Choose your option: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                service.addStudent();
                break;

            case 2:
                service.updateStudent();
                break;

            case 3:
                service.viewStudents();
                break;

            case 4:
                service.deleteStudent();
                break;

            case 5:
                service.searchStudent();
                break;

            case 6:
                System.out.println("Thank You!");
                System.out.println("Exiting Student Management System...");
                running = false;
                break;

            default:
                System.out.println("Invalid Choice. Please try again.");
            }
        }

        sc.close();
    }
}