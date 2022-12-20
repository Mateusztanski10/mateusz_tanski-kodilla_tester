package com.kodilla.optional.homework;

import java.util.List;
import java.util.Optional;

import static com.kodilla.optional.homework.Application.getStudentsList;

public class DisplayAllStudentsAndTeachers {
    public static void main(String[] args) {

        for (Student student : getStudentsList()) {
            Optional<Student> student1 = Optional.ofNullable(student);
            System.out.println("Uczeń: " + student.getName() + ", Nauczyciel: " + student.getTeacher().getName());
            student1.ifPresentOrElse(Student::getTeacher, () -> System.out.println("<Undevined>"));
        }
    }
}
