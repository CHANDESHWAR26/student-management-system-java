package com.sms.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.sms.model.Student;

public class StudentService {

    ArrayList<Student> students = new ArrayList<Student>();

    Scanner sc = new Scanner(System.in);

    public void addStudent() {

        try {

            System.out.println("\n===== Add Student =====");

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();

            Student student = new Student(id, name, age);

            students.add(student);

            System.out.println("Student Added Successfully");

        } catch (Exception e) {

            System.out.println("Invalid Input");
            sc.nextLine();

        }
    }

    public void viewStudents() {

        if (students.isEmpty()) {

            System.out.println("No Students Found");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student student : students) {

            System.out.println(
                    "ID: " + student.getStudentId()
                    + " | Name: " + student.getStudentName()
                    + " | Age: " + student.getStudentAge());
        }
    }

    public void searchStudent() {

        try {

            System.out.print("Enter Student ID to Search: ");
            int id = sc.nextInt();

            boolean found = false;

            for (Student student : students) {

                if (student.getStudentId() == id) {

                    System.out.println("\nStudent Found");

                    System.out.println(
                            "ID: " + student.getStudentId()
                            + " | Name: " + student.getStudentName()
                            + " | Age: " + student.getStudentAge());

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {

            System.out.println("Invalid Input");
            sc.nextLine();

        }
    }


    public void updateStudent() {

        try {

            System.out.print("Enter Student ID to Update: ");
            int id = sc.nextInt();

            sc.nextLine();

            boolean found = false;

            for (Student student : students) {

                if (student.getStudentId() == id) {

                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int age = sc.nextInt();

                    student.setStudentName(name);
                    student.setStudentAge(age);

                    System.out.println("Student Updated Successfully");

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {

            System.out.println("Invalid Input");
            sc.nextLine();

        }
    }

    public void deleteStudent() {

        try {

            System.out.print("Enter Student ID to Delete: ");
            int id = sc.nextInt();

            Student studentToDelete = null;

            for (Student student : students) {

                if (student.getStudentId() == id) {

                    studentToDelete = student;
                    break;
                }
            }

            if (studentToDelete != null) {

                students.remove(studentToDelete);

                System.out.println("Student Deleted Successfully");

            } else {

                System.out.println("Student Not Found");
            }

        } catch (Exception e) {

            System.out.println("Invalid Input");
            sc.nextLine();

        }
    }
}