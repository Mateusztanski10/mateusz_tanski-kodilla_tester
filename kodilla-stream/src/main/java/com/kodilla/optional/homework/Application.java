package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Marcin"));
        studentsList.add(new Student("Michał", new Teacher("Mariola")));
        studentsList.add(new Student("Paulina", new Teacher("Felicjan")));
        studentsList.add(new Student("Beata", new Teacher("Tomasz")));
        studentsList.add(new Student("Karol"));

//        System.out.println("Students: ");
//                studentsList.stream()
//                .filter(student -> student.getStudentName().isPresent())
//                .forEach(System.out::println);
//
//
//        System.out.println("Teachers: ");
//        studentsList.stream()
//                .filter(student -> student.getTeacher())
//                .forEach(System.out::println);

        for (Student student : studentsList) {
            String teacher = student.getTeacher();
            System.out.println("Student: " + student.getStudentName() + ", Teacher: " + teacher);
        }
    }
}
