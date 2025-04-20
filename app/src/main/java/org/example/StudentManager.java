package org.example;



import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("--- Student List ---");
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    public List<Student> getStudents() {
        return studentList;
    }
    
}
