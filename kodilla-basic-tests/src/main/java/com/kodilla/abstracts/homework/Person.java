package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Person person = new Person("Antoni", 24, driver);
        person.displayPersonsResponsibilities();

        Soldier soldier = new Soldier();
        Person person1 = new Person("Włodzimierz", 45, soldier);
        person1.displayPersonsResponsibilities();
    }

        private String firstName;
        private int age;
        private Job job;

        public Person(String firstName, int age, Job job){
            this.firstName = firstName;
            this.age = age;
            this.job = job;
        }

        public void displayPersonsResponsibilities() {
        System.out.println("Responsibilities: " + " " + this.firstName + " is " + job.getResponsibilities() + ". His salary is: " + job.getSalary());
        }
}


