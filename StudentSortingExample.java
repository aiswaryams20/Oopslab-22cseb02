/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication44;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int rollno;
    double cgpa;

    public Student(String name, int rollno, double cgpa) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollno + ", CGPA: " + cgpa;
    }
}

public class StudentSortingExample {
    public static void main(String[] args) {
        // Create an ArrayList to store student information
        ArrayList<Student> studentList = new ArrayList<>();

        // Add 20 students to the list
        studentList.add(new Student("aa", 101, 9.8));
        studentList.add(new Student("bb", 102, 8.5));
        // Add more students as needed...

        // Sort the student list based on rollno using Comparator
        Collections.sort(studentList, Comparator.comparingInt(student -> student.rollno));

        // Display the sorted student list
        System.out.println("Sorted Student List:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
