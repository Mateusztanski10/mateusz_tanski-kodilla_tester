package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ComplexMapExample {
    public static void main(String[] args) {

        Map<Student, Grades> school = new HashMap<>();

        Student john = new Student("John", "Stevenson");
        Student jessie = new Student("Jessie", "Pinkman");
        Student bart = new Student("Bart", "Simpson");

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.0);
        doubleList.add(4.0);
        doubleList.add(4.5);
        doubleList.add(5.0);
        doubleList.add(5.0);

        List<Double> doubleList1 = new ArrayList<>();
        doubleList1.add(2.5);
        doubleList1.add(3.0);
        doubleList1.add(2.0);

        List<Double> doubleList2 = new ArrayList<>();
        doubleList2.add(4.0);
        doubleList2.add(4.0);
        doubleList2.add(4.0);
        doubleList2.add(4.0);
        doubleList2.add(5.0);

        Grades johnGrades = new Grades(doubleList);
        Grades jessieGrades = new Grades(doubleList1);
        Grades bartGrades = new Grades(doubleList2);

        school.put(john, johnGrades);
        school.put(jessie, jessieGrades);
        school.put(bart, bartGrades);
    }
}
