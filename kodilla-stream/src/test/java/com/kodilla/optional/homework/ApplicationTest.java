package com.kodilla.optional.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {

    static List<Student> students;
    static List<Student> studentNames;

    @BeforeAll
    public static void setUp() {
        students = new ArrayList<>();
        students.add(new Student("Marian", new Teacher("Karolina")));
        students.add(new Student("Marcin", new Teacher("Olga")));
        students.add(new Student("Ireneusz"));
        students.add(new Student("Natalia"));
        students.add(new Student("Ilona", new Teacher("Zygfryd")));

        studentNames = new ArrayList<>();
        studentNames.add(new Student("Marian"));
        studentNames.add(new Student("Marcin"));
        studentNames.add(new Student("Ireneusz"));
        studentNames.add(new Student("Natalia"));
        studentNames.add(new Student("Ilona"));
    }

    @Test
    public void shouldReturnTrueIfThisNameIsInList() {
        Boolean marcin = students.get(1).getStudentName().equals("Marcin");
        assertTrue(marcin);
    }

    @Test
    public void shouldReturnTrueIfSizeIsTheSame() {
        assertTrue(students.size() == studentNames.size());
    }

    @Test
    public void shouldReturnTrueIfNamesAreTheSame() {
        assertTrue(students.get(1).getStudentName().equals("Marcin") == studentNames.get(1).getStudentName().equals("Marcin"));
    }
}

//    @Test
//    public void shouldReturnTeacherIfExist() {
//        for(Student student : students) {
//            if(student.getTeacher() == "Optional[Undefined]") {
//                assertTrue(student.getTeacher() != null || student.getTeacher() != "Optional[Undefined]");
//            }else {
//                assertEquals(student.getTeacher(),"Optional[Undefined]");
//            }
//            System.out.println(student.getTeacher());
//        }
//    }

   /* @Test
    public void checkStudentNames() {
        if(students.get(0) != studentNames.get(0)) {
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
    */






