package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {

        public static List<Student> getStudentsList() {
            List<Student> studentsList = new ArrayList<>();
            studentsList.add(new Student("Marcin", null));
            studentsList.add(new Student("Michał", new Teacher("Mariola")));
            studentsList.add(new Student("Paulina", new Teacher("Felicjan")));
            studentsList.add(new Student("Beata", new Teacher("Tomasz")));
            studentsList.add(new Student("Karol", null));

            return studentsList;
        }
}
