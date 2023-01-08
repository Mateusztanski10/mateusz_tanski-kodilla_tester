package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.Optional;

public class Student {

    private String studentName;
    private Optional<String> teacher;

    public Student(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = Optional.of(teacher.getName()); // this.teacher = Optional.orElse("Undefined");
    }

    public Student(String studentName) {
        this.studentName = studentName;
        this.teacher = Optional.ofNullable("Undefined");
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTeacher() {
        return String.valueOf(teacher);
    }

//    Optional<String> getTeacherName = Optional.ofNullable("Mariola");
//    if(getTeacherName.isPresent()) {
//        System.out.println(getTeacherName.get());
//    }
//
//    Optional<String> nullName = Optional.ofNullable(null);
//    if(nullName.isPresent()) {
//        System.out.println(nullName.get());
//    }else{
//        System.out.println("Undefined");
//    }
//
//    List<String> teacherNames = new ArrayList<>();
//    Optional<String> noName = teacherNames.stream().findFirst();
//
//    public static void useoptional(Optional<String> teacherNameOptional) {
//        if(teacherNameOptional.isPresent()) {
//            System.out.println("First Teacher");
//        }
//        System.out.println(teacherNameOptional.orElse("Undefined"));
//    }
}